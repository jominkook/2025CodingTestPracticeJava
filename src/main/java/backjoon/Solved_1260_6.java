package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solved_1260_6 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int count = 0;
    static boolean [] visited;
    static int N,M;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
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
            int x = Integer.parseInt(pos[0]);
            int y = Integer.parseInt(pos[1]);

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        visited = new boolean[N+1];
        dfs(graph,V,visited);
        System.out.println();
        visited = new boolean[N+1];
        bfs(graph,V,visited);
    }
    private static void dfs(List<List<Integer>> graph,int start ,boolean [] visited){
        visited[start] = true;
        System.out.print(start + " ");

        for(int a : graph.get(start)){
            if(!visited[a]){
                dfs(graph,a,visited);
            }
        }
    }
    private static void bfs(List<List<Integer>> graph,int start,boolean [] visited){
        Deque<Integer> deque = new ArrayDeque<>();
        visited[start] = true;
        deque.add(start);

        while (!deque.isEmpty()){
            int cull = deque.poll();
            System.out.print(cull + " ");
            for(int a : graph.get(cull)){
                if(!visited[a]){
                    deque.add(a);
                    visited[a] = true;
                }
            }
        }
    }
}
