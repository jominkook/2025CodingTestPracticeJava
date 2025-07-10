package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_15649_2 {
    static int N,M;
    static int [] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);

        graph = new int[M];
        visited = new  boolean[N];

        dfs(N,M,0);
    }

    private static void dfs(int N, int M, int depth){
        if(depth == M){
            for(int num : graph){
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                graph[depth] = i+1;
                dfs(N,M,depth+1);
                visited[i] = false;
            }
        }
    }
}
