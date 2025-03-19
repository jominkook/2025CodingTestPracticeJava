import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solved_2512_3 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] dp = new int[100001];
        int [] budgets = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int M = Integer.parseInt(br.readLine());

        int start = 0;
        int end = Arrays.stream(budgets).max().orElse(0);

        int res = 0;

        while (start <= end){
            int mid = (start + end) / 2;
            for(int i = 0; i < N; i++){
                dp[i] = Math.min(res,budgets[i]);
            }
            int sum = Arrays.stream(dp).limit(N).sum();

            if(sum > M){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        System.out.println(end);

    }
}
