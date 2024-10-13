package ds.graphs.adjmatrix;

public class AdjacencyMatrixGraph {

    private final int numVertices;
    private final int[][] adjMatrix;

    public AdjacencyMatrixGraph(final int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];

        // Start the matrix
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    // Método para adicionar uma aresta
    public void addEdge(int src, int dest) {
        if (src >= numVertices || dest >= numVertices) {
            System.out.println("Erro: vértice inválido.");
            return;
        }
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // Para grafos não-direcionados
    }

    // Método para remover uma aresta
    public void removeEdge(int src, int dest) {
        if (src >= numVertices || dest >= numVertices) {
            System.out.println("Erro: vértice inválido.");
            return;
        }
        adjMatrix[src][dest] = 0;
        adjMatrix[dest][src] = 0; // Para grafos não-direcionados
    }

    // Método para imprimir a matriz de adjacências
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Getter para número de vértices
    public int getNumVertices() {
        return this.numVertices;
    }




}
