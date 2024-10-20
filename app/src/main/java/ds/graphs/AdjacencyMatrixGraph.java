package ds.graphs;

import java.util.List;
import java.util.Arrays;

public class AdjacencyMatrixGraph implements Graph {

    private final int numNodes;
    private final int[][] adjacencyMatrix;


    public AdjacencyMatrixGraph(final List<Edge> edges) {

        //Set<Integer> sourceSet = new HashSet<>();
        //edges.forEach(e -> sourceSet.add(e.getSource()));
        //this.numNodes = sourceSet.size();

        this.numNodes = Graph.calcNumNodes(edges);
        this.adjacencyMatrix = new int[numNodes][numNodes];

        //for (int i = 0; i < numVertices; i++) {
            //for (int j = 0; j < numVertices; j++) {
                //this.adjacencyMatrix[i][j] = 0;
            //}
        //}

        for (int i = 0; i < this.numNodes; i++) {
            Arrays.fill(this.adjacencyMatrix[i], 0);
        }

        this.addEdges(edges);
    }


    


    @Override
    public void addEdges(List<Edge> edges) {
        for (Edge edge: edges) {
            if (edge.getSource() >= this.numNodes || edge.getDestination() >= this.numNodes) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
            }

            this.adjacencyMatrix[edge.getSource()][edge.getDestination()] = edge.getWeight();
        }
    }


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
