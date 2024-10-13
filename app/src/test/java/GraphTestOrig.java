import org.junit.jupiter.api.Test;

import ds.graphs.adjlist.Edge;
import ds.graphs.adjlist.Graph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class GraphTestOrig {

    @Test
    void testGraphCreation() {
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1, 2),
            new Edge(1, 2, 3),
            new Edge(2, 0, 4)
        );

        Graph graph = new Graph(edges);
        assertNotNull(graph);
        assertFalse(graph.getAdjacencyList().isEmpty());
    }
}
