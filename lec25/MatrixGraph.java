class MatrixGraph {
    private int numV; 
    private int capacity;
    private Integer[][] data;  //Integer array so we can use NULL

    MatrixGraph(int capacity) {
        this.capacity = capacity;
        this.numV = 0;        
        data = new Integer[capacity][capacity];
    }

    MatrixGraph() {
        this.capacity = 100;
        this.numV = 0;        
        data = new Integer[capacity][capacity];
    }

    //null indicates no vertex in that row/column
    //0 indicates an existant vertex, but no edge
    public void addVertex() {
        if (this.numV+1 >= capacity) {
            //expand
        }         

        //update the new row 
        for(int j=0; j<numV+1; j++) {
            data[numV][j] = 0;
        } 

       
        //update the columns
        for(int i=0; i<numV+1; i++) {
            data[i][numV+1] = 0;
        }
        numV += 1;

    }

    //Add a directed edge from v to w
    public void addEdge(int v, int w) {
        data[v][w] = 1;
    }

    //Remove a vertex from the graph
    public void removeVertex(int v) {
        //reset the vertex row


        //Remember to updates edges which might have links to v

    }

    //Remove the edge from v to w
    public void removeEdge(int v, int w) {
        data[v][w] = 0;
    }

    /*
    public void dfs() {
       int[] visited = new int[numV];
       System.out.println("Depth First Traversal");
       dfs(0, visited); 
    }

    public void dfs(int v, int[] visited) {
        System.out.println(v);
        int[] children = children(v);
        //dfs over the children if they're not visited 

        for (int i=0; i<length; i++) {
            //if not visited
            if (children[i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                dfs(i, visited);
            }
        }
    }
    */

    private int[] children(int v) {
        //a 1 in slot i indicates that i is a child of v
        int[] children = new int[numV];

        for (int i=0; i<numV; i++) {
            if (data[v][i] == 1) {
                children[i] = 1;
            }
        }
        
        return children;
    }


    public void printGraph() {
        for (int v = 0; v < numV; v++) {
            System.out.println("Adjacency matrix vertex " + v);
            for (int v2 = 0; v2 < numV; v2++) {
                if (data[v][v2] == null) continue;
                System.out.print(data[v][v2] + " ");
            }

            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        // Create a directed graph with 5 vertices
        MatrixGraph graph = new MatrixGraph();
        //add 5 vertices (0, 1, 2, 3, and 4)
        graph.addVertex();
        //graph.printGraph();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 1);
        graph.addEdge(4, 3);

        // Add a 5th vertex and an edge
        graph.addVertex();
        graph.addEdge(4, 5);

        // Print the adjacency matrix representation of the graph
        graph.printGraph();

        graph.removeEdge(0, 1);
        graph.removeVertex(4);

        // Print the modified graph
        System.out.println("After removing edge (0, 1) and vertex 4:");
        graph.printGraph();
    }
}
