import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import Card from './components/Card'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="min-h-screen bg-gray-100 flex flex-col items-center justify-center p-4">
      <h1 className="text-4xl font-bold mb-8 text-blue-600">Lineage Web</h1>
      
      <div className="flex flex-wrap justify-center">
        <Card title="React + TypeScript">
          <p className="mb-4">
            Modern web application built with React and TypeScript.
          </p>
          <div className="flex justify-center space-x-4">
            <a href="https://vite.dev" target="_blank" rel="noopener noreferrer" className="flex items-center hover:text-blue-500">
              <img src={viteLogo} className="h-6 w-6 mr-2" alt="Vite logo" />
              <span>Vite</span>
            </a>
            <a href="https://react.dev" target="_blank" rel="noopener noreferrer" className="flex items-center hover:text-blue-500">
              <img src={reactLogo} className="h-6 w-6 mr-2 spin-animation" alt="React logo" />
              <span>React</span>
            </a>
          </div>
        </Card>
        
        <Card title="Tailwind CSS">
          <p className="mb-4">
            Styled with Tailwind CSS for rapid UI development.
          </p>
          <button 
            onClick={() => setCount((count) => count + 1)}
            className="px-4 py-2 bg-blue-500 text-white rounded hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
          >
            Count is {count}
          </button>
        </Card>
      </div>
    </div>
  )
}

export default App
