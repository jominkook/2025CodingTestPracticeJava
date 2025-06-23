package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_2531_5 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");
        int n = Integer.parseInt(buffer[0]); // 접시 수
        int d = Integer.parseInt(buffer[1]); // 초밥 가짓수
        int k = Integer.parseInt(buffer[2]); // 연속해서 먹는 접시 수
        int c = Integer.parseInt(buffer[3]); // 쿠폰 번호

        int [] sushi = new int[n+k-1]; // 회전 벨트(원형이므로 k-1만큼 뒤에 복사)
        for(int i = 0; i<n; i++){
            sushi[i] = Integer.parseInt(br.readLine());
        }

        // 먹은 초밥 종류 카운트 배열
        int [] eaten = new int[d+1];

        // 쿠폰 초밥 미리 먹었다고 가정
        int max = 1;
        eaten[c] = 1;

        // 원형 벨트 구현: 앞의 k-1개를 뒤에 복사
        for(int i = 0; i<k-1; i++){
            sushi[n++] = sushi[i];
        }

        // 첫 윈도우(0~k-1)에서 먹은 초밥 종류 세기
        int start = 0;
        for(int i = start; i<k; i++){

            if(eaten[sushi[i]] == 0){
                max++;
            }
            eaten[sushi[i]] += 1;
        }

        start = 0;
        int result = max;
        int end = k;

        // 슬라이딩 윈도우로 한 칸씩 이동하며 최대 종류 개수 갱신
        for(int i = end; i<sushi.length; i++){
            // 윈도우에서 빠지는 초밥
            if(eaten[sushi[start]] == 1){
                result -= 1;
            }
            eaten[sushi[start]] -= 1;
            start++;

            // 윈도우에 새로 들어오는 초밥
            if(eaten[sushi[i]] == 0){
                result += 1;
            }
            eaten[sushi[i]] += 1;

            // 최대값 갱신
            max = Math.max(result, max);
        }
        // 결과 출력
        System.out.println(max);
    }
}
