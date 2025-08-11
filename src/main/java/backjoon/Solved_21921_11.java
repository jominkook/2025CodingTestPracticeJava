package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_21921_11 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int X = Integer.parseInt(buffer[1]);

        String [] input = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            list.add(Integer.parseInt(input[i]));
        }

        int sum = 0;
        for(int i = 0; i<X; i++){
            sum += list.get(i);
        }
        int max = sum;
        int count = 1;

        if(max == 0){

            System.out.println("SAD");
            System.exit(0);
        }else{
            for(int i = X; i<list.size(); i++){
                sum = sum  - list.get(i-X) + list.get(i);

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
