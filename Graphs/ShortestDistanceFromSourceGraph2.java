// Question:-
// Problem
// Given n, i.e. total number of nodes in an undirected graph numbered from 1 to n and an integer e, i.e. total number of edges in the graph. Find the shortest distance of all the node from the source node s.

// Input Format:

// First line of input line contains two integers n and e. Next e line will contain two integers u and v meaning that node u and node v are connected to each other in undirected fashion. Last line will contain an integer s denoting the source node.

// Output Format:

// For each input graph print the shortest distance of each node from the source node.

// Constraints:

// All the input values are well with in the integer range.

// Sample Input
// 5 4
// 1 2
// 2 3
// 2 4
// 3 5
// 2
// Sample Output
// 1 0 1 1 2 

import java.util.*;

public class ShortestDistanceFromSourceGraph2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of nodes
        int e = sc.nextInt(); // number of edges

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) { // index from 1 to n, so use <= n
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int s = sc.nextInt(); // source node
        int[] ans = shortestDistance(n, e, graph, s);

        for (int i = 1; i < ans.length; i++) {
            System.out.println("Node " + i + " -> Distance from source " + s + ": " + ans[i]);
        }
    }

    public static int[] shortestDistance(int n, int e, ArrayList<ArrayList<Integer>> adj, int s) {
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[s] = 0;
        q.add(s);

        while (!q.isEmpty()) {
            int rem = q.poll();
            for (int nbr : adj.get(rem)) {
                if (dist[nbr] == -1) {
                    dist[nbr] = dist[rem] + 1;
                    q.add(nbr);
                }
            }
        }
        return dist;
    }
}
