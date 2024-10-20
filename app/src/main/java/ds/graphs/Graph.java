package ds.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Graph {

    public void addEdges(final List<Edge> edges);
    public void printGraph();

    public static int calcNumNodes(List<Edge> edges) {
        final Set<Integer> sourceSet = new HashSet<>();
        edges.forEach(e -> sourceSet.add(e.getSource()));
        return sourceSet.size();
    }

}
