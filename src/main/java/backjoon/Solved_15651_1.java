package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_15651_1 {
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");
        N = Integer.parseInt(buffer[0]);
        M = Integer.parseInt(buffer[1]);
        arr = new int[M];

        dfs(0);
        System.out.println(sb);
    }
    private static void dfs(int depth){
        if(depth == M){
            for(int i = 0; i<M; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i<=N; i++){
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}
