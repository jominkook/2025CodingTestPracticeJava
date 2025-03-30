import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_1012_3 {
    static int count = 0;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int M,N,nx,ny;
    static int [][] graph;
    static boolean [][] visited;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i<T; i++){
            String [] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]);
            N = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            graph = new int[N][M];
            visited = new boolean[N][M];

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
                        dfs(graph,j,k,visited);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static void dfs(int [][] graph,int x, int y, boolean[][] visited){
        visited[x][y] = true;

        for(int i = 0; i<4; i++){
            nx = x + dx[i];
            ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    graph[nx][ny] = graph[x][y] + graph[nx][ny];
                    dfs(graph,nx,ny,visited);
                }
            }
        }
    }
}
