import org.junit.jupiter.api.Test;

import ds.graphs.Node;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testNodeCreation() {
        // Setup: Creating a node
        Node node = new Node(2, 10);

        // Checking the values
        assertEquals(2, node.getValue(), "The value of the node must be 2");
        assertEquals(10, node.getWeight(), "The weight of the node must be 10");
    }
}
