package ds.graphs;


/**
 * Class representing a node in a graph. 
 * A node has a value and an associated weight.
 */
public final class Node {
    private final int value;
    private final int weight;

    
     /**
     * Constructs a Node with the given value and weight.
     *
     * @param value  the value of the node
     * @param weight the weight associated with the node
     */
    public Node(final int value, final int weight) {
        this.value = value;
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Node(value=%d, weight=%d)", value, weight);
    }
}
