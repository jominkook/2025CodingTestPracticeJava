package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_17484_1 {
    static int N,M;
    static int [][] graph;
    static int answer = Integer.MAX_VALUE;
    static int [] dy = {-1,0,1};
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        graph = new int[N][M];

        for(int i = 0; i< N; i++){
            String [] input2 = br.readLine().split(" ");
            for(int j = 0; j<M; j++){
                graph[i][j] = Integer.parseInt(input2[j]);
            }
        }

        for(int i = 0; i<M; i++){
            dfs(0,i,-1,graph[0][i]);
        }

        System.out.println(answer);

    }
    private static void dfs(int px, int py, int pd, int cul){
        if(px == N - 1){
            answer = Math.min(answer,cul);
            return;
        }

        for(int i = 0; i<3; i++){
            int ny = py + dy[i];

            if(i != pd && ny >= 0 && ny < M){
                dfs(px + 1,ny,i,cul + graph[px+1][ny]);
            }
        }
    }
}
