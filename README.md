# Graph Data Structures (graphs-ds)

Welcome to the **graphs-ds** repository! This project is part of my portfolio and showcases my ability to create fundamental graph data structures in Java. It is designed with a focus on the structure itself, without implementing traversal algorithms like DFS or BFS, which could be added in future repositories.

## Overview

This project contains implementations of different types of graphs, such as:

- **Adjacency List Graph**
- **Adjacency Matrix Graph**

It provides basic data structures for representing graphs but does not implement graph traversal algorithms. If you're interested in a deeper discussion on graphs, check out my post: [Graphs - Overview](https://github.com/francisco-ricardo/graphs_post).

## Features

- **Graph representations**: Adjacency List and Adjacency Matrix.
- **Edge and Node abstraction**: Simplified representation of graph edges and nodes.
- **Factory pattern**: For easy creation of different graph types.
- **Test coverage**: Unit tests for validating the graph structure using **JUnit 5**.

## Project Structure

The project is structured as a standard Maven project:

```bash
graphs-ds/ 
├── src/ 
|    │ └── main/ 
|    |    │ └── java/ 
|    |    |    │ └── ds/graphs/ # Contains the graph implementation classes 
|    │ └── test/ 
|    |    │ └── java/ # Contains unit tests
└── Dockerfile # Docker setup to run the project 
└── docker-compose.yml # Docker Compose configuration
```

## Getting Started

### Prerequisites

To run this project locally, you will need:

- **Java 17** or later
- **Maven**
- **Docker**

### Running the Project

You can run the project locally using Docker. First, make sure you have Docker and Docker Compose installed.

1. Clone the repository:
```bash
git clone https://github.com/francisco-ricardo/graphs-ds.git
cd graphs-ds
```

2. Build and run the Docker container:
```bash
docker-compose up
```

3. Once the container is up, you can explore the graph structures and run the tests.

## Running Tests

This project uses JUnit 5 to run the tests. You can run the tests inside the Docker container or locally with Maven:

- To run tests locally:

```bash
mvn test
```

- To run tests in Docker:

```bash
docker-compose exec graphs_ds mvn test

```

## Example Usage

Here is a basic example of how to create and use the graph data structures:

```java
List<Edge> edges = new ArrayList<>();
edges.add(new Edge(0, 1, 18));
edges.add(new Edge(0, 3, 11));
// More edges...

AdjacencyListGraph listGraph = GraphFactory.createAdjacencyListGraph(edges);
listGraph.printGraph(); // Prints the adjacency list representation

AdjacencyMatrixGraph matrixGraph = GraphFactory.createAdjacencyMatrixGraph(edges);
matrixGraph.printGraph(); // Prints the adjacency matrix representation
```

## Testing Framework

The repository includes unit tests for the graph structures, implemented using JUnit 5. The tests validate the correct creation of graphs, edge connections, and node values.

For example, the *AdjacencyListGraphTest* verifies the graph creation and edge connections:

```java
@Test
void testAdjacencyListGraphCreation() {
    // Setup
    List<Edge> edges = new ArrayList<>();
    edges.add(new Edge(0, 1, 6));

    // Action
    AdjacencyListGraph graph = new AdjacencyListGraph(edges);

    // Assert
    List<Node> nodes = graph.getAdjacencyList().get(0);
    assertNotNull(nodes);
    assertEquals(1, nodes.get(0).getNext());
    assertEquals(6, nodes.get(0).getWeight());
}
```

## Contributing

This repository is open-source and licensed under the MIT license. Feel free to clone, fork, or modify the project as needed. Contributions and suggestions are welcome!

## Limitations

This repository focuses on graph data structures and does not include traversal or search algorithms like BFS, DFS, Dijkstra, etc. These algorithms could be implemented in a future project, expanding upon the structures created here.

## Tests

mvn test

## Main

mvn clean compile
mvn compile exec:java -Dexec.mainClass="ds.graphs.main.Main"
mvn compile exec:java

mvn clean package

jshell --class-path /graphs_ds/app/target/classes





# Algorithms

This repo contains a list of algorithms...

Graphs:
https://www.geeksforgeeks.org/implementing-generic-graph-in-java/

// Java program to implement Graph
// with the help of Generics

import java.util.*;

class Graph<T> {

    // We use Hashmap to store the edges in the graph
    private Map<T, List<T> > map = new HashMap<>();

    // This function adds a new vertex to the graph
    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }

    // This function adds the edge
    // between source to destination
    public void addEdge(T source,
                        T destination,
                        boolean bidirectional)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    // This function gives the count of vertices
    public void getVertexCount()
    {
        System.out.println("The graph has "
                           + map.keySet().size()
                           + " vertex");
    }

    // This function gives the count of edges
    public void getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has "
                           + count
                           + " edges.");
    }

    // This function gives whether
    // a vertex is present or not.
    public void hasVertex(T s)
    {
        if (map.containsKey(s)) {
            System.out.println("The graph contains "
                               + s + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain "
                               + s + " as a vertex.");
        }
    }

    // This function gives whether an edge is present or not.
    public void hasEdge(T s, T d)
    {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between "
                               + s + " and " + d + ".");
        }
        else {
            System.out.println("The graph has no edge between "
                               + s + " and " + d + ".");
        }
    }

    // Prints the adjancency list of each vertex.
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}

// Driver Code
public class Main {

    public static void main(String args[])
    {

        // Object of graph is created.
        Graph<Integer> g = new Graph<Integer>();

        // edges are added.
        // Since the graph is bidirectional,
        // so boolean bidirectional is passed as true.
        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        // Printing the graph
        System.out.println("Graph:\n"
                           + g.toString());

        // Gives the no of vertices in the graph.
        g.getVertexCount();

        // Gives the no of edges in the graph.
        g.getEdgesCount(true);

        // Tells whether the edge is present or not.
        g.hasEdge(3, 4);

        // Tells whether vertex is present or not
        g.hasVertex(5);
    }
}
