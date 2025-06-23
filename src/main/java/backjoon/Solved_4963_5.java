package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solved_4963_5 {
    static int W,H;
    static int [][] graph;
    static boolean [][] visited;
    static int count = 0;
    static int [] dx = {-1,1,0,0,1,-1,1,-1};
    static int [] dy = {0,0,-1,1,-1,-1,1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String [] buffer = br.readLine().split(" ");
            W = Integer.parseInt(buffer[0]);
            H = Integer.parseInt(buffer[1]);

            graph = new int[H][W];
            visited = new boolean[H][W];

            if(W == 0 && H == 0){
                break;
            }

            for(int i = 0; i<H; i++){
                String [] input = br.readLine().split(" ");
                for(int j = 0; j<W; j++){
                    graph[i][j] = Integer.parseInt(input[j]);
                }
            }

            count = 0;
            for(int i = 0; i<H; i++){
                for(int j = 0; j<W; j++){
                    if(graph[i][j] == 1 && !visited[i][j]){
                        dfs(graph,i,j,visited);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }
    }
    private static void dfs(int [][] graph,int x, int y, boolean [][] visited){
        visited[x][y] = true;

        for(int i = 0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < H && ny >= 0 && ny < W){
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    dfs(graph,nx,ny,visited);
                }
            }
        }
    }
}
