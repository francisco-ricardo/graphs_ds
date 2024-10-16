package ds.graphs.adjmatrix;

import ds.graphs.adjlist.Edge;

public class AdjacencyMatrixGraph {

    private final int numVertices;
    private final int[][] adjacencyMatrix;

    // Constructor to initialize the graph
    public AdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];

        // Initialize the adjacency matrix with 0s
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                this.adjacencyMatrix[i][j] = 0;
            }
        }
    }

    // Method to add an edge between two vertices
    public void addEdge(int source, int destination) {
        if (source >= this.numVertices || destination >= this.numVertices) {
            System.out.println("Error: Invalid vertex.");
            return;
        }
        this.adjacencyMatrix[source][destination] = 1;
        //this.adjacencyMatrix[destination][source] = 1; // For undirected graphs
    }


    public void addEdgeNew(final Edge edge) {
        if (edge.getSource() >= this.numVertices || edge.getDestination() >= this.numVertices) {
            System.out.println("Error: Invalid vertex.");
            return;
        }
        this.adjacencyMatrix[edge.getSource()][edge.getDestination()] = edge.getWeight();
    }

    // Method to remove an edge between two vertices
    public void removeEdge(int source, int destination) {
        if (source >= this.numVertices || destination >= this.numVertices) {
            System.out.println("Error: Invalid vertex.");
            return;
        }
        this.adjacencyMatrix[source][destination] = 0;
        this.adjacencyMatrix[destination][source] = 0; // For undirected graphs
    }

    // Method to print the adjacency matrix
    public void printGraph() {
        for (int i = 0; i < this.numVertices; i++) {
            for (int j = 0; j < this.numVertices; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Getter for the number of vertices
    public int getNumVertices() {
        return this.numVertices;
    }

    // Main method to test the graph implementation
    public static void main(String[] args) {
        final int numVertices = 5;
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(numVertices);

        // Add edges between vertices
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        graph.printGraph();
    }

}
