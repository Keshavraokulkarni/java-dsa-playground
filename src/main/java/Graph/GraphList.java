package Graph;

import java.util.LinkedList;
import java.util.List;

class GraphList {
    private List<List<Integer>> adjList;  // Adjacency list
    private int numVertices;              // Number of vertices

    // Constructor to initialize the graph
    public GraphList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList<>();

        // Initialize each vertex's adjacency list
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Add an edge between two vertices (for an undirected graph)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);  // Since it's an undirected graph
    }

    // Print the adjacency list
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer edge : adjList.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphList graph = new GraphList(5);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph (Adjacency List)
        graph.printGraph();
    }
}

