package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solved_2531_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);

        int d = Integer.parseInt(buffer[1]);

        int k = Integer.parseInt(buffer[2]);

        int c = Integer.parseInt(buffer[3]);

        int [] sushi = new int[N + k];

        for(int i = 0; i<N; i++){
            sushi[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i<k-1; i++){
            sushi[N+i] = sushi[i];
        }

        int answer = 0;
        for(int i = 0; i<N; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i; j<i+k; j++){
                set.add(sushi[j]);
            }
            set.add(c);
            answer = Math.max(answer,set.size());
        }
        System.out.println(answer);
    }
}
