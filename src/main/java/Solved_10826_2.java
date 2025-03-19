//백준 10826
// dp문제
// 실패(해당코드로는 대용량 수를 입력시 에러가 남)
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solved_10826_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        List<Long> dp = new ArrayList<>();
        dp.add(0L);
        dp.add(1L);
        dp.add(1L);

        for (int i = 3; i <= N; i++) {
            dp.add(dp.get(i - 1) + dp.get(i - 2));
        }

        System.out.println(dp.get(N));
    }
}