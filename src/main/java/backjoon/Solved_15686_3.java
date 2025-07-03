package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_15686_3 {
    static int [][] graph;
    static int N,M;
    static int result = Integer.MAX_VALUE;
    static boolean [] visited;
    static List<int []> home = new ArrayList<>();
    static List<int []> chicken = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);

        graph = new int [N][N];
        visited = new boolean [N];
        for(int i=0; i<N; i++){
            String [] input = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                graph[i][j] = Integer.parseInt(input[j]);

                if(graph[i][j] == 1){
                    home.add(new int []{i,j});
                }else if(graph[i][j] == 2){
                    chicken.add(new int []{i,j});
                }
            }

        }
        dfs(0,0);
        System.out.println(result);
    }
    private static void dfs(int start, int count){
        if(count == M) {
            int sum = 0;

            for(int [] h  : home){
                int min =  Integer.MAX_VALUE;
                for(int c = 0; c < chicken.size(); c++){
                    if(visited[c]){
                        int dist = Math.abs(h[0]-chicken.get(c)[0]) + Math.abs(h[1]-chicken.get(c)[1]);
                        min =  Math.min(min, dist);
                    }
                }
                sum += min;
            }
            result = Math.min(result, sum);
            return;
        }
        for(int i = start; i<N; i++){
            visited[i] = true;
            dfs(i+1,count+1);
            visited[i] = false;
        }
    }
}
