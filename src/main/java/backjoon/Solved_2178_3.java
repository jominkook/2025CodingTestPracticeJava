package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solved_2178_3 {
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int [][] graph;
    static boolean [][] visited;
    static int M,N,nx,ny;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);

        graph = new int[N][M];
        visited = new boolean[N][M];


        for(int i = 0; i<N; i++){
            String input = br.readLine();
            for(int j = 0; j<M; j++){
                graph[i][j] = input.charAt(j) - '0';
            }
        }
        System.out.println(bfs(graph,0,0,visited));

    }
    private static int bfs(int [][] graph,int x ,int y,boolean[][] visited){
        Deque<int []> deque = new ArrayDeque<>();
        visited[x][y] = true;
        deque.add(new int[]{x,y});

        while (!deque.isEmpty()){
            int [] curr = deque.poll();

            int curX = curr[0];
            int curY = curr[1];

            for(int i = 0; i<4; i++){
                nx = curX + dx[i];
                ny = curY + dy[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                    if(graph[nx][ny] == 1 && !visited[nx][ny]){
                        deque.add(new int[]{nx,ny});
                        graph[nx][ny] = graph[nx][ny] + graph[curX][curY];
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return graph[N-1][M-1];

    }
}
