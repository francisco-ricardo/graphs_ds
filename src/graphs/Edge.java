package graphs;

import graphs.Vertex;

class Edge {
    private int weight;
    private Vertex destVertex;

    public Edge(Vertex dest, int w) {
        this.destVertex = dest;
        this.weight = w;
    }

    public Edge(Vertex dest) {
        this.destVertex = dest;
        this.weight = 1;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getDestVertex() {
        return destVertex;
    }
}
