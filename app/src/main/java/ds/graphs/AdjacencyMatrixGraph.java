package ds.graphs;

import java.util.List;
import java.util.Arrays;


/**
 * Class representing a graph using an adjacency matrix. 
 * This structure is useful for dense graphs.
 * The matrix stores the weights of the edges between vertices.
 */
public class AdjacencyMatrixGraph implements Graph {

    private final int numNodes;
    private final int[][] adjacencyMatrix;


     /**
     * Constructs a graph from a list of edges and initializes the adjacency matrix.
     *
     * @param edges the list of edges to construct the graph
     */
    public AdjacencyMatrixGraph(final List<Edge> edges) {

        this.numNodes = Graph.calcNumNodes(edges);
        this.adjacencyMatrix = new int[numNodes][numNodes];

        for (int i = 0; i < this.numNodes; i++) {
            Arrays.fill(this.adjacencyMatrix[i], 0);
        }

        this.addEdges(edges);
    }


    /**
     * Adds edges to the adjacency matrix graph.
     *
     * @param edges the list of edges to be added
     */
    @Override
    public void addEdges(List<Edge> edges) {
        for (Edge edge: edges) {
            if (edge.getSource() >= this.numNodes || edge.getDestination() >= this.numNodes) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
            }

            this.adjacencyMatrix[edge.getSource()][edge.getDestination()] = edge.getWeight();
        }
    }


    /**
     * Prints the adjacency matrix representation of the graph.
     */
    @Override
    public void printGraph() {
        for (int i = 0; i < this.numNodes; i++) {
            for (int j = 0; j < this.numNodes; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
