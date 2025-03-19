import java.util.Scanner;

public class Solved_15989_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] dp = new int[10001];
        dp[0] = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10000; j++) {
                if (j - i >= 0) {
                    dp[j] += dp[j - i];
                }
            }
        }
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            System.out.println(dp[n]);
        }
    }
}