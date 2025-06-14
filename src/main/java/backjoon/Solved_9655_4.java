package backjoon;

import java.util.Scanner;

public class Solved_9655_4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] dp = new int[1001];

        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=N; i++){
            if(dp[i-1] == 0){
                dp[i] = 1;
            }else{
                dp[i] = 0;
            }
        }

        if(dp[N] == 0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }


    }
}
