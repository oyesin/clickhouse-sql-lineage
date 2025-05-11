import React, { useEffect } from 'react';
import { XCircle } from 'lucide-react';

interface ErrorToastProps {
  message: string;
  onClose: () => void;
}

const ErrorToast: React.FC<ErrorToastProps> = ({ message, onClose }) => {
  useEffect(() => {
    const timer = setTimeout(onClose, 5000);
    return () => clearTimeout(timer);
  }, [onClose]);

  return (
    <div 
      className="fixed top-6 right-6 z-[99999] bg-red-500/95 backdrop-blur-sm text-white px-4 py-3 rounded-lg shadow-lg 
        transform transition-all duration-300 ease-in-out
        animate-slide-in-right hover:scale-[1.02] hover:shadow-xl
        border border-red-400/20"
    >
      <div className="flex items-center gap-3">
        <span className="text-sm font-medium">{message}</span>
        <button 
          className="ml-2 text-red-200 hover:text-white transition-colors duration-200
            focus:outline-none focus:ring-2 focus:ring-red-400/50 rounded-full p-1"
          onClick={onClose}
          aria-label="Close error message"
        >
          <XCircle className="w-4 h-4" />
        </button>
      </div>
    </div>
  );
};

export default ErrorToast; 