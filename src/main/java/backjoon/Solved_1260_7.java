package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solved_1260_7 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int N,M,V;
    static boolean [] visited;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);
        V = Integer.parseInt(buffer[2]);

        for(int i = 0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<M; i++){
            String [] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int a = 0; a<graph.size(); a++){
            Collections.sort(graph.get(a));
        }

        visited = new boolean[N+1];
        dfs(graph,V,visited);

        System.out.println();
        visited = new boolean[N+1];
        bfs(graph,V,visited);



    }
    private static void dfs(List<List<Integer>> graph,int start,boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");

        for(int a : graph.get(start)){
            if(!visited[a]){
                dfs(graph,a,visited);
            }
        }
    }
    private static void bfs(List<List<Integer>> graph,int start,boolean [] visited){
        Deque<Integer> deque = new LinkedList<>();
        visited[start] = true;
        deque.add(start);


        while (!deque.isEmpty()){
            int cur = deque.poll();
            System.out.print(cur + " ");
            for(int a : graph.get(cur)){
                if(!visited[a]){
                    deque.add(a);
                    visited[a] = true;
                }
            }
        }
    }
}
