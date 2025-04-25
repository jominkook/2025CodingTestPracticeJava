package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_5 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> targetQueue = new LinkedList<>();
        int i = 0;
        String target = br.readLine();
        for(char a : target.toCharArray()){
            targetQueue.add(a);
        }

        while(!targetQueue.isEmpty()){
            i+=1;
            String nums = String.valueOf(i);
            Queue<Character> numQueue = new LinkedList<>();
            for(char a : nums.toCharArray()){
                numQueue.add(a);
            }

            while (!targetQueue.isEmpty() && !numQueue.isEmpty()){
                if(targetQueue.peek() == numQueue.peek()){
                    targetQueue.poll();
                }
                numQueue.poll();
            }
        }
        System.out.println(i);
    }
}
