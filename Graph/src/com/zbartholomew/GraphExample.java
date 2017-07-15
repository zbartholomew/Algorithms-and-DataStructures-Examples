package com.zbartholomew;

import java.util.LinkedList;

/**
 * Graph as a collection of lists
 */
public class GraphExample {

    private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer>[] adj;

    // Constructor
    GraphExample(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);  // Add w to v's list.
    }

    public static void main(String args[]) {
        GraphExample g = new GraphExample(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
    }
}
