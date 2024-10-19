package ds.graphs;

public final class Edge {
    private final int source;
    private final int destination;
    private final int weight;

    public Edge(final int src, final int dest, final int weight) {
        this.source = src;
        this.destination = dest;
        this.weight = weight;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Edge(src=%d, dest=%d, weight=%d)", source, destination, weight);
    }
}
