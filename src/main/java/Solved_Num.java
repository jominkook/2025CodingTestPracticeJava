import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_Num {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 숫자를 저장할 큐
        Queue<String> queue = new LinkedList<>();

        String [] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];

        queue.add(a);
        queue.add(b);

        int K = Integer.parseInt(br.readLine());
        int count = 0; // 몇 번째 숫자인지 카운트

        while (!queue.isEmpty()) {
            // 큐에서 숫자를 하나 꺼냄
            String current = queue.poll();
            count++;

            // 11번째 숫자라면 출력하고 종료
            if (count == K) {
                System.out.println(current);
                break;
            }

            // 현재 숫자에 a와 b를 붙여서 큐에 추가 (0으로 시작하지 않는 경우만)
            if (!current.startsWith("0")) {
                queue.add(current + a);
                queue.add(current + b);
            }
        }
    }
}
