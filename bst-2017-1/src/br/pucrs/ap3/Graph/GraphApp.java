package br.pucrs.ap3.Graph;

public class GraphApp {
	public static void main(String[] args) {
		Graph g = new Graph(4);
		//Todo incluir sete arestas
		//1 -> 2
		//1 <- 2
		
		//g.addEdge(1, 2);
		//g.addEdge(1, 5);
		
	//	g.addEdge(2, 3);
	//	g.addEdge(2, 4);
	//	g.addEdge(2, 5);
	//	g.addEdge(3, 4);
	//	g.addEdge(4, 5);
		
	//========= G1 5 nodos ===================
		//g.addEdge(1, 2);
	//	g.addEdge(1, 3);
		
	//	g.addEdge(2, 4);
	//	g.addEdge(2, 5);
		
	//========= G2 4 nodos ===================
		g.addEdge(1, 2);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		
	//========= G3 4 nodos ===================	
		
		System.out.println(g);
		//System.out.println(g.getNext(2));
		//System.out.println(g.getNext(5));
		System.out.println(g.breadth(2));
		
	}
}
