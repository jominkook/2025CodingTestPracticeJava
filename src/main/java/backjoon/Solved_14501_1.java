package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_14501_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());
        int [] t = new int[N+1];
        int [] p = new int[N+1];
        int [] dp =  new int[N+2];

        dp[0] = 0;

        for(int i = 1; i <= N; i++){
            String [] input = br.readLine().split(" ");
            t[i] = Integer.parseInt(input[0]);
            p[i] = Integer.parseInt(input[1]);
        }

        //미래의 값이 필요 -> 뒤에값을 계산한후 비교 ->상담이 끝난 이후의 최대 이익
        for(int i = N; i >= 1; i--){
            if(i + t[i] > N){
                dp[i] = dp[i+1];
            }else{
                dp[i] = Math.max(dp[i + 1], p[i] + dp[i + t[i]]);
            }
        }
        System.out.println(dp[1]);

    }
}
