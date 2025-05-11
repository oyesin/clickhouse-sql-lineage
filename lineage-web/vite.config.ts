import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  optimizeDeps: {
    exclude: ['lucide-react'],
  },
  server: {
    proxy: {
      '/lineage': {
        target: 'http://localhost:8080',
        changeOrigin: false,
        rewrite: path => path.replace(/^\/lineage/, '/lineage'),
      },
    },
  },
});
