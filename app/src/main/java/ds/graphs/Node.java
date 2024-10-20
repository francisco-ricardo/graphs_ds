package ds.graphs;


/**
 * Represents a node in the graph, typically used for adjacency lists.
 * Each node has a reference to the next node (destination) and a weight associated with the edge.
 */
public final class Node {
    private final int next;   // Refers to the next node in the graph (destination)
    private final int weight;


     /**
     * Constructs a node with a reference to the next node and the edge's weight.
     *
     * @param next the destination node this node points to
     * @param weight the weight of the edge connecting the nodes
     */
    public Node(final int next, final int weight) {
        this.next = next;
        this.weight = weight;
    }


    /**
     * Retrieves the destination node this node points to.
     *
     * @return the destination node (next)
     */
    public int getNext() {
        return this.next;
    }


    /**
     * Retrieves the weight of the edge connecting this node to the next node.
     *
     * @return the weight of the edge
     */
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return String.format("Node(next=%d, weight=%d)", this.next, this.weight);
    }
}
