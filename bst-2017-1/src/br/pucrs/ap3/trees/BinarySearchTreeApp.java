package br.pucrs.ap3.trees;

public class BinarySearchTreeApp {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Teste da BST");
		System.out.println(bst);
		System.out.println(bst.size());
		bst.add(10);
		System.out.println(bst);
		System.out.println(bst.size());
		bst.reportLevel();
		System.out.println("Teste da altura da arvore");
		bst.reportHeight();
		System.out.println("Grau do nodo raiz");
		bst.reportDegree();
		bst.add(20);
		//System.out.println(bst);
		//System.out.println(bst.size());
		//bst.reportHeight();
		//bst.reportDegree();
		System.out.println("Grau do nodo raiz com um filho");
		bst.reportDegree();
		bst.add(5);
		//System.out.println(bst);
		//System.out.println(bst.size());
		//bst.reportHeight();
		//bst.reportDegree();
		System.out.println("Grau do nodo raiz com dois filho");
		bst.reportDegree();
		
		
		
	}
}
