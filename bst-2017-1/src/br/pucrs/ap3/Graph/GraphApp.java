package br.pucrs.ap3.Graph;

public class GraphApp {
	public static void main(String[] args) {
		Graph g = new Graph(5);
		//Todo incluir sete arestas
		//1 -> 2
		//1 <- 2
		
		g.addEdge(1, 2);
		g.addEdge(1, 5);
		
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		
		System.out.println(g);
		System.out.println(g.getNext(2));
		
	}
}
