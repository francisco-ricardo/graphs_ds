import ds.graphs.AdjacencyListGraph;
import ds.graphs.Edge;
import ds.graphs.Node;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit tests for the AdjacencyListGraph class.
 */
class AdjacencyListGraphTest {


    /**
     * Tests the creation of an adjacency list graph from a list of edges.
     * Verifies that the adjacency list is correctly built and edges are properly linked.
     */    
    @Test
    void testAdjacencyListGraphCreation() {

        // Setup: creating a list of edges
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 6));
        edges.add(new Edge(1, 2, 7));

        // Action: creating a graph
        AdjacencyListGraph graph = new AdjacencyListGraph(edges);

        // Checking: making sure the graph was correctly created
        List<Node> nodesFromZero = graph.getAdjacencyList().get(0);
        assertNotNull(nodesFromZero, "Adjacency list for vertex 0 must exist");
        assertEquals(1, nodesFromZero.size(), "Vertex 0 must have 1 adjacent node");
        assertEquals(1, nodesFromZero.get(0).getNext(), "The value of the adjacent node must be 1");
        assertEquals(6, nodesFromZero.get(0).getWeight(), "The edge weight should be 6");
    }


    /**
     * Tests the edge connections between nodes in the graph.
     * Verifies that nodes are correctly connected and edge weights are properly assigned.
     */
    @Test
    void testGraphEdgeConnection() {

        // Setup: Creating a list of edges
        List<Edge> edges = List.of(
                new Edge(0, 1, 10),
                new Edge(1, 2, 20),
                new Edge(2, 3, 30)
        );

        // Action: creating the graph
        AdjacencyListGraph graph = new AdjacencyListGraph(edges);

        // Assert: Checking node connectivity and edge weights
        assertNotNull(graph.getAdjacencyList().get(0), "Node 0 must have adjacent nodes");
        assertEquals(1, graph.getAdjacencyList().get(0).get(0).getNext());
        assertEquals(10, graph.getAdjacencyList().get(0).get(0).getWeight());
    }
}
