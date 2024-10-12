import ds.graphs.adjlist.Edge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EdgeTest {

    @Test
    void testEdgeCreation() {
        // Setup: Criando uma aresta
        Edge edge = new Edge(0, 1, 5);

        // Verificação: Checando se os valores estão corretos
        assertEquals(0, edge.getSource(), "A origem da aresta deve ser 0");
        assertEquals(1, edge.getDestination(), "O destino da aresta deve ser 1");
        assertEquals(5, edge.getWeight(), "O peso da aresta deve ser 5");
    }
}
