package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_17484_13 {
    static int [][] graph;
    static int result = Integer.MAX_VALUE;
    static int [] dy = {-1,0,1};
    static int N,M;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);
        graph = new int [N][M];

        for(int i = 0; i < N; i++){
            String [] input = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i = 0; i < M; i++){
            dfs(graph,0,i,-1,graph[0][i]);
        }
        System.out.println(result);
    }
    private static void dfs(int[][] graph, int px, int py, int pd, int curr){
        if(px == N-1){
            result = Math.min(result, curr);
        }else{
            for(int i = 0; i<3; i++){
                int ny = py + dy[i];

                if(ny >=0 && ny < M){
                    if(pd != i){
                        dfs(graph,px+1,ny,i,curr + graph[px+1][ny]);
                    }
                }
            }
        }
    }
}
