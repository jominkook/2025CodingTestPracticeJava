package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_1012_15 {
    static int [][] graph;
    static boolean [][] visited;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int count = 0;
    static int T,M,N,K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        String [] buffer = br.readLine().split(" ");

        for(int i = 0; i<T; i++){
            M = Integer.parseInt(buffer[0]);
            N = Integer.parseInt(buffer[1]);
            K = Integer.parseInt(buffer[2]);

            graph = new int[N][M];
            visited = new boolean[N][M];

            for(int j = 0; j<K; j++){
                String [] input = br.readLine().split(" ");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                graph[y][x] = 1;
            }

            for(int j = 0; j<N; j++){
                for(int k = 0; k<M; k++){
                    if(graph[j][k] == 1 && !visited[j][k]){
                        dfs(graph,j,k,visited);
                    }
                }
            }
        }
    }
    private static void dfs(int [][] graph,int x, int y, boolean [][] visited){
        
    }
}
