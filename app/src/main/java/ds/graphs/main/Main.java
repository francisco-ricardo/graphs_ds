package ds.graphs.main;

import java.util.ArrayList;
import java.util.List;

import ds.graphs.adjlist.Edge;
import ds.graphs.adjlist.AdjacencyListGraph;
import ds.graphs.adjmatrix.AdjacencyMatrixGraph;
import ds.graphs.factory.GraphFactory;

public class Main {
    public static void main(String[] args) {

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


        System.out.println("Adjacency List Graph >>>>>>>>>>");
        final AdjacencyListGraph adjListGraph = GraphFactory.createAdjacencyListGraph(edges);
        adjListGraph.printGraph();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        System.out.println("Adjacency Matrix Graph  >>>>>>>>>>");
        final AdjacencyMatrixGraph adjMatrixGraph = GraphFactory.createAdjacencyMatrixGraph(edges);
        adjMatrixGraph.printGraph();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

    }
}
