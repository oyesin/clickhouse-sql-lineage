import React, { useState } from 'react';
import { Code2, Play } from 'lucide-react';
import CodeMirror from '@uiw/react-codemirror';
import { sql } from '@codemirror/lang-sql';
import { format } from 'sql-formatter';
import { oneDark } from '@codemirror/theme-one-dark';

interface SQLPanelProps {
  onAnalyze: (sql: string) => void;
  theme: 'dark' | 'light';
}

const SQLPanel: React.FC<SQLPanelProps> = ({ onAnalyze, theme }) => {
  const [sqlInput, setSqlInput] = useState('');

  const handleFormat = () => {
    try {
      const formatted = format(sqlInput);
      setSqlInput(formatted);
    } catch (error) {
      console.error('SQL formatting error:', error);
    }
  };

  return (
    <div className={`h-full flex flex-col ${theme === 'dark' ? 'bg-slate-900' : 'bg-white'}`}>
      <div className={`p-4 border-b ${theme === 'dark' ? 'border-slate-700 bg-slate-800' : 'border-slate-200 bg-slate-50'} flex items-center justify-between`}>
        <div className="flex items-center gap-2">
          <Code2 className={`w-5 h-5 ${theme === 'dark' ? 'text-indigo-400' : 'text-indigo-600'}`} />
          <h2 className={`font-semibold ${theme === 'dark' ? 'text-slate-200' : 'text-slate-800'}`}>SQL Editor</h2>
        </div>
        <div className="flex gap-2">
          <button
            onClick={handleFormat}
            className={`px-3 py-1.5 text-sm rounded-md transition-colors ${
              theme === 'dark' 
                ? 'text-slate-200 bg-slate-700 hover:bg-slate-600' 
                : 'text-slate-700 bg-slate-100 hover:bg-slate-200'
            }`}
          >
            Format
          </button>
          <button
            onClick={() => onAnalyze(sqlInput)}
            className="px-3 py-1.5 text-sm text-white bg-indigo-500 hover:bg-indigo-600 rounded-md transition-colors flex items-center gap-1"
          >
            <Play className="w-4 h-4" />
            Analyze
          </button>
        </div>
      </div>
      <div className="flex-1 p-4">
        <CodeMirror
          value={sqlInput}
          height="100%"
          theme={oneDark}
          extensions={[sql()]}
          onChange={setSqlInput}
          className={`h-full rounded-lg overflow-hidden [&_.cm-editor]:${theme === 'dark' ? 'bg-slate-800' : 'bg-slate-50'} [&_.cm-editor]:rounded-lg`}
        />
      </div>
    </div>
  );
};

export default SQLPanel;