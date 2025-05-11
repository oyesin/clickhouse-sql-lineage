export interface Column {
  id?: string;
  name: string;
  childrenCnt?: number;
}

export interface Node {
  id?: string;
  name: string;
  columns: Column[];
}

export interface Link {
  id?: string;
  srcTable: string;
  tgtTable: string;
  u?: string;
  v?: string;
  transform?: string;
  sqlSource?: string;
  srcColumn?: string;
  tgtColumn?: string;
}

export interface LineageData {
  code: number;
  message: string;
  data: {
    nodes: Node[];
    links: Link[];
  };
}

export interface ResourceData {
  id: string;
  name: string;
  type: string;
  description?: string;
}