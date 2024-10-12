package adjlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Graph {

    // data structure for adjacency list node
    static class Node {
        int value, weight;

        Node(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    };

    // A list of lists to represent adjacency list
    List < List < Node >> adj = new ArrayList < > ();

    public Graph(List < Edge > edges) {
        for (int i = 0; i < edges.size(); i++)
            adj.add(i, new ArrayList < > ());

        // add edges to the undirected graph
        for (Edge e: edges) {
            adj.get(e.src).add(new Node(e.dest, e.weight));

        }
    }

    // print adjacency list representation of graph
    public static void printGraph(Graph graph) {
        int src = 0;
        int n = graph.adj.size();

        while (src < n) {
            for (Node edge: graph.adj.get(src)) {
                System.out.print(src + " --> " + edge.value +
                        " (" + edge.weight + ")\t");
            }

            System.out.println();
            src++;
        }
    }
}