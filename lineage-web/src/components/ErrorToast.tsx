import React, { useEffect } from 'react';
import { XCircle } from 'lucide-react';

interface ErrorToastProps {
  message: string;
  onClose: () => void;
}

const ErrorToast: React.FC<ErrorToastProps> = ({ message, onClose }) => {
  useEffect(() => {
    const timer = setTimeout(() => {
      onClose();
    }, 3000);

    return () => clearTimeout(timer);
  }, [onClose]);

  return (
    <div className="fixed top-4 left-1/2 -translate-x-1/2 z-50 animate-slide-in-top">
      <div className="flex items-center gap-2 bg-red-50 text-red-800 px-4 py-3 rounded-lg shadow-lg border border-red-200">
        <XCircle className="w-5 h-5 text-red-500" />
        <span>{message}</span>
        <button
          onClick={onClose}
          className="ml-2 text-red-600 hover:text-red-800"
          aria-label="关闭"
        >
          ×
        </button>
      </div>
    </div>
  );
};

export default ErrorToast; 