export interface Column {
  id: string;
  name: string;
  childrenCnt: number;
}

export interface Node {
  id: string;
  name: string;
  columns: Column[];
  hasUpstream: boolean;
  hasDownstream: boolean;
  tableIcon: string | null;
  childrenCnt: number;
}

export interface Link {
  id: string;
  relU: string;
  relV: string;
  u?: string;
  v?: string;
  transform?: string;
  sqlSource?: string;
}

export interface LineageGraph {
  nodes: Node[];
  links: Link[];
}

export interface LineageData {
  code: number;
  message: string;
  data: {
    lineageGraph: LineageGraph;
  };
}