package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_2531_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int d = Integer.parseInt(buffer[1]);
        int k = Integer.parseInt(buffer[2]);
        int c = Integer.parseInt(buffer[3]);

        int[] sushi = new int[N];

        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        int[] eaten = new int[d + 1];
        int result = 0;

        // 초기 윈도우
        for (int i = 0; i < k; i++) {
            if (eaten[sushi[i]] == 0) result++;
            eaten[sushi[i]]++;
        }

        int max = result;
        if (eaten[c] == 0) max++;

        for(int i = 1; i<N; i++){
            eaten[sushi[i-1]]--;
            if(eaten[sushi[i-1]] == 0) result--;

            int next = sushi[(i + k - 1) % N];
            if (eaten[next] == 0) result++;
            eaten[next]++;

            int temp = result;
            if (eaten[c] == 0) temp++;
            max = Math.max(max, temp);


        }
        System.out.println(max);

    }

}
