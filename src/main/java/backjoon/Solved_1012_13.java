package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_1012_13 {
    public static int count = 0;
    public static int nx,ny;
    public static boolean [][] visited;
    public static int [][] graph;
    public static int [] dx = {-1,1,0,0};
    public static int [] dy = {0,0,-1,1};

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i<T; i++){
            String [] buffer = br.readLine().split(" ");

            int M = Integer.parseInt(buffer[0]);
            int N = Integer.parseInt(buffer[1]);
            int K = Integer.parseInt(buffer[2]);

            visited = new boolean[N][M];
            graph = new int[N][M];

            for(int j = 0; j<K; j++){
                String [] pos = br.readLine().split(" ");
                int X = Integer.parseInt(pos[0]);
                int Y = Integer.parseInt(pos[1]);

                graph[Y][X] = 1;
            }
            count = 0;

            for(int j = 0; j<N; j++){
                for(int k = 0; k<M; k++){
                    if(graph[j][k] == 1 && !visited[j][k]){
                        dfs(j,k,N,M);
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static void dfs(int x, int y, int N, int M){
        visited[x][y] = true;

        for(int i = 0; i<4; i++){
            nx = x + dx[i];
            ny = y + dy[i];
            if(nx >=0 && nx < N && ny >=0 && ny < M){
                if(graph[nx][ny] ==1 && !visited[nx][ny]){
                    dfs(nx,ny,N,M);
                }
            }
        }
    }
}
