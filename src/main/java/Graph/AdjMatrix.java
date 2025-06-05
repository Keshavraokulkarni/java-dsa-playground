package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class AdjMatrix
{
 // int[][] adjMatrix; using Array
  private LinkedList<Integer>[] adj;
  private int V;
  private int E;

  public AdjMatrix(int node) {
  //  this.adjMatrix=new int[node][node];
    this.V =node;
    this.E = 0;
    this.adj = new LinkedList[node];
    for(int i=0;i<V;i++)
    {
      adj[i] = new LinkedList<>();
    }

  }

  public void addEdge(int u,int v) {
   // this.adjMatrix[u][v]=1;
   // this.adjMatrix[v][u]=1;
    adj[u].add(v);
    adj[v].add(u);
    E++;
  }

  public String toString() {
    StringBuilder sb=new StringBuilder();
    sb.append(V + " Vertices, "+ E + " edges "+ "\n");
    for(int i=0;i<V;i++) {
      sb.append(i + ": ");
      for(int w: adj[i]) {
        sb.append(w + " ");
      }
    /*  for(int w: adjMatrix[i]) {
        sb.append(w + " ");
      } */
      sb.append("\n");
    }
    return sb.toString();
  }

  public void bfs(int s) {
    boolean[] visited=new boolean[V];

    Queue<Integer> q=new LinkedList<>();
    visited[s] = true;
    q.offer(s);

    while (!q.isEmpty()) {
      int u=q.poll();
      System.out.println(u+ " ");

      for(int v: adj[u]) {
        if(!visited[v]) {
          visited[v] = true;
          q.offer(v);
        }
      }
    }
  }


  public static void main(String[] args) {
    AdjMatrix matrix=new AdjMatrix(5);
    matrix.addEdge(0,1);
    matrix.addEdge(1,2);
    matrix.addEdge(2,3);
    matrix.addEdge(3,0);
    matrix.addEdge(2,4);
    //System.out.println(matrix);
    matrix.bfs(0);
  }
}
