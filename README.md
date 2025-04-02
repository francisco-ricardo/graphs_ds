# Graph Data Structures (graphs-ds)

This repository is part of my portfolio as a **Software Engineer**. It showcases the implementation of graph data structures, focusing on the creation of graph structures such as **Adjacency List** and **Adjacency Matrix**. The project is fully **open-source** and serves as a foundational library for building and understanding graph-based applications.

For an overview of Graph theory and its concepts, please refer to my post: [Graphs - Overview](https://github.com/francisco-ricardo/graphs_post).

---

## ✨ Features

- **Graph Representations**: Adjacency List and Adjacency Matrix.
- **Edge and Node Abstraction**: Simplified representation of graph edges and nodes.
- **Factory Pattern**: For easy creation of different graph types.
- **Test Coverage**: Unit tests for validating the graph structure using **JUnit 5**.
- **Dockerized Environment**: Easily run the project in a containerized setup.

---

## 📂 Project Structure

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

---

## 🚀 Getting Started

### Prerequisites

- **Java**: Version 11 or higher.
- **Maven**: Version 3.6 or higher.
- **Docker** (optional): For containerized execution.

### Clone the Repository

```bash
git clone https://github.com/yourusername/graphs-ds.git
cd graphs-ds
```

### Run the Project

#### Option 1: Using Docker

1. Start the Docker container:

```bash
make run
```

2. Access the container:

```bash
docker exec -it graph-ds bash
cd /graphs_ds/app
```

3. Build and run the project:

```bash
mvn clean install
mvn exec:java
```

#### Option 2: Run Locally

1. Navigate to the project directory:

```bash
cd graphs_ds/app
```

2. Build and run the project:

```bash
mvn clean install
mvn exec:java
```

---

## ✅ Running Tests

This project uses **JUnit 5** for testing. You can run the tests locally or inside the Docker container.

- **Locally**:

```bash
mvn test
```

- **In Docker**:

```bash
docker-compose exec graphs_ds mvn test
```

---

## 💡Example Usage

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

---

## 🔮 Future Enhancements

To make this project more comprehensive and impactful, the following features are planned:

1. **Graph Algorithms**:
   - Implement traversal algorithms like BFS and DFS.
   - Add shortest path algorithms like Dijkstra's and A*.
   - Include minimum spanning tree algorithms (Prim's, Kruskal's).

2. **Visualization**:
   - Integrate graph visualization tools (e.g., GraphStream or JGraphT).
   - Provide a web-based interface for interactive graph exploration.

3. **Performance Optimization**:
   - Optimize the graph data structures for large-scale graphs.
   - Add benchmarks to compare performance across different implementations.

4. **Real-World Applications**:
   - Demonstrate use cases like social network analysis, dependency resolution, or route planning.

5. **Language Support**:
   - Extend the library to support Python or JavaScript for broader usability.

---

## 📚 Lessons Learned

This project provided valuable insights into the following areas:

1. **Graph Theory**:
   - Deepened my understanding of graph representations and their trade-offs.

2. **Software Design**:
   - Applied the Factory Pattern to simplify graph creation.
   - Designed modular and reusable components for scalability.

3. **Testing**:
   - Gained experience in writing comprehensive unit tests using JUnit 5.

---

## 🎯 Why This Project?

This project demonstrates my ability to:

- Design and implement complex data structures.
- Write clean, maintainable, and well-documented code.
- Use modern tools like Docker and Maven for efficient development.
- Apply testing frameworks to ensure code quality and reliability.

It also highlights my passion for solving problems using graph theory and my commitment to continuous learning.

---

## 📜 License

This repository is licensed under the MIT License. You are free to clone, 
modify, and contribute to this project. See the [LICENSE](LICENSE) file for 
more details.

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository, submit pull requests, or open issues for suggestions.

---

## 📬 Contact

If you have any questions or feedback, feel free to reach out:

- **GitHub**: [francisco-ricardo](https://github.com/francisco-ricardo)
- **Email**: franciscoricardo.dev@gmail.com
- **LinkedIn**: [francisco-aguiar](www.linkedin.com/in/francisco-aguiar-3ab650a0)








