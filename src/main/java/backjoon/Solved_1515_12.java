package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_12 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Character> targetQueue = new LinkedList<Character>();

        String target = br.readLine();
        for(char a :  target.toCharArray()){
            targetQueue.offer(a);
        }
        //System.out.println(targetQueue);
        int i = 0;
        while(!targetQueue.isEmpty()){
            i++;
            Queue<Character> numsQueue = new LinkedList<>();

            String nums = String.valueOf(i);

            for(char a : nums.toCharArray()){
                numsQueue.offer(a);
            }

            while(!numsQueue.isEmpty() && !targetQueue.isEmpty()){
                if(numsQueue.peek() == targetQueue.peek()){
                    targetQueue.poll();
                }
                numsQueue.poll();
            }

        }
        System.out.println(i);
    }
}
