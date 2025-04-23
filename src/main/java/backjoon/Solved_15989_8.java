package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_15989_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] dp = new int[10001];

        dp[0] = 1;

        for(int i = 1; i<4; i++){
            for(int j = 0; j < 10001; j++){
                if(j >= i){
                    dp[j] += dp[j - i];
                }
            }
        }

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i< T; i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N]);
        }

    }
}
