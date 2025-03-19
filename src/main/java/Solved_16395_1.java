//백준 16935 파스칼의 삼각형
//dp풀이
//첫번째 풀이
import java.util.Scanner;

public class Solved_16395_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int [][] dp = new int[N][N];

        for(int i = 0; i<N; i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for(int i = 2; i<N; i++){
            for(int j = 1; j<K; j++){
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }
        System.out.println(dp[N-1][K-1]);
    }
}
