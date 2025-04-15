package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_15989_5 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        int [] dp = new int[10001];

        for(int i = 0; i<dp.length; i++){
            dp[i] = 0;
        }
        dp[0] = 1;

        for(int i = 1; i<4; i++){
            for(int j = 1; j<10001; j++){
               if(j >= i){
                   dp[j] += dp[j-i];
               }
            }
        }
        for(int i = 0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N]);
        }
    }
}
