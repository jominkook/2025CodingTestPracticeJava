package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_2531_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int d = Integer.parseInt(buffer[1]);
        int k = Integer.parseInt(buffer[2]);
        int c = Integer.parseInt(buffer[3]);

        int[] sushi = new int[N + k - 1];

        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        int[] eaten = new int[d + 1];
        eaten[c] = eaten[c] + 1;

        int start = 0;
        int max = 1;

        for(int i = 0; i<k-1; i++){
            sushi[N++] = sushi[i];
        }

        for(int i = start; i<k; i++){
            if(eaten[sushi[i]] == 0){
                max++;
            }
            eaten[sushi[i]] = eaten[sushi[i]] + 1;
        }

        start = 0;
        int result = max;
        int end = k;

        for(int i = end; i<sushi.length; i++){
            eaten[sushi[start]] = eaten[sushi[start]] - 1;

            if(eaten[sushi[start]] == 0){
                result -= 1;
            }

            if(eaten[sushi[i]] == 0){
                result += 1;
            }

            eaten[sushi[i]] = eaten[sushi[i]] + 1;
            max =  Math.max(max, result);
            start++;
        }
        System.out.println(max);

    }

}
