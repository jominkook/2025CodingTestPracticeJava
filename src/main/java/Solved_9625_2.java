//백준 9625 BABBA
// dp문제
// 파이썬이아닌 자바로 문제풀이
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solved_9625_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        List<Integer> dp = new ArrayList<>();

        dp.add(0);
        dp.add(1);

        for(int i = 2; i<=K; i++){
            dp.add(dp.get(i-1) + dp.get(i-2));
        }
        System.out.println(dp.get(K-1) + " " + dp.get(K));
    }
}
