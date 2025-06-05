package Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import static Graph.GraphAdjList.getAdjVertices;

public class DFS {

    public static void dfsTraversal(String start) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if(!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.println(vertex + " ");
                for(String v : getAdjVertices(vertex)) {
                    if(!visited.contains(v)) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList();

       graph.addVertex("a");
       graph.addVertex("b");
       graph.addVertex("c");

       graph.addEdge("a","b");
        graph.addEdge("a","c");
        graph.addEdge("b","c");

        dfsTraversal("c");
    }
}
