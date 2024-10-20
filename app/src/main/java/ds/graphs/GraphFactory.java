package ds.graphs;

import java.util.List;


/**
 * Factory class for creating different types of graph representations.
 * This class provides static methods to instantiate specific graph implementations.
 */
public final class GraphFactory {

    // Private constructor to prevent instantiation
    private GraphFactory() {}


    /**
     * Creates an instance of AdjacencyListGraph from the provided list of edges.
     *
     * @param edges the list of edges used to build the graph
     * @return an instance of AdjacencyListGraph
     */
    public static AdjacencyListGraph createAdjacencyListGraph(List<Edge> edges) {
        return new AdjacencyListGraph(edges);
    }


    /**
     * Creates an instance of AdjacencyMatrixGraph from the provided list of edges.
     *
     * @param edges the list of edges used to build the graph
     * @return an instance of AdjacencyMatrixGraph
     */
    public static AdjacencyMatrixGraph createAdjacencyMatrixGraph(List<Edge> edges) {
        return new AdjacencyMatrixGraph(edges);
    }

    // Add more factory methods for different graph types if necessary
}
