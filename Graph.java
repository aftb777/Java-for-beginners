import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void printNodes() {
        System.out.println("Nodes in the graph:");
        for (int v = 0; v < V; ++v) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    void dfs(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()){
            int v = stack.pop();

            if(!visited[v]){
                visited[v] = true;
                System.out.print(v + " ");

                for(int neighbour : adj[v]){
                    if(!visited[neighbour]){
                        stack.push(neighbour);
                    }
                }
            }
        }
    }

    void bfs(int start) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println();

        System.out.print("Depth-First Search (DFS) starting from vertex 0: ");
        graph.dfs(0);

        System.out.println();

        System.out.print("Breadth-First Search (BFS) starting from vertex 0: ");
        graph.bfs(0);
    }
}
