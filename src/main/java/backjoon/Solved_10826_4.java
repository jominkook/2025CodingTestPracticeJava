package backjoon;//백준 10826 피보나치수4
//dp풀이
//BigInteger 방식
//에러 해결
import java.math.BigInteger;
import java.util.Scanner;

public class Solved_10826_4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        BigInteger [] dp = new BigInteger[10001];

        dp[0] = new BigInteger("0");
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("1");

        for(int i = 3; i<=N; i++){
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        System.out.println(dp[N]);

    }
}
