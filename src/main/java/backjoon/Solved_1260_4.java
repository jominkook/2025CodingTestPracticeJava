package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solved_1260_4 {
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean [] visited;

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
        //System.out.println(graph);

        for(int i = 0; i<=N; i++){
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N+1];
        dfs(graph,V,visited);
        System.out.println();
        visited = new boolean[N+1];
        bfs(graph,V,visited);
    }
    private static void dfs(List<ArrayList<Integer>> graph,int V,boolean [] visited){
        visited[V] = true;
        System.out.print(V + " ");

        for(int  a  : graph.get(V)){
            if(!visited[a]){
                dfs(graph,a,visited);
            }
        }
    }

    private static void bfs(List<ArrayList<Integer>> graph,int V,boolean [] visited){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(V);
        visited[V] = true;

        while (!deque.isEmpty()){
            int curr = deque.poll();
            System.out.print(curr + " ");
            for(int a : graph.get(curr)){
                if(!visited[a]){
                    deque.add(a);
                    visited[a] = true;
                }
            }
        }
    }
}
