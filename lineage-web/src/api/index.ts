import axios from 'axios';

const instance = axios.create({
  baseURL: '',
  timeout: 10000,
});

// 请求拦截器
instance.interceptors.request.use(
  config => {
    // 可在此添加 token 等
    return config;
  },
  error => Promise.reject(error)
);

// 响应拦截器
instance.interceptors.response.use(
  // response => {
  //   if (response.data.code === 200) {
  //     return response.data.data;
  //   } else {
  //     return Promise.reject(response.data.message);
  //   }
  // },
  response => response,
  error => {
    // 可统一处理错误
    return Promise.reject(error);
  }
);

export default instance; 