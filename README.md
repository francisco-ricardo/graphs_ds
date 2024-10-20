# Graph Data Structures (graphs-ds)

This repository is part of my portfolio as a **Software Engineer**. It showcases the implementation of graph data structures, focusing exclusively on the creation of graph structures rather than exploring traversal or search algorithms. The project is fully **open-source** and is intended to be a foundational library for building and understanding graph-based applications.

For an overview of Graph theory and its concepts, please refer to my post: [Graphs - Overview](https://github.com/francisco-ricardo/graphs_post).

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

To get started, clone the repository:

```bash
git clone https://github.com/yourusername/graphs-ds.git
cd graphs-ds
```

You can run this project in two ways:

### Option 1: Using Docker

The project is configured to run inside a container with the following configuration:

- *Dockerfile*: Defines the environment using eclipse-temurin with all necessary tools.

- *compose.yaml*: Handles the container management for easy start/stop.

The container is configured to continuously run the docker-cmd-script.sh script.

To run the project using Docker, ensure you have Docker and Docker Compose installed on your machine and follow these steps:

1. Navigate to the project directory.

2. Run the following command to start the Docker container:

```bash
make run
```

Once the container is up, you can explore the graph structures and run the tests.

3. Navigate to the app directory in the container:

```bash
docker exec -it graph-ds bash
cd /graphs_ds/app
```

4. Build the project using Maven:

```bash
mvn clean install
```

5. Run the project:

```bash
mvn exec:java
```

### Option 2: Directly on Your Operating System

If you prefer to run the project directly on your operating system, ensure you have the following dependencies installed:

- Java (version 11 or higher)
- Maven (version 3.6 or higher)

Once you have the dependencies installed, follow these steps:

1. Navigate to the app directory:

```bash
cd graphs_ds/app
```

2. Build the project using Maven:

```bash
mvn clean install
```

3. Run the project:

```bash
mvn exec:java
```

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

Output:

```bash
1. Adjacency List Graph:
Vertex 0: -> 1 (Weight: 18) -> 3 (Weight: 11)
----------
2. Adjacency Matrix Graph:
0 18 0 11
0 0 0 0
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

This repository is open-source and licensed under the MIT license. Feel free to clone, fork, or modify the project as needed.

## Future Plans

This repository focuses exclusively on graph data structures. Algorithms for graph traversal and search (like BFS, DFS) or shortest path finding (Dijkstra's, A*) are not covered here. These might be explored in future repositories.

Feel free to reach out for feedback or suggestions!






