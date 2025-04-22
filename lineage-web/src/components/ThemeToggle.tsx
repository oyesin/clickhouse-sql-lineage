import React from 'react';
import { Sun, Moon } from 'lucide-react';
import { useTheme } from '../contexts/ThemeContext';

const ThemeToggle: React.FC = () => {
  const { theme, toggleTheme } = useTheme();

  return (
    <button
      onClick={toggleTheme}
      className="p-2 rounded-md transition-colors hover:bg-slate-700 dark:hover:bg-slate-600"
    >
      {theme === 'dark' ? (
        <Sun className="w-5 h-5 text-slate-400 dark:text-slate-200" />
      ) : (
        <Moon className="w-5 h-5 text-slate-600 dark:text-slate-400" />
      )}
    </button>
  );
};

export default ThemeToggle;