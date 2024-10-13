package ds.graphs.factory;

import java.util.ArrayList;
import java.util.List;

import ds.graphs.adjlist.Edge;
import ds.graphs.adjlist.Graph;

public class GraphFactory {

    public static Graph createUndirectedGraph(List<Edge> edges) {
        List<Edge> undirectedEdges = new ArrayList<>(edges);
        // Duplicate edges in reverse direction for undirected graphs
        for (Edge edge : edges) {
            undirectedEdges.add(new Edge(edge.getDestination(), edge.getSource(), edge.getWeight()));
        }
        return new Graph(undirectedEdges);
    }

    // Add more factory methods for different graph types
}
