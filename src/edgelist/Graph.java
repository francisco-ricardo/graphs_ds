package edgelist;

import java.util.HashSet;
import java.util.LinkedList;

import edgelist.Vertex;


class Graph {
    private HashSet<Vertex> vertices;

    public Graph() {
        vertices = new HashSet<>();
    }

    public boolean AddEdge(Vertex v1, Vertex v2, int weight) {
        return v1.getEdges().add(new Edge(v2, weight)) && v2.getEdges().add(new Edge(v1, weight));
    }

    public boolean AddVertex(Vertex v) {
        return vertices.add(v);
    }

    public void printGraph() {
        for (Vertex v: vertices) {
            System.out.print("vertex name: " + v.getName() + ":\n");
            for (Edge e: v.getEdges()) {
                System.out.print("destVertex: " + e.getDestVertex().getName() + ", weight: " + e.getWeight() + "\n");
            }
            System.out.print("\n");
        }
    }
}

