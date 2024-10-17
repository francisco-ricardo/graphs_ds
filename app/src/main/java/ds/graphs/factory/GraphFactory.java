package ds.graphs.factory;

import java.util.ArrayList;
import java.util.List;

import ds.graphs.adjlist.Edge;
import ds.graphs.adjmatrix.AdjacencyMatrixGraph;
import ds.graphs.adjlist.AdjacencyListGraph;

public final class GraphFactory {

    private GraphFactory() {}

    public static AdjacencyListGraph createUndirectedGraph(List<Edge> edges) {
        List<Edge> undirectedEdges = new ArrayList<>(edges);
        // Duplicate edges in reverse direction for undirected graphs
        for (Edge edge : edges) {
            undirectedEdges.add(new Edge(edge.getDestination(), edge.getSource(), edge.getWeight()));
        }
        return new AdjacencyListGraph(undirectedEdges);
    }



    public static AdjacencyListGraph createAdjacencyListGraph(List<Edge> edges) {
        return new AdjacencyListGraph(edges);
    }

    public static AdjacencyMatrixGraph createAdjacencyMatrixGraph(List<Edge> edges) {
        return new AdjacencyMatrixGraph(edges);
    }

    // Add more factory methods for different graph types
}
