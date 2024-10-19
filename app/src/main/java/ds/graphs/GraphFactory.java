package ds.graphs;

import java.util.List;

public final class GraphFactory {

    private GraphFactory() {}


    public static AdjacencyListGraph createAdjacencyListGraph(List<Edge> edges) {
        return new AdjacencyListGraph(edges);
    }


    public static AdjacencyMatrixGraph createAdjacencyMatrixGraph(List<Edge> edges) {
        return new AdjacencyMatrixGraph(edges);
    }

    // Add more factory methods for different graph types
}
