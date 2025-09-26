package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_1012_18 {
    static int T,N,M,K;
    static int count = 0;
    static int [][] graph;
    static boolean [][] visited;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String [] buffer = br.readLine().split(" ");
            M = Integer.parseInt(buffer[0]);
            N = Integer.parseInt(buffer[1]);
            K = Integer.parseInt(buffer[2]);


            graph = new int [N][M];
            visited = new boolean [N][M];


            for(int j = 0; j<K; j++){
                String [] temp = br.readLine().split(" ");
                int X =  Integer.parseInt(temp[0]);
                int Y = Integer.parseInt(temp[1]);

                graph[Y][X] = 1;
            }

            for(int j = 0; j < N; j++){
                for(int k = 0; k < M; k++){
                    if(graph[j][k] == 1 && !visited[j][k]){
                        dfs(graph,j,k,visited);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    private static void dfs(int [][] graph, int x, int y, boolean[][] visited){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx =  x + dx[i];
            int ny =  y + dy[i];

            if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(graph,nx,ny,visited);
                }
            }
        }

    }
}
