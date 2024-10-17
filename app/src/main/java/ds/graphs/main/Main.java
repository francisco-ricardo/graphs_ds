package ds.graphs.main;

import java.util.ArrayList;
import java.util.List;

import ds.graphs.adjlist.Edge;
import ds.graphs.adjlist.AdjacencyListGraph;
import ds.graphs.adjmatrix.AdjacencyMatrixGraph;
import ds.graphs.factory.GraphFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adjacency List Graph >>>>>>>>>>");

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

        final AdjacencyListGraph adjListGraph = GraphFactory.createAdjacencyListGraph(edges);
        adjListGraph.printGraph();

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        System.out.println("Adjacency Matrix Graph >>>>>>>>>>");

        final int numVertices = 7;
        AdjacencyMatrixGraph adjMatrixGraph = new AdjacencyMatrixGraph(numVertices);

        // Add edges between vertices
        adjMatrixGraph.addEdge(0, 1);
        adjMatrixGraph.addEdge(0, 4);
        adjMatrixGraph.addEdge(1, 2);
        adjMatrixGraph.addEdge(1, 3);
        adjMatrixGraph.addEdge(1, 4);
        adjMatrixGraph.addEdge(2, 3);
        adjMatrixGraph.addEdge(3, 4);

        // Print the adjacency matrix
        adjMatrixGraph.printGraph();

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        System.out.println("Adjacency Matrix Graph 2 >>>>>>>>>>");

        // Add edges between vertices
        final List<Edge> adjMatrixedges = new ArrayList<>();
        adjMatrixedges.add(new Edge(0, 1, 18));
        adjMatrixedges.add(new Edge(0, 4, 11));
        adjMatrixedges.add(new Edge(1, 2, 18));
        adjMatrixedges.add(new Edge(1, 3, 9));
        adjMatrixedges.add(new Edge(1, 4, 14));
        adjMatrixedges.add(new Edge(2, 3, 9));
        adjMatrixedges.add(new Edge(3, 4, 25));

        AdjacencyMatrixGraph adjMatrixGraph2 = new AdjacencyMatrixGraph(adjMatrixedges);
        // Print the adjacency matrix
        adjMatrixGraph2.printGraph();

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");



    }
}
