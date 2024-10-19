package ds.graphs;

import java.util.List;

public class AdjacencyMatrixGraph {

    private final int numVertices;
    private final int[][] adjacencyMatrix;


    public AdjacencyMatrixGraph(final List<Edge> edges) {
        this.numVertices = edges.size();
        this.adjacencyMatrix = new int[numVertices][numVertices];

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                this.adjacencyMatrix[i][j] = 0;
            }
        }

        for (Edge edge: edges) {
            this.adjacencyMatrix[edge.getSource()][edge.getDestination()] = edge.getWeight();
        }

    }


    public void addEdge(final Edge edge) {
        if (edge.getSource() >= this.numVertices || edge.getDestination() >= this.numVertices) {
            System.out.println("Error: Invalid vertex.");
            return;
        }
        this.adjacencyMatrix[edge.getSource()][edge.getDestination()] = edge.getWeight();
    }


    public void removeEdge(int source, int destination) {
        if (source >= this.numVertices || destination >= this.numVertices) {
            System.out.println("Error: Invalid vertex.");
            return;
        }
        this.adjacencyMatrix[source][destination] = 0;
        this.adjacencyMatrix[destination][source] = 0; // For undirected graphs
    }


    public void printGraph() {
        for (int i = 0; i < this.numVertices; i++) {
            for (int j = 0; j < this.numVertices; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
