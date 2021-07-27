package asa;
	import java.util.*;
	public class matrixgraph {
		int vertices;
		LinkedList<Integer> Adjacencymatrixture[];
		public matrixgraph(int vertices) {
			this.vertices = vertices;
			Adjacencymatrixture = new LinkedList[vertices];
			for(int i = 0; i< vertices;i++) {
				Adjacencymatrixture[i] = new LinkedList<>();
				for(int position = 0; position < 5; position++) {
					Adjacencymatrixture[i].add(0); // here we have 5x5 matrix filled with zeros
				}
				
			}
		
			
		}
	boolean hasEdge(int vertex1, int vertex2) {
		return Adjacencymatrixture[vertex1].contains(vertex2);
	}

	void addEdge(int vertex1, int vertex2) {
		Adjacencymatrixture[vertex1].remove(vertex2);
		Adjacencymatrixture[vertex1].add(vertex2, 1);
		Adjacencymatrixture[vertex2].remove(vertex1);
		Adjacencymatrixture[vertex2].add(vertex1, 1);
		
		
	}
	void displayMatrix() {
		System.out.println("  0  1  2  3  4");
		System.out.println("_______________");
		for(int i = 0; i < vertices; i++) {
			if(Adjacencymatrixture[i].size()>-1) {
				System.out.print(i+ "|");
				for(int j=0; j<Adjacencymatrixture[i].size();j++) {
					System.out.print(Adjacencymatrixture[i].get(j) + "  ");
				}
				System.out.println();
			}
			
			
			
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 5;
		matrixgraph matrix = new matrixgraph(x);
		
		matrix.addEdge(0, 1);
		matrix.addEdge(1, 2);
		matrix.addEdge(2, 3);
		matrix.addEdge(3, 4);
		System.out.println("This is your current Adjacency Matrix Structure for the graph");
		System.out.println(" ");

		matrix.displayMatrix();

		for(int i = 0; i < x; i++) {
			System.out.println("Input a vertice to connect a new edge to Vertice: " + i);
			
			int y = scan.nextInt();
			matrix.addEdge(i, y);
		}
		System.out.println("This is your new Adjacency Matrix for the graph:");
		System.out.println(" ");
		
		matrix.displayMatrix();
		
		
		
		
		
		
	}
	}



