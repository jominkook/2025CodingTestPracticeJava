package backjoon;

import java.util.Scanner;

public class Solved_2775_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] dp = new int[15][15];
        int res = 0;

        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < T; i++){
            int k = sc.nextInt();
            sc.nextLine();
            int n = sc.nextInt();

            for(int j = 0; j < 15; j++){
                dp[0][j] = j;
            }

            for(int j = 1; j <= 14; j++){
                for(int a = 1; a <= 14; a++){
                    dp[j][a] = dp[j][a-1] + dp[j-1][a];
                }


            }
            System.out.println(dp[k][n]);
        }

    }
}
