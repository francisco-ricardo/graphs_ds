import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    
    @Test
    void testGraphCreation() {
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1, 2),
            new Edge(1, 2, 3),
            new Edge(2, 0, 4)
        );

        Graph graph = new Graph(edges);
        assertNotNull(graph);
        assertFalse(graph.adjacencyList.isEmpty());
    }
}
