package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solved_21921_8 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");
        int sum = 0;


        int N = Integer.parseInt(buffer[0]);
        int X = Integer.parseInt(buffer[1]);

        int [] visited = new int[N];

        String [] input = br.readLine().split(" ");
        for(int i = 0; i<visited.length; i++){
            visited[i] = Integer.parseInt(input[i]);
        }

        for(int i = 0; i<X; i++){
            sum = sum + visited[i];
        }

        //System.out.println(sum);
        int max = sum;
        int count = 1;

        if(Arrays.stream(visited).sum() == 0){
            System.out.println("SAD");
            System.exit(0);
        }else{
            for(int i = X; i<N; i++){
                sum = sum - visited[i-X] + visited[i];

                if(sum > max){
                    max = sum;
                    count = 1;
                }else if(sum == max){
                    count += 1;
                }
            }
            System.out.println(max);
            System.out.println(count);
        }

    }
}
