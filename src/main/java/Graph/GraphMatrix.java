package Graph;

public class GraphMatrix {

    private int[][] adjMatrix;
    private int numVertices;

    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    //Add an edge between 2 vertices (for an undirected graph)
    public void addEdge(int src,int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; //Since it's an undirected graph
    }

    public void removeEdge(int src,int dest) {
        adjMatrix[src][dest] = 0;
        adjMatrix[dest][src] = 0;
    }

    public void printGraph() {
        for(int i=0; i < numVertices; i++) {
            for(int j=0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix graphMatrix= new GraphMatrix(5);

        graphMatrix.addEdge(0,1);
        graphMatrix.addEdge(0,4);
        graphMatrix.addEdge(1,2);
        graphMatrix.addEdge(1,3);
        graphMatrix.addEdge(1,4);
        graphMatrix.addEdge(2,3);
        graphMatrix.addEdge(3,4);

        graphMatrix.printGraph();

    }

}
