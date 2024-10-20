package ds.graphs;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class AdjacencyMatrixGraph implements Graph {

    private final int numVertices;
    private final int[][] adjacencyMatrix;


    public AdjacencyMatrixGraph(final List<Edge> edges) {

        Set<Integer> sourceSet = new HashSet<>();
        edges.forEach(e -> sourceSet.add(e.getSource()));
        this.numVertices = sourceSet.size();

        this.adjacencyMatrix = new int[numVertices][numVertices];

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                this.adjacencyMatrix[i][j] = 0;
            }
        }

        addEdges(edges);
    }


    @Override
    public void addEdges(List<Edge> edges) {
        for (Edge edge: edges) {
            if (edge.getSource() >= this.numVertices || edge.getDestination() >= this.numVertices) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
            }

            this.adjacencyMatrix[edge.getSource()][edge.getDestination()] = edge.getWeight();
        }
    }


    @Override
    public void printGraph() {
        for (int i = 0; i < this.numVertices; i++) {
            for (int j = 0; j < this.numVertices; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
