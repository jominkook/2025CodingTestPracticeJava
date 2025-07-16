package backjoon;

import java.util.Scanner;

//파이썬으로 결과 제출시 오류안남
//현재 틀린 코드..

public class Solved_10826_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N == 0){
            System.out.println(0);
        }else if(N == 1){
            System.out.println(1);
        }else {
            long [] dp = new long[10001];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.println(dp[N]);
        }
    }
}
