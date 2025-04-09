import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Solved_2178_4 {
    static int count = 0;
    static int N,M;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int [][] graph;
    static boolean [][] visited;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");
        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);



        graph = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i<N; i++){
            String can = br.readLine();
            for(int j = 0; j<N; j++){
                graph[i][j] = can.charAt(j) - '0';
            }
        }
        System.out.println(bfs(graph,N,M,visited));
    }
    private static int bfs(int [][] graph,int x, int y,boolean[][]visited){
        Deque<int[]> deque = new ArrayDeque<>();
        count += bfs(graph,x,y,visited);
        deque.add(new int[]{x,y});
        visited[x][y] = true;

        while (!deque.isEmpty()){
            int [] curr = deque.poll();

            int curX = curr[0];
            int curY = curr[1];

            for(int i = 0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >=0 && nx < N && ny >= 0 && ny <M){
                    if(!visited[nx][ny]){
                        deque.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }

        }
        return bfs(graph,N-1,M-1,visited);
    }
}
