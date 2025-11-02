package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Solved_2178_10 {
    static int [][] graph;
    static boolean [][] visited;
    static int answer;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int N,M;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);

        graph = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String word = br.readLine();
            for(int j = 0; j < M; j++){
                graph[i][j] = word.charAt(j) - '0';
            }
        }

        System.out.println(bfs(graph,0,0,visited));


    }
    private static int bfs(int [][] graph,int x, int y, boolean [][] visited){
        Queue<int [] > q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new int[]{x,y});

        while(!q.isEmpty()){
            int [] curr = q.poll();
            int currX = curr[0];
            int currY = curr[1];

            for(int i = 0; i < 4; i++){
                int nx = currX + dx[i];
                int ny = currY + dy[i];

                if(nx >= 0 && nx <  N && ny >= 0 && ny < M && !visited[nx][ny]){
                    if(graph[nx][ny] == 1){
                        q.add(new int[]{nx,ny});
                        graph[nx][ny] += graph[currX][currY];
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return graph[N-1][M-1];


    }

}
