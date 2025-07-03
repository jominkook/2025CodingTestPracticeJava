package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_14889_2 {
    static int [][] graph;
    static int N;
    static int result = Integer.MAX_VALUE;
    static boolean [] visited;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        graph = new int [N][N];
        visited = new boolean [N];

        for(int i=0;i<N;i++){
            String [] input = br.readLine().split(" ");
            for(int j=0;j<N;j++){
                graph[i][j] = Integer.parseInt(input[j]);
            }

        }
        dfs(0,0);
        System.out.println(result);
    }
    private static void dfs(int start, int depth) {
        if(depth == N / 2){
            calcDiff();
            return;
        }

        for(int i = start; i<N; i++){
            visited[i] = true;
            dfs(i+1, depth + 1);
            visited[i] = false;
        }
    }
    private static void calcDiff(){
        int start = 0;
        int link = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i] && !visited[j]){
                    start +=  graph[i][j];
                } else if(visited[i] && visited[j]) {
                    link +=  graph[i][j];
                }
            }
        }
        result = Math.min(result, Math.abs(start - link));
    }
}


