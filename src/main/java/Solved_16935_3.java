import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_16935_3 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int [][] dp = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 1;

        for(int i = 1; i<n; i++){
            dp[i][0] = 1;
            dp[i][i] = 1;

            for(int j = 1; j <i; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[n-1][k-1]);
    }
}
