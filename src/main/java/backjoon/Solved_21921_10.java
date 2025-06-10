package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_21921_10 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int X = Integer.parseInt(buffer[1]);

        List<Integer> day = new ArrayList<>();

        int sum = 0;
        int count = 0;

        String [] input = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            day.add(Integer.parseInt(input[i]));
        }

        for(int i = 0; i<X; i++){
            sum += day.get(i);
        }

        int max = sum;
        //System.out.println(max);
        if(max == 0){
            System.out.println("SAD");
            System.exit(0);
        } else{
            for(int i = X; i<N; i++){
                sum = sum + day.get(i) - day.get(i - X);

                if(sum > max){
                    max = sum;
                    count = 1;
                }else if(sum == max){
                    count++;
                }
            }
            System.out.println(max);
            System.out.println(count);
        }

    }
}
