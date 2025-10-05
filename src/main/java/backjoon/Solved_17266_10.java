package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Solved_17266_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int M = Integer.parseInt(br.readLine().trim());

        int[] lights = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            lights[i] = Integer.parseInt(st.nextToken());
        }

        // 혹시 입력이 정렬되어 있지 않을 경우 대비 (대부분 문제는 정렬되어 옴)
        Arrays.sort(lights);

        if (M == 1) {
            // 한 개면 양 끝 중 더 먼 쪽이 필요한 높이
            System.out.println(Math.max(lights[0], N - lights[0]));
            return;
        }

        int maxDistance = Math.max(lights[0], N - lights[M - 1]); // 양 끝 구간 반영

        for (int i = 1; i < M; i++) {
            int gap = lights[i] - lights[i - 1];
            int need = (gap + 1) / 2; // 절반 올림
            maxDistance = Math.max(maxDistance, need);
        }

        System.out.println(maxDistance);
    }
}