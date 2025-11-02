package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Solved_1260_9 {
    static List<List<Integer>> list = new ArrayList<>();
    static boolean [] visited;
    static int N,M,V;


    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);
        V = Integer.parseInt(buffer[2]);

        for(int i = 0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        visited = new boolean[N+1];

        for(int i = 0; i < M; i++){
            String [] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            list.get(x).add(y);
            list.get(y).add(x);
        }

        for(int a = 0; a<list.size(); a++){
            Collections.sort(list.get(a));
        }

        dfs(list,V,visited);
        System.out.println();
        visited = new boolean[N+1];
        bfs(list,V,visited);
    }

    private static void dfs(List<List<Integer>> list, int V, boolean[] visited){
        visited[V] = true;
        System.out.print(V + " ");
        for(int a :  list.get(V)){
            if(!visited[a]){
                dfs(list,a,visited);
            }
        }
    }

    private static void bfs(List<List<Integer>> list, int V, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[V] = true;
        q.add(V);
        while(!q.isEmpty()){
            int v = q.poll();
            System.out.print(v + " ");
            for(int a : list.get(v)){
                if(!visited[a]){
                    q.add(a);
                    visited[a] = true;
                }
            }

        }
    }
}
