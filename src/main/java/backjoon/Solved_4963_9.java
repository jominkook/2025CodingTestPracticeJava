package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_4963_9 {
    static int [][] graph;
    static int [] dx = {-1,1,0,0,-1,1,1,-1};
    static int [] dy = {0,0,-1,1,1,-1,1,-1};
    static boolean [][] visited;
    static int w,h;
    static int count = 0;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String [] buffer = br.readLine().split(" ");
            w = Integer.parseInt(buffer[0]);
            h = Integer.parseInt(buffer[1]);

            if(w == 0 && h == 0){
                break;
            }

            visited = new boolean[h][w];
            graph = new int[h][w];
            count = 0;

            for(int i = 0; i < h; i++){
                String [] input = br.readLine().split(" ");
                for(int j = 0; j < w; j++){
                    graph[i][j] = Integer.parseInt(input[j]);
                }
            }

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(graph[i][j] == 1 && !visited[i][j]){
                        dfs(graph,i,j,visited);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static void dfs(int [][] graph,int x,int y,boolean[][] visited){
        visited[x][y] = true;

        for(int k = 0; k < 8; k++){
            int nx = dx[k] + x;
            int ny = dy[k] + y;

            if(nx >= 0 && nx < h && ny >= 0 && ny < w && !visited[nx][ny]){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(graph,nx,ny,visited);
                }
            }
        }
    }
}
