package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_2531_17 {
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
        int cnt = 0;

        // 초기 윈도우
        for (int i = 0; i < k; i++) {
            if (eaten[sushi[i]] == 0) cnt++;
            eaten[sushi[i]]++;
        }

        int max = cnt;
        // 쿠폰 초밥이 윈도우에 없으면 +1
        if (eaten[c] == 0) max++;

        // 슬라이딩 윈도우
        for (int i = 1; i < N; i++) {
            // 맨 앞 초밥 제거
            eaten[sushi[i - 1]]--;
            if (eaten[sushi[i - 1]] == 0) cnt--;

            // 맨 뒤 초밥 추가 (원형)
            int next = sushi[(i + k - 1) % N];
            if (eaten[next] == 0) cnt++;
            eaten[next]++;

            int temp = cnt;
            if (eaten[c] == 0) temp++;
            max = Math.max(max, temp);
        }

        System.out.println(max);
    }
}