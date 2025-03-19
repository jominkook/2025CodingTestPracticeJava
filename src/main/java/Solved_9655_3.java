import java.util.Scanner;


//백준 9655 돌게임문제
//자바로 풀이
public class Solved_9655_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int [] dp = new int[1002];

        dp[1] = 1;

        for(int i = 2; i <= N; i++){
            if(dp[i-1] == 0){
                dp[i] = 1;
            }else{
                dp[i] = 0;
            }
        }

        if(dp[N] == 1){
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }

    }
}
