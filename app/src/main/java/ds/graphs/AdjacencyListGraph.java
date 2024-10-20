package ds.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Class representing a graph using an adjacency list. 
 * This structure is useful for sparse graphs.
 */
public class AdjacencyListGraph implements Graph {


    private final Map<Integer, List<Node>> adjacencyList;


    /**
     * Constructs a graph from a list of edges.
     *
     * @param edges the list of edges to construct the graph
     */
    public AdjacencyListGraph(final List<Edge> edges) {
        this.adjacencyList = new HashMap<>();
        addEdges(edges);
    }


    @Override
    public void addEdges(List<Edge> edges) {
        for (Edge edge : edges) {
            this.adjacencyList
                .computeIfAbsent(edge.getSource(), x -> new ArrayList<>())
                .add(new Node(edge.getDestination(), edge.getWeight()));
        }
    }


    @Override
    public void printGraph() {
        adjacencyList.forEach((key, nodes) -> {
            System.out.print("Vertex " + key + ":");
            nodes.forEach(node -> System.out.print(" -> " + node.getValue() + " (Weight: " + node.getWeight() + ")"));
            System.out.println();
        });
    }


    public Map<Integer, List<Node>> getAdjacencyList() {
        return this.adjacencyList;
    }


}
