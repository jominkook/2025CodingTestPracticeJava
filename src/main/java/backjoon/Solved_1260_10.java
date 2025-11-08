package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solved_1260_10 {
    static int N,M,V;
    static boolean [] visited;
    static List<List<Integer>> graph = new ArrayList<List<Integer>>();

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);
        V = Integer.parseInt(buffer[2]);

        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            String [] input = br.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int a = 0; a < graph.size(); a++){
            Collections.sort(graph.get(a));
        }

        dfs(graph,V,visited);
        visited = new boolean[N+1];
        System.out.println();
        bfs(graph,V,visited);

    }
    private static void dfs(List<List<Integer>> graph, int V, boolean[] visited){
        visited[V] = true;
        System.out.print(V + " ");

        for(int a : graph.get(V)){
            if(!visited[a]){
                dfs(graph,a,visited);
            }
        }

    }

    private static void bfs(List<List<Integer>> graph, int V, boolean[] visited){
        visited[V] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        while(!q.isEmpty()){
            int curr =  q.poll();
            System.out.print(curr + " ");
            for(int a : graph.get(curr)){
                if(!visited[a]){
                    visited[a] = true;
                    q.add(a);

                }
            }
        }

    }
}
