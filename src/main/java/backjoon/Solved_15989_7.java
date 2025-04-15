package backjoon;

import java.util.Scanner;

public class Solved_15989_7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        int [] dp = new int[10001];

        for(int i = 0; i<dp.length; i++){
            dp[i] = 0;
        }
        dp[0] = 1;

        for(int i = 1; i<4; i++){
            for(int j = 0; j<10001; j++){
                if(j>=i){
                    dp[j] = dp[j] + dp[j-i];
                }
            }
        }

        for(int i = 0; i<T; i++){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
