import { useEffect, useState } from 'react';
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
import { createResource, fetchFields } from './api/lineage';
import { Node, Link, LineageData, ResourceData } from './types';
import ErrorToast from './components/ErrorToast';

const nodeTypes = {
  tableNode: TableNode,
};

function App({ isTransition }: { isTransition?: boolean } = {}) {
  const { theme } = useTheme();
  const [nodes, setNodes, onNodesChange] = useNodesState([]);
  const [edges, setEdges, onEdgesChange] = useEdgesState([]);
  const [resourceData, setResourceData] = useState<ResourceData[]>([]);
  const [lineageData, setLineageData] = useState<LineageData | null>(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  const handleAnalyze = async (sql: string) => {
    console.log('sql', sql);
    setLoading(true);
    setError(null);
    try {
      const data = await fetchFields(sql, resourceData);
      console.log('data', data);
      setLineageData(data);
    } catch (err: unknown) {
      if (err instanceof Error) {
        setError(err.message || '分析失败');
      } else {
        setError('分析失败');
      }
    } finally {
      setLoading(false);
    }
  };

  const handleCreateResource = async (sql: string) => {
    console.log('sql', sql);
    setLoading(true);
    setError(null);
    try {
      const data = await createResource(sql);
      console.log('data', data);
      setResourceData([...data.data]);
    } catch (err: unknown) {
      if (err instanceof Error) {
        setError(err.message || '分析失败');
      } else {
        setError('分析失败');
      }
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    if (!lineageData) return;
    const graph = lineageData.data;
    const nodeLevels = new Map<string, number>();
    const calculateNodeLevel = (nodeName: string, visited = new Set<string>()): number => {
      if (visited.has(nodeName)) return 0;
      if (nodeLevels.has(nodeName)) return nodeLevels.get(nodeName)!;
      visited.add(nodeName);
      const incomingLinks = graph.links.filter(link => link.tgtTable === nodeName);
      if (incomingLinks.length === 0) {
        nodeLevels.set(nodeName, 0);
        return 0;
      }
      const maxLevel = Math.max(
        ...incomingLinks.map(link => calculateNodeLevel(link.srcTable, visited))
      );
      const level = maxLevel + 1;
      nodeLevels.set(nodeName, level);
      return level;
    };

    graph.links.forEach(item => {
      item.srcColumn = item.srcTable + item.srcColumn;
      item.tgtColumn = item.tgtTable + item.tgtColumn;
      item.id = item.srcTable + item.srcColumn + item.tgtTable + item.tgtColumn;
    })
    graph.nodes.forEach(node => calculateNodeLevel(node.name));
    const flowNodes: FlowNode[] = graph.nodes.map((node: Node) => {
      const columns = node.columns.map(column => ({
        id: node.name + column,
        name: column,
        childrenCnt: 0
      }));

      const level = nodeLevels.get(node.name) || 0;
      const xPosition = 50 + level * 400;
      const yPosition = 50 + level * 20;
      return {
        id: node.name,
        type: 'tableNode',
        position: { x: xPosition, y: yPosition },
        data: { 
          node: {
            ...node,
            columns
          },
          links: graph.links,
          theme
        },
      };
    });
    const flowEdges: Edge[] = graph.links.map((link: Link) => ({
      id: link.id || `${link.srcTable}-${link.tgtTable}`,
      source: link.srcTable,
      target: link.tgtTable,
      sourceHandle: link.srcColumn || null,
      targetHandle: link.tgtColumn || null,
      animated: true,
      style: { 
        stroke: theme === 'dark' ? '#6366f1' : '#4f46e5',
        strokeWidth: 2 
      },
      data: { transform: link.transform },
    }));

    setNodes(flowNodes);
    setEdges(flowEdges);
  }, [setNodes, setEdges, theme, lineageData]);

  return (
    <div className={`flex h-screen ${theme === 'dark' ? 'bg-slate-900' : 'bg-slate-50'}${isTransition ? ' pointer-events-none select-none' : ''}`}>
      <div className={`w-1/3 border-r ${theme === 'dark' ? 'border-slate-700' : 'border-slate-200'}`}>
        <SQLPanel onAnalyze={handleAnalyze} onCreateResource={handleCreateResource} theme={theme} analyzeDisabled={loading} />
        {error && <ErrorToast message={error} onClose={() => setError(null)} />}
      </div>
      <div className="w-2/3 relative">
        {loading && (
          <div className="absolute inset-0 z-20 flex items-center justify-center bg-black/30">
            <div className="animate-spin rounded-full h-12 w-12 border-t-2 border-b-2 border-indigo-500"></div>
          </div>
        )}
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