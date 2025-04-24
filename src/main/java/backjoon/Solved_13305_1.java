package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_13305_1 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Long[] dist = new Long[N - 1];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N - 1; i++) {
            dist[i] = (long)Integer.parseInt(input[i]);
        }

        Long[] liter = new Long[N];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < N - 1; i++) {
            dist[i] =  (long)Integer.parseInt(input2[i]);
        }

        Long minLiter = liter[0];
        long result = 0;

        for (int i = 0; i < N - 1; i++) {
            if (minLiter > liter[i]) {
                minLiter = liter[i];
            }
            result += (long) minLiter * dist[i];
        }
        System.out.println(result);
    }
}
