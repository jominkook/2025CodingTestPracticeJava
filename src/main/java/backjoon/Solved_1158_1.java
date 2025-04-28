package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solved_1158_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=N; i++){
            queue.add(i);
        }

        //System.out.println(queue);
        StringBuilder result = new StringBuilder();
        result.append("<");

        while (!queue.isEmpty()){
            for(int i = 0; i<K-1; i++){
                queue.add(queue.poll());
            }
            result.append(queue.poll());
            if(!queue.isEmpty()){
                result.append(", ");
            }
        }
        result.append(">");
        System.out.println(result);
    }
}
