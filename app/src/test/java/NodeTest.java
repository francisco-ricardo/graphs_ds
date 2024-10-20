import org.junit.jupiter.api.Test;

import ds.graphs.Node;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit tests for the Node class.
 */
class NodeTest {


    /**
     * Tests the creation of a node.
     * Verifies that the node value and weight are correctly set.
     */
    @Test
    void testNodeCreation() {
        // Setup: Creating a node
        Node node = new Node(2, 10);

        // Checking the values
        assertEquals(2, node.getNext(), "The value of the node must be 2");
        assertEquals(10, node.getWeight(), "The weight of the node must be 10");
    }
}
