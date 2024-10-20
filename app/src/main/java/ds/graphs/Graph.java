package ds.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Interface representing a graph data structure. 
 * This interface provides methods to add edges and print the graph representation.
 */
public interface Graph {

    /**
     * Adds a list of edges to the graph.
     *
     * @param edges the list of edges to be added
     */
    public void addEdges(final List<Edge> edges);


    /**
     * Prints the graph in a readable format.
     */
    public void printGraph();

    
    /**
     * Calculates the number of unique nodes in the graph from the list of edges.
     *
     * @param edges the list of edges
     * @return the number of unique nodes
     */
    public static int calcNumNodes(List<Edge> edges) {
        final Set<Integer> sourceSet = new HashSet<>();
        edges.forEach(e -> sourceSet.add(e.getSource()));
        return sourceSet.size();
    }

}
