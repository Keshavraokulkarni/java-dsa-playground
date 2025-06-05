package Graph;

import java.util.LinkedList;
import java.util.List;

public class WeightedGraph {
    class Edge {
        int vertex;
        int weight;

        public Edge(int vertex,int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    private List<List<Edge>> adjList;
    private int numVertices;

    public WeightedGraph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList<>();

        for (int i=0; i < numVertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addEdge(int src,int dest,int weight) {
        adjList.get(src).add(new Edge(dest,weight));
        adjList.get(dest).add(new Edge(src,weight)); //for undirected graph

    }

    public void printGraph() {
        for(int i=0; i < numVertices; i++) {
            System.out.println("Vertex " + i + ": ");
            for( Edge edge : adjList.get(i)) {
                System.out.println(" -> "+ edge.vertex + " (weight " + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(5);
        graph.addEdge(0,1,4);
        graph.addEdge(0,2,3);
        graph.addEdge(1,2,1);
        graph.addEdge(1,3,2);
        graph.addEdge(2,3,4);
        graph.addEdge(3,4,5);

        graph.printGraph();
    }
}
