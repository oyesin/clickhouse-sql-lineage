import { memo } from 'react';
import { Handle, Position } from 'reactflow';
import { Database } from 'lucide-react';
import { Node, Link } from '../types';

interface TableNodeProps {
  data: {
    node: Node;
    links: Link[];
    theme: 'dark' | 'light';
  };
}

const TableNode = memo(({ data }: TableNodeProps) => {
  const { node, links, theme } = data;

  const getColumnConnections = (columnId: string) => {
    const asSource = links.find(link => link.srcColumn === columnId);
    const asTarget = links.find(link => link.tgtColumn === columnId);
    return { asSource, asTarget };
  };

  const baseClasses = theme === 'dark'
    ? 'bg-slate-800 border-slate-700 shadow-slate-900/50'
    : 'bg-white border-slate-200 shadow-slate-200/50';

  return (
    <div className={`backdrop-blur-sm rounded-lg shadow-lg p-4 min-w-[250px] border table-node ${baseClasses}`}>
      <div className={`flex items-center gap-2 mb-3 pb-2 border-b ${theme === 'dark' ? 'border-slate-700' : 'border-slate-200'}`}>
        <Database className={`w-5 h-5 ${theme === 'dark' ? 'text-indigo-400' : 'text-indigo-600'}`} />
        <span className={`font-semibold ${theme === 'dark' ? 'text-slate-200' : 'text-slate-800'}`}>
          {node.name}
        </span>
      </div>
      
      <div className="space-y-1">
        {node.columns.map((column) => {
          const { asSource, asTarget } = column.id ? getColumnConnections(column.id) : { asSource: undefined, asTarget: undefined };
          const isLinked = asSource || asTarget;

          return (
            <div
              key={column.id}
              className={`text-sm flex items-center justify-between py-1 ${
                isLinked 
                  ? theme === 'dark' ? 'text-indigo-400 font-medium' : 'text-indigo-600 font-medium'
                  : theme === 'dark' ? 'text-slate-400' : 'text-slate-600'
              }`}
            >
              <span>{column.name}</span>
              <div className="flex items-center gap-2">
                {asSource && (
                  <Handle
                    type="source"
                    position={Position.Right}
                    id={column.id}
                    className={`w-2 h-2 !bg-${theme === 'dark' ? 'indigo-400' : 'indigo-600'}`}
                    style={{ top: 'auto' }}
                  />
                )}
                {asTarget && (
                  <Handle
                    type="target"
                    position={Position.Left}
                    id={column.id}
                    className={`w-2 h-2 !bg-${theme === 'dark' ? 'indigo-400' : 'indigo-600'}`}
                    style={{ top: 'auto' }}
                  />
                )}
                {(column.childrenCnt ?? 0) > 0 && (
                  <span className={`text-xs px-2 py-0.5 rounded-full ${
                    theme === 'dark' 
                      ? 'bg-slate-700 text-indigo-400' 
                      : 'bg-slate-100 text-indigo-600'
                  }`}>
                    {column.childrenCnt}
                  </span>
                )}
              </div>
            </div>
          );
        })}
      </div>
    </div>
  );
});

TableNode.displayName = 'TableNode';

export default TableNode;