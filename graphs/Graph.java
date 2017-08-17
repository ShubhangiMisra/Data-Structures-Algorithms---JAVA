package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	ArrayList<Vertex> vertices;
	
	Graph(){
		vertices = new ArrayList<>();
	}
	
	
	public void print(){
		for(Vertex v : vertices){
			v.print();
		}
	}
	
	public void addVertex(String name){
		if(isVertexPresent(name)){
			return;
		}
		
		Vertex v = new Vertex(name);
		vertices.add(v);
	}

	public void addEdge(String name1, String name2 ){
		if( !isVertexPresent(name1) || !isVertexPresent(name2)){
			return;
		}
		if(areAdjacent(name1, name2)){
			return;
		}
		
		Vertex first = getVertex(name1);
		Vertex second = getVertex(name2);
		Edge e = new Edge(first, second);
		first.addEdge(e);
		second.addEdge(e);
	}
	
	
	public  boolean areAdjacent(String name1, String name2) {
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		
		if(v1 == null || v2== null){
			return false;
		}
		
		return v1.isAdjacent(v2);
		
	}

	
	public void removeVertex(String name){
		
		Vertex v = getVertex(name);
		if(v == null){
			return;
		}
		ArrayList<Vertex> adjacentVertices = v.getAdjacent();
		for(Vertex adj : adjacentVertices){
			adj.removeEdgeWith(v);
		}
		vertices.remove(v);
	}

	public void removeEdge(String name1, String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		if(v1 == null || v2== null){
			return ;
		}
		if(!areAdjacent(name1, name2)){
			return;
		}
		
		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
		
	}
	
	private Vertex getVertex(String name) {
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return v;
			}
		}
		return null;
	}


	private boolean isVertexPresent(String name) {
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public int numVertices(){
		return vertices.size();
	}
	
	public int numEdges(){
		int num=0;
		for(Vertex v:vertices){
			num+=v.edges.size();
		}
		
		return num/2;
				
	}
	
//	public boolean havePath(String name1,String name2){
//		Vertex v1=getVertex(name1);
//		Vertex v2=getVertex(name2);
//		if(v1==null||v2==null){
//			return false;
//		}
//		HashMap<Vertex, Boolean>visited=new HashMap<>();
//		
//	}
	
	
	
	
	
}
