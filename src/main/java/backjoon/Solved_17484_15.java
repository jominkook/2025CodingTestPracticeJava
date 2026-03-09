package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_17484_15 {
    static int result = Integer.MAX_VALUE;
    static int [] dy = {-1,0,1};
    static int [][] graph;
    static int N,M;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);

        graph = new int[N][M];

        for(int i = 0; i < N; i++){
            String [] input = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i = 0; i<M; i++){
            dfs(0,i,-1,graph[0][i]);
        }

        System.out.println(result);
    }
    static void dfs(int px, int py , int pd, int cur){
        if (px == N - 1) {
            result = Math.min(result, cur);
        }else{
            for(int i = 0; i<3; i++){
                int ny = dy[i] + py;

                if(pd != i){
                    if(ny >= 0 && ny < M){
                        dfs(px+1,ny,i,cur+graph[px+1][ny]);
                    }
                }
            }
        }
    }

}

