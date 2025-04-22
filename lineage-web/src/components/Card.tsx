import React from 'react';

interface CardProps {
  title: string;
  children: React.ReactNode;
}

const Card: React.FC<CardProps> = ({ title, children }) => {
  return (
    <div className="bg-white rounded-lg shadow-md p-6 m-4 max-w-md hover:shadow-lg transition-shadow duration-300">
      <h2 className="text-xl font-bold mb-4 text-gray-800">{title}</h2>
      <div className="text-gray-600">{children}</div>
    </div>
  );
};

export default Card; 