package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_21921_8 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        int [] visited = new int[N];

        String [] input2 = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            visited[i] = Integer.parseInt(input2[i]);
        }

        int sum = 0;

        for(int i = 0; i<X; i++){
            sum += visited[i];
        }
        int max = sum;
        int count = 1;

        if(max == 0){
            System.out.println("SAD");
            System.exit(0);
        }else{
            for(int i = X; i<N; i++){
                sum = sum + visited[i] - visited[i-X];

                if(sum > max){
                    max = sum;
                    count = 1;
                }
                else if(max == sum){
                    count++;
                }
            }
            System.out.println(max);
            System.out.println(count);
        }
    }
}
