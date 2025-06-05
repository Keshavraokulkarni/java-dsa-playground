package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphAdjList
{
    private static Map<String, List<String>> adjList = new HashMap<>();

    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String src,String dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public static List<String> getAdjVertices(String vertex) {
        return adjList.get(vertex);
    }
}
