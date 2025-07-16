package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_14501_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());

        int [] ti = new int[N+1];
        int [] pi = new int[N+1];

        int [] dp = new int[N+2];


        for(int i=0; i<N; i++){
            String [] buffer = br.readLine().split(" ");
            ti[i] = Integer.parseInt(buffer[0]);
            pi[i] = Integer.parseInt(buffer[1]);
        }


        dp[0] = 0;

        for(int i = N; i>=1; i--){
            if(i + ti[i] > N){
                dp[i] = dp[i - 1];
            }else{
                dp[i] = Math.max(dp[i + 1], pi[i] + dp[i + ti[i]]);
            }
        }
        System.out.println(dp[1]);
    }
}

