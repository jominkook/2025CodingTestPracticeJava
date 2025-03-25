import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solved_2178_1 {
    static int [][] graph;
    static boolean [][] visited;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);

        graph = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i<N; i++){
            String pos = br.readLine();
            for(int j = 0; j<M; j++){
                graph[i][j] = pos.charAt(j) - '0';
            }

        }
        System.out.println(bfs(0, 0, N, M));
    }
    private static int bfs(int x , int y, int N, int M){
        Deque<int [] > deque = new ArrayDeque<>();
        deque.add(new int [] {x,y});
        visited[x][y] = true;

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int curX = curr[0];
            int curY = curr[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                        deque.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        graph[nx][ny] = graph[curX][curY] + 1;
                    }
                }
            }

        }
        return graph[N-1][M-1];
    }
}
