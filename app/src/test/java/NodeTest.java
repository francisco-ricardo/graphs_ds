import ds.graphs.adjlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testNodeCreation() {
        // Setup: Criando um nó
        Node node = new Node(2, 10);

        // Verificação: Checando se os valores estão corretos
        assertEquals(2, node.getValue(), "O valor do nó deve ser 2");
        assertEquals(10, node.getWeight(), "O peso do nó deve ser 10");
    }
}
