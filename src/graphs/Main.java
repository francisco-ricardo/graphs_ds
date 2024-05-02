package graphs;

import graphs.Graph;

public class Main {
    public static void main(String[] args) {
        Graph ourGraph = new Graph();

        // vertices
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");

        ourGraph.AddVertex(v0);
        ourGraph.AddVertex(v1);
        ourGraph.AddVertex(v2);
        ourGraph.AddVertex(v3);

        // edges
        ourGraph.AddEdge(v0, v1, 2);
        ourGraph.AddEdge(v1, v2, 3);
        ourGraph.AddEdge(v2, v0, 1);
        ourGraph.AddEdge(v2, v3, 1);
        ourGraph.AddEdge(v3, v2, 4);

        ourGraph.printGraph();
    }
}