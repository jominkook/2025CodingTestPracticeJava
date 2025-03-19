import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solved_2491_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr [] = new int[N];

        int [] dp = new int[100001];
        int [] dp2 = new int[100001];

        for(int i = 0; i<dp.length; i++){
            dp[i] = 1;
        }

        for(int i = 0; i<dp2.length; i++){
            dp2[i] =1;
        }
        String [] input = br.readLine().split(" ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        for(int i = 1; i<arr.length; i++) {
            if(arr[i] >= arr[i-1]){
                dp[i] = dp[i-1] + 1;
                //System.out.print(dp[i]);

            }
        }
        //System.out.println();
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] <= arr[i-1]){
                dp2[i] = dp2[i-1] + 1;
                //System.out.print(dp2[i]);
            }
        }
        //System.out.println();
        int dpMax = Arrays.stream(dp).max().getAsInt();
        int dp2Max = Arrays.stream(dp2).max().getAsInt();

        System.out.println(Math.max(dpMax,dp2Max));

    }
}