package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSDFS {
    private int numVertices;
    private java.util.LinkedList<Integer>[] adjList;

    public GraphBFSDFS(int numVertices) {
        this.numVertices = numVertices;
        adjList = new java.util.LinkedList[numVertices];
        for (int i=0;i < numVertices; i++) {
            adjList[i] = new java.util.LinkedList<>();
        }
    }

    public void addEdge(int src,int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
           int vertex = queue.poll();
           System.out.println(vertex + " ");

           for(int neighbor : adjList[vertex]) {
               if(!visited[neighbor]) {
                   visited[neighbor] = true;
                   queue.add(neighbor);
               }
           }
        }
    }

    public void dfs(int startVertex) {
        boolean[] visisted = new boolean[numVertices];
        dfsRecursive(startVertex,visisted);
    }

    private void dfsRecursive(int vertext,boolean[] visited) {
        visited[vertext] = true;
        System.out.println(vertext + " ");

        for(int neighbor : adjList[vertext]) {
            if(!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphBFSDFS graphBFS = new GraphBFSDFS(6);

        graphBFS.addEdge(0,1);
        graphBFS.addEdge(0,2);
        graphBFS.addEdge(1,3);
        graphBFS.addEdge(1,4);
        graphBFS.addEdge(2,4);
        graphBFS.addEdge(3,5);
        graphBFS.addEdge(4,5);

        System.out.println("BFS starting vertex 0:");
        graphBFS.bfs(0);

        System.out.println("DFS starting vertex 0:");
        graphBFS.dfs(0);
    }








}
