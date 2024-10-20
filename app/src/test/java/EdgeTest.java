import org.junit.jupiter.api.Test;

import ds.graphs.Edge;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit tests for the Edge class.
 */
class EdgeTest {


    /**
     * Tests the creation of an edge.
     * Verifies that the source, destination, and weight are correctly set.
     */    
    @Test
    void testEdgeCreation() {
        // Setup: Creating an edge
        Edge edge = new Edge(0, 1, 5);

        // Checking the values
        assertEquals(0, edge.getSource(), "The origin of the edge must be 0");
        assertEquals(1, edge.getDestination(), "The edge destination must be 1");
        assertEquals(5, edge.getWeight(), "The edge weight should be 5");
    }
}
