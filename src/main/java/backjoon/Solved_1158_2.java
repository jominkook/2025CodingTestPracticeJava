package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solved_1158_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> people = new ArrayList<>();
        for(int i = 1; i<=N; i++){
            people.add(i);
        }
        List<String> result = new ArrayList<>();
        int idx = 0;

        while (!people.isEmpty()){
            idx = (idx + K - 1) % people.size();
            result.add(String.valueOf(people.remove(idx)));
        }
        System.out.println("<" + String.join(", ",result) + ">");
    }
}
