import React, { useCallback, useEffect } from 'react';
import ReactFlow, {
  MiniMap,
  Controls,
  Background,
  useNodesState,
  useEdgesState,
  Node as FlowNode,
  Edge,
} from 'reactflow';
import 'reactflow/dist/style.css';

import TableNode from './components/TableNode';
import SQLPanel from './components/SQLPanel';
import ThemeToggle from './components/ThemeToggle';
import { useTheme } from './contexts/ThemeContext';
import lineageData from './data.json';
import { Node, Link } from './types';

const nodeTypes = {
  tableNode: TableNode,
};

function App() {
  const { theme } = useTheme();
  const [nodes, setNodes, onNodesChange] = useNodesState([]);
  const [edges, setEdges, onEdgesChange] = useEdgesState([]);

  const handleAnalyze = (sql: string) => {
    console.log('Analyzing SQL:', sql);
  };

  useEffect(() => {
    const graph = lineageData.data.lineageGraph;
    
    const nodeLevels = new Map<string, number>();
    
    const calculateNodeLevel = (nodeId: string, visited = new Set<string>()): number => {
      if (visited.has(nodeId)) return 0;
      if (nodeLevels.has(nodeId)) return nodeLevels.get(nodeId)!;
      
      visited.add(nodeId);
      
      const incomingLinks = graph.links.filter(link => link.relV === nodeId);
      
      if (incomingLinks.length === 0) {
        nodeLevels.set(nodeId, 0);
        return 0;
      }
      
      const maxLevel = Math.max(
        ...incomingLinks.map(link => calculateNodeLevel(link.relU, visited))
      );
      
      const level = maxLevel + 1;
      nodeLevels.set(nodeId, level);
      return level;
    };
    
    graph.nodes.forEach(node => calculateNodeLevel(node.id));
    
    const flowNodes: FlowNode[] = graph.nodes.map((node: Node) => {
      const level = nodeLevels.get(node.id) || 0;
      const xPosition = 50 + level * 400;
      const yPosition = 50 + level * 20;

      return {
        id: node.id,
        type: 'tableNode',
        position: { x: xPosition, y: yPosition },
        data: { 
          node,
          links: graph.links,
          theme
        },
      };
    });

    const flowEdges: Edge[] = graph.links.map((link: Link) => ({
      id: link.id,
      source: link.relU,
      target: link.relV,
      sourceHandle: link.u,
      targetHandle: link.v,
      animated: true,
      style: { 
        stroke: theme === 'dark' ? '#6366f1' : '#4f46e5',
        strokeWidth: 2 
      },
      data: { transform: link.transform },
    }));

    setNodes(flowNodes);
    setEdges(flowEdges);
  }, [setNodes, setEdges, theme]);

  return (
    <div className={`flex h-screen ${theme === 'dark' ? 'bg-slate-900' : 'bg-slate-50'}`}>
      <div className={`w-1/3 border-r ${theme === 'dark' ? 'border-slate-700' : 'border-slate-200'}`}>
        <SQLPanel onAnalyze={handleAnalyze} theme={theme} />
      </div>
      <div className="w-2/3 relative">
        <div className="absolute top-4 right-4 z-10">
          <ThemeToggle />
        </div>
        <ReactFlow
          nodes={nodes}
          edges={edges}
          onNodesChange={onNodesChange}
          onEdgesChange={onEdgesChange}
          nodeTypes={nodeTypes}
          fitView
          className={theme === 'dark' ? 'bg-slate-900' : 'bg-slate-50'}
        >
          <Background 
            color={theme === 'dark' ? '#475569' : '#94a3b8'} 
            gap={24} 
          />
          <Controls 
            className={`
              ${theme === 'dark' ? 'bg-slate-800 border-slate-700' : 'bg-white border-slate-200'}
              [&>button]:${theme === 'dark' ? 'border-slate-700 bg-slate-800 hover:bg-slate-700' : 'border-slate-200 bg-white hover:bg-slate-100'}
            `}
          />
          <MiniMap 
            className={`
              ${theme === 'dark' ? 'bg-slate-800' : 'bg-white'} 
              [&>svg]:${theme === 'dark' ? 'bg-slate-900' : 'bg-slate-50'}
            `}
          />
        </ReactFlow>
      </div>
    </div>
  );
}

export default App;