package ds.graphs;

import java.util.ArrayList;
import java.util.List;


/**
 * Main class to demonstrate the usage of graph data structures. 
 * This class creates sample graphs and prints their representations using the factory pattern.
 */
public class Main {

/**
     * The main method where the application starts. 
     * It creates an example set of edges and builds both an adjacency list graph 
     * and an adjacency matrix graph to demonstrate functionality.
     *
     * @param args command-line arguments (not used)
     */    
    public static void main(String[] args) {


        // Define a list of edges
        final List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 18));
        edges.add(new Edge(0, 3, 11));
        edges.add(new Edge(1, 0, 18));
        edges.add(new Edge(1, 2, 9));
        edges.add(new Edge(1, 3, 14));
        edges.add(new Edge(2, 1, 9));
        edges.add(new Edge(2, 3, 25));
        edges.add(new Edge(3, 0, 11));
        edges.add(new Edge(3, 1, 14));
        edges.add(new Edge(3, 2, 25));


        // Create and print the adjacency list graph
        System.out.println("1. Adjacency List Graph:");
        final AdjacencyListGraph adjListGraph = GraphFactory.createAdjacencyListGraph(edges);
        adjListGraph.printGraph();
        System.out.println("----------\n");
        

        // Create and print the adjacency matrix graph
        System.out.println("2. Adjacency Matrix Graph:");
        final AdjacencyMatrixGraph adjMatrixGraph = GraphFactory.createAdjacencyMatrixGraph(edges);
        adjMatrixGraph.printGraph();
        System.out.println("---------\n");

    }
}
