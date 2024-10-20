package ds.graphs;

/**
 * Class representing an edge in a graph. 
 * An edge connects two nodes (source and destination) and has a weight.
 */
public final class Edge {
    private final int source;
    private final int destination;
    private final int weight;


    /**
     * Constructs an Edge with the given source, destination, and weight.
     *
     * @param src    the source node
     * @param dest   the destination node
     * @param weight the weight of the edge
     */
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
