import ds.graphs.adjlist.Edge;
import ds.graphs.adjlist.Graph;
import ds.graphs.adjlist.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testGraphCreation() {
        // Setup: criando uma lista de arestas
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 6));
        edges.add(new Edge(1, 2, 7));

        // Ação: criando o grafo
        Graph graph = new Graph(edges);

        // Verificação: garantindo que o grafo foi criado corretamente
        List<Node> nodesFromZero = graph.getAdjacencyList().get(0);
        assertNotNull(nodesFromZero, "Lista de adjacência para o vértice 0 deve existir");
        assertEquals(1, nodesFromZero.size(), "Vértice 0 deve ter 1 nó adjacente");
        assertEquals(1, nodesFromZero.get(0).getValue(), "O valor do nó adjacente deve ser 1");
        assertEquals(6, nodesFromZero.get(0).getWeight(), "O peso da aresta deve ser 6");
    }
    
    @Test
    void testGraphEdgeConnection() {
        // Setup
        List<Edge> edges = List.of(
                new Edge(0, 1, 10),
                new Edge(1, 2, 20),
                new Edge(2, 3, 30)
        );

        // Ação: criando o grafo
        Graph graph = new Graph(edges);

        // Verificação: conectividade dos nós
        assertNotNull(graph.getAdjacencyList().get(0), "O nó 0 deve ter nós adjacentes");
        assertEquals(1, graph.getAdjacencyList().get(0).get(0).getValue());
        assertEquals(10, graph.getAdjacencyList().get(0).get(0).getWeight());
    }
}
