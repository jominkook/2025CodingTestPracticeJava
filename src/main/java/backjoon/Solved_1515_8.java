package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_8 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        int i = 0;
        Queue<Character> numQueue = new LinkedList<>();


        for(Character c : num.toCharArray()){
            numQueue.add(c);
        }

        while(!numQueue.isEmpty()){
            i++;
            String nums = String.valueOf(i);

            Queue<Character> numsQueue = new LinkedList<>();

            for(Character c : nums.toCharArray()){
                numsQueue.add(c);
            }
            while(!numsQueue.isEmpty() && !numQueue.isEmpty()){
                if(numsQueue.peek() == numQueue.peek()){
                    numQueue.poll();
                }
                numsQueue.poll();
            }
        }
        System.out.println(i);
    }
}
