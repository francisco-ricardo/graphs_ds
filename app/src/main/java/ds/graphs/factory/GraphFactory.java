import ds.graphs.Edge;
import ds.graphs.Graph;

public class GraphFactory {
    public static Graph createUndirectedGraph(List<Edge> edges) {
        List<Edge> undirectedEdges = new ArrayList<>(edges);
        // Duplicate edges in reverse direction for undirected graphs
        for (Edge edge : edges) {
            undirectedEdges.add(new Edge(edge.getDestination(), edge.getSource(), edge.getWeight()));
        }
        return new Graph(undirectedEdges);
    }

    // You can add more factory methods for different graph types
}
