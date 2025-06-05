package Graph;

import java.util.Arrays;

class GraphMatrix2 {
    private int[][] adjMatrix;
    private int vertices;

    public GraphMatrix2(int size) {
        vertices = size;
        adjMatrix = new int[size][size];
    }

    public void addEdge(int src, int dest, int weight) {
        adjMatrix[src][dest] = weight;
        adjMatrix[dest][src] = weight; // Remove for directed graph
    }

    public void printGraph() {
        for (int[] row : adjMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        GraphMatrix2 graph = new GraphMatrix2(4);
        graph.addEdge(1,2,10);
        graph.addEdge(2,3,20);
        graph.addEdge(3,0,30);
       // graph.addEdge(4,5,40);

        graph.printGraph();
    }
}

