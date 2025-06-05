package Graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNewList {

    private List<List<Integer>> adjList;
    private int numVertices;

    public GraphNewList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList<>();

        //Initialize each vertex adjacency list
        for(int i=0;i < numVertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    //Add edge between 2 vertices for an undirected graph
    public void addEdge(int src,int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    //remove edge between 2 vertices for an undirected graph
    public void removeEdge(int src,int dest) {
        adjList.get(src).remove(dest);
        adjList.get(dest).remove(src);
    }

    public void printGraph() {
        for(int i=0;i< numVertices;i++) {
            System.out.print("Vertex "+ i +": ");
            for (Integer edge : adjList.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphNewList graph = new GraphNewList(5);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);


        graph.printGraph();

        graph.removeEdge(0,1);
        System.out.println("\nAfter remove:");
        graph.printGraph();

    }
}
