package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_6 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> queue = new LinkedList<>();
        String target = br.readLine();
        int i = 0;

        for(Character a : target.toCharArray()){
            queue.add(a);
        }

        while (!queue.isEmpty()){
            Queue<Character> queue2 = new LinkedList<>();
            i++;
            String nums = String.valueOf(i);

            for(Character a : nums.toCharArray()){
                queue2.add(a);
            }
            while (!queue.isEmpty() && !queue2.isEmpty()){
                if(queue.peek() == queue2.peek()){
                    queue.poll();
                }
                queue2.poll();
            }
        }
        System.out.println(i);
    }
}
