package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_2178_8 {
    static int count = 0;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int [][] graph;
    static boolean[][] visited;
    static int N,M;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");


        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);

        graph = new int [N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++){
            String [] pos = br.readLine().split(" ");
            for(int j=0;j<M;j++){
                graph[i][j] = Integer.parseInt(pos[j]);
            }
        }
        System.out.println(bfs(graph,0,0,visited));
    }
    private static int bfs(int [][] graph,int x,int y,boolean[][] visited){
        Deque<int []> deque = new LinkedList<>();
        visited[x][y] = true;
        deque.add(new int[]{x,y});

        while(!deque.isEmpty()){
            int [] cur =  deque.poll();

            int posX =  cur[0];
            int posY =  cur[1];

            for(int i=0;i<4;i++){
                int nx = posX+dx[i];
                int ny = posY+dy[i];

                if(nx>=0 && ny>=0 && nx<N && ny<M){
                    if(!visited[nx][ny] && graph[nx][ny]==1){
                        deque.add(new int[]{nx,ny});
                        graph[nx][ny] += graph[posX][posY];
                        visited[nx][ny] = true;
                    }
                }
            }

        }
        return graph[N-1][M-1];
    }
}
