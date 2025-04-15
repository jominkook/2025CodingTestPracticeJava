package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solved_1260_1 {
    public static boolean [] visited;
    public static List<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);
        int V = Integer.parseInt(buffer[2]);

        for(int i = 0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<M; i++){
            String [] pos = br.readLine().split(" ");
            int a = Integer.parseInt(pos[0]);
            int b = Integer.parseInt(pos[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 0; i<=N; i++){
            Collections.sort(graph.get(i));
        }
        visited = new boolean[N+1];
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }
    private static void dfs(int v){
        visited[v] = true;
        System.out.print(v + " ");

        for(int i : graph.get(v)){
            if(!visited[i]){
                dfs(i);
            }
        }

    }
    private static void bfs(int v){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(v);
        visited[v] = true;

        while (!deque.isEmpty()){
            int curr = deque.poll();
            System.out.print(curr + " ");
            for(int i : graph.get(curr)){
                if(!visited[i]){
                    deque.add(i);
                    visited[i] = true;
                }
            }
        }

    }
}
