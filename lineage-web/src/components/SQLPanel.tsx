import React, {useState} from 'react';
import {Code2, HelpCircle, Play} from 'lucide-react';
import CodeMirror from '@uiw/react-codemirror';
import {sql} from '@codemirror/lang-sql';
import {format} from 'sql-formatter';
import {oneDark} from '@codemirror/theme-one-dark';
import Joyride, {CallBackProps, STATUS, Step} from 'react-joyride';

interface SQLPanelProps {
  onAnalyze: (sql: string) => void;
  onCreateResource: (sql: string) => Promise<void>;
  theme: 'dark' | 'light';
  analyzeDisabled?: boolean;
  onError?: (error: string) => void;
}

const SQLPanel: React.FC<SQLPanelProps> = ({ 
  onAnalyze, 
  onCreateResource, 
  theme, 
  analyzeDisabled,
  onError 
}) => {
  const [sqlInput, setSqlInput] = useState('');
  const [hasCreatedResource, setHasCreatedResource] = useState(false);
  const [runTour, setRunTour] = useState(false);

  const steps: Step[] = [
    {
      target: 'body',
        content: '欢迎使用 ClickHouse SQL 血缘解析工具！让我们来了解一下基本功能。',
      placement: 'center',
    },
    {
      target: '.sql-editor',
      content: '在这里输入您的 SQL 语句，支持语法高亮和自动补全',
      placement: 'bottom',
    },
    {
      target: '.format-button',
      content: '点击此按钮可以格式化您的 SQL 语句，使其更易读',
      placement: 'left',
    },
    {
      target: '.create-resource-button',
        content: '首先点击此按钮添加表元数据，这是解析血缘关系的第一步',
      placement: 'left',
    },
    {
      target: '.analyze-button',
        content: '添加元数据后，输入新的 SQL 语句，然后点击此按钮解析血缘关系',
      placement: 'left',
    },
  ];

  const handleJoyrideCallback = (data: CallBackProps) => {
    const { status } = data;
    if (status === STATUS.FINISHED || status === STATUS.SKIPPED) {
      setRunTour(false);
    }
  };

  const handleFormat = () => {
    try {
      const formatted = format(sqlInput);
      setSqlInput(formatted);
    } catch (error) {
      console.error('SQL formatting error:', error);
    }
  };

  const validateSql = (sql: string): boolean => {
    const trimmedSql = sql.trim();
    if (!trimmedSql) {
      onError?.('SQL 语句不能为空');
      return false;
    }
    return true;
  };

  const handleCreateResource = async () => {
    if (!validateSql(sqlInput)) {
      return;
    }

    try {
      await onCreateResource(sqlInput);
      setSqlInput('');
      setHasCreatedResource(true);
    } catch (error) {
      setHasCreatedResource(false);
    }
  };

  const handleAnalyze = () => {
    if (!validateSql(sqlInput)) {
      return;
    }
    onAnalyze(sqlInput);
    setHasCreatedResource(false);
  };

  return (
    <div className={`h-full flex flex-col ${theme === 'dark' ? 'bg-slate-900' : 'bg-white'}`}>
      <Joyride
        callback={handleJoyrideCallback}
        continuous
        hideCloseButton
        run={runTour}
        scrollToFirstStep
        showProgress
        showSkipButton
        steps={steps}
        styles={{
          options: {
            primaryColor: '#6366f1',
            zIndex: 10000,
            arrowColor: theme === 'dark' ? '#1e293b' : '#ffffff',
          },
          tooltip: {
            backgroundColor: theme === 'dark' ? '#1e293b' : '#ffffff',
            color: theme === 'dark' ? '#e2e8f0' : '#1e293b',
          },
        }}
        locale={{
          back: '上一步',
          close: '关闭',
          last: '完成',
          next: '下一步',
          skip: '跳过'
        }}
      />
      <div className={`p-4 border-b ${theme === 'dark' ? 'border-slate-700 bg-slate-800' : 'border-slate-200 bg-slate-50'} flex items-center justify-between`}>
        <div className="flex items-center gap-2">
          <Code2 className={`w-5 h-5 ${theme === 'dark' ? 'text-indigo-400' : 'text-indigo-600'}`} />
            <h2 className={`font-semibold ${theme === 'dark' ? 'text-slate-200' : 'text-slate-800'}`}>ClickHouse血缘解析</h2>
        </div>
        <div className="flex items-center gap-2">
          <button
            onClick={() => {
              console.log('Tour button clicked');
              setRunTour(true);
            }}
            className={`p-1.5 rounded-md transition-colors ${
              theme === 'dark' 
                ? 'text-slate-200 hover:bg-slate-700' 
                : 'text-slate-700 hover:bg-slate-100'
            }`}
            title="查看使用指南"
          >
            <HelpCircle className="w-5 h-5" />
          </button>
          <button
            onClick={handleFormat}
            className={`px-3 py-1.5 text-sm rounded-md transition-colors format-button ${
              theme === 'dark' 
                ? 'text-slate-200 bg-slate-700 hover:bg-slate-600' 
                : 'text-slate-700 bg-slate-100 hover:bg-slate-200'
            }`}
          >
            格式化
          </button>
          <button
            onClick={handleCreateResource}
            className={`px-3 py-1.5 text-sm text-white bg-indigo-500 hover:bg-indigo-600 rounded-md transition-colors flex items-center gap-1 create-resource-button ${
              hasCreatedResource ? 'opacity-50 cursor-not-allowed' : ''
            }`}
            disabled={analyzeDisabled || hasCreatedResource}
          >
              添加元数据
          </button>
          <button
            onClick={handleAnalyze}
            className={`px-3 py-1.5 text-sm text-white bg-indigo-500 hover:bg-indigo-600 rounded-md transition-colors flex items-center gap-1 analyze-button ${
              !hasCreatedResource ? 'opacity-50 cursor-not-allowed' : ''
            }`}
            disabled={analyzeDisabled || !hasCreatedResource}
          >
            <Play className="w-4 h-4" />
              解析
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
          className={`h-full rounded-lg overflow-hidden sql-editor [&_.cm-editor]:${theme === 'dark' ? 'bg-slate-800' : 'bg-slate-50'} [&_.cm-editor]:rounded-lg`}
        />
      </div>
    </div>
  );
};

export default SQLPanel;