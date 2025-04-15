package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_24499_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");

        int sum = 0;

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        List<Integer> applePie = new ArrayList<>();
        String [] input2 = br.readLine().split(" ");
        for(int i= 0; i<N; i++){
            applePie.add(Integer.parseInt(input2[i]));
        }
        //원모양 구축이라 인덱스 깨지면 안됨
        //Collections.sort(applePie);
        for(int i = 0; i<K; i++){
            sum += applePie.get(i);
        }
        int max = sum;

        for(int i = 1; i<N; i++){
            sum = sum - applePie.get((i - 1) % N) + applePie.get((i + K - 1) % N);
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
