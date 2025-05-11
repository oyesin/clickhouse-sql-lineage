import instance from './index';
import { ResourceData } from '../types';

export async function createResource(sql: string) {
  try {
    const res = await instance.post('/lineage/parse/create', { createSqlList: sql });
    return res.data;
  } catch (error: unknown) {
    if (typeof error === 'object' && error !== null && 'isAxiosError' in error) {
      const err = error as { response?: { data?: { message?: string } } };
      throw new Error(err.response?.data?.message || '网络请求错误');
    }
    throw new Error('未知错误');
  }
} 

export async function fetchFields(singleSql: string, tableMetas: ResourceData[]) {
  try {
    const res = await instance.post('/lineage/parse/field', { singleSql, tableMetas });
    return res.data;
  } catch (error: unknown) {
    if (typeof error === 'object' && error !== null && 'isAxiosError' in error) {
      const err = error as { response?: { data?: { message?: string } } };
      throw new Error(err.response?.data?.message || '网络请求错误');
    }
    throw new Error('未知错误');
  }
} 