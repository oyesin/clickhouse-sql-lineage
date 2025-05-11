import React, { useEffect } from 'react';
import { CheckCircle } from 'lucide-react';

interface SuccessToastProps {
  message: string;
  onClose: () => void;
}

const SuccessToast: React.FC<SuccessToastProps> = ({ message, onClose }) => {
  useEffect(() => {
    const timer = setTimeout(() => {
      onClose();
    }, 3000);

    return () => clearTimeout(timer);
  }, [onClose]);

  return (
    <div className="fixed top-4 left-1/2 -translate-x-1/2 z-50 animate-slide-in-top">
      <div className="flex items-center gap-2 bg-green-50 text-green-800 px-4 py-3 rounded-lg shadow-lg border border-green-200">
        <CheckCircle className="w-5 h-5 text-green-500" />
        <span>{message}</span>
        <button
          onClick={onClose}
          className="ml-2 text-green-600 hover:text-green-800"
          aria-label="关闭"
        >
          ×
        </button>
      </div>
    </div>
  );
};

export default SuccessToast; 