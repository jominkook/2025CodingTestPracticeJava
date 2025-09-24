package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_9 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String target =  br.readLine();

        Queue<Character> targetQueue = new LinkedList<>();

        int i = 0;
        for(Character ch : target.toCharArray()){
            targetQueue.add(ch);
        }

//        System.out.println(targetQueue.size());

        while(!targetQueue.isEmpty()){
            i++;
            String nums = String.valueOf(i);
            Queue<Character> numsqueue = new LinkedList<>();

            for(Character ch : nums.toCharArray()){
                numsqueue.add(ch);
            }

            while(!targetQueue.isEmpty() && !numsqueue.isEmpty()){
                if(targetQueue.peek().equals(numsqueue.peek())){
                    targetQueue.poll();
                }
                numsqueue.poll();
            }
        }
        System.out.println(i);

    }
}

