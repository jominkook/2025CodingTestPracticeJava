package backjoon;

import java.util.Scanner;

public class Solved_15989_6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] dp = new int[10001];

        dp[0] = 1;
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 3;
//        dp[4] = 5;

        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i<4; i++){
            for(int j = 0; j<10001; j++){
                if(j >= i){
                    dp[j] += dp[j-i];
                }
            }
        }

        for(int i = 0; i<T; i++){
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println(dp[n]);
        }
    }
}
