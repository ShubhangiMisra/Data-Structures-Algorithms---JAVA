package graphs;

public class GraphUse {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
		g.print();
		System.out.println();
//		g.removeVertex("C");
		g.print();
		System.out.println(g.numEdges());
	}

}
