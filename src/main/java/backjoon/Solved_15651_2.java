package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//시관초과
public class Solved_15651_2 {
    static int [] graph;
    static boolean [] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);

        graph = new int[M];
        visited = new boolean[N];

        dfs(N,M,0);
        System.out.println(sb);
    }
    private static void dfs(int N, int M, int depth){
        if(depth == M){
            for(int i = 0; i< M; i++){
                sb.append(graph[i] + " ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i<N; i++){
            visited[i] = false;
            graph[depth] = i+1;
            dfs(N,M,depth+1);
            visited[i] = true;
        }
    }
}
