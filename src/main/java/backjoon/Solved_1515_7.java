package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_7 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Character> queue = new LinkedList<>();

        String num = br.readLine();

        for(Character c : num.toCharArray()){
            queue.add(c);
        }
        int i = 0;
        while (!queue.isEmpty()){
            Queue<Character> queue2 = new LinkedList<>();
            i++;
            String nums = String.valueOf(i);

            for(Character c : nums.toCharArray()){
                queue2.add(c);
            }

            while (!queue2.isEmpty() && !queue.isEmpty()){
                if(queue2.peek() == queue.peek()){
                    queue.poll();
                }
                queue2.poll();
            }
        }
        System.out.println(i);


    }
}
