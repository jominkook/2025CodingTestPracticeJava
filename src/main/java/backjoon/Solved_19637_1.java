package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_19637_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);
        List<int[]> powerList = new ArrayList<>();
        String[] names = new String[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            names[i] = input[0];
            int power = Integer.parseInt(input[1]);
            powerList.add(new int[]{i, power});

        }
        //System.out.print(powerList + " ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int charPower = Integer.parseInt(br.readLine());
            int start = 0;
            int end = N - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                int midPower = powerList.get(mid)[1];

                if (midPower < charPower) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
            result.append(names[start]).append("\n");
        }
        System.out.println(result);
    }
}
