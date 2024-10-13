package ds.graphs.adjlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AdjacencyListGraph {

    private final Map<Integer, List<Node>> adjacencyList = new HashMap<>();

    public AdjacencyListGraph(final List<Edge> edges) {
        for (Edge edge : edges) {
            adjacencyList
                .computeIfAbsent(edge.getSource(), x -> new ArrayList<>())
                .add(new Node(edge.getDestination(), edge.getWeight()));
        }
    }

    public Map<Integer, List<Node>> getAdjacencyList() {
        return this.adjacencyList;
    }

    public void printGraph() {
        adjacencyList.forEach((key, nodes) -> {
            System.out.print("Vertex " + key + ":");
            nodes.forEach(node -> System.out.print(" -> " + node.getValue() + " (Weight: " + node.getWeight() + ")"));
            System.out.println();
        });
    }
}
