package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_4963_2 {
    static int count = 0;
    static int [] dx = {-1,1,0,0,-1,-1,1,1};
    static int [] dy = {0,0,-1,1,-1,1,-1,1};
    static int [][] graph;
    static boolean [][] visited;
    static int h,w;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String [] buffer = br.readLine().split(" ");
            w = Integer.parseInt(buffer[0]);
            h = Integer.parseInt(buffer[1]);

            if(w == 0 && h == 0){
                break;
            }

            graph = new int[h][w];
            visited = new boolean[h][w];


            for(int i = 0; i<h; i++){
                String [] input = br.readLine().split(" ");
                for(int j = 0; j<w; j++){
                    graph[i][j] = Integer.parseInt(input[i]);
                }
            }

            count = 0;
            for(int i = 0; i<h; i++){
                for(int j = 0; j<w; j++){
                    if(!visited[i][j] && graph[i][j] == 1){
                        dfs(graph,i,j,visited);
                    }

                }
            }
            System.out.println(count);
        }
    }
    private static void dfs(int [][] graph,int x , int y, boolean [][] visited){
        visited[x][y] = true;

        for(int i = 0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < h && ny >= 0 && ny < w){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(graph,nx,ny,visited);
                    count++;
                }
            }
        }
    }
}
