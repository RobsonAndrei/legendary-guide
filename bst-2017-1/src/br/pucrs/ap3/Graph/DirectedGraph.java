package br.pucrs.ap3.Graph;

public class DirectedGraph extends AbstractGraph {

	public DirectedGraph(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEdge(int i, int j, int value) {
		// TODO Auto-generated method stub
		checkNode(i);
		checkNode(j);
		m[i][j] = value;
		m[j][i] = value;
		
	}

}
