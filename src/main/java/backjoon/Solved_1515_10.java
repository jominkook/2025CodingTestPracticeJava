package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_10 {
    public static void main(String [] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String target =  br.readLine();

        Queue<Character> targetQueue = new LinkedList<>();

        for(char a :  target.toCharArray()){
            targetQueue.add(a);
        }
        int i = 0;

        while(!targetQueue.isEmpty()){
            i++;
            String nums = String.valueOf(i);

            Queue<Character> tempQueue = new LinkedList<>();

            for(char num :  nums.toCharArray()){
                tempQueue.add(num);
            }

            while(!tempQueue.isEmpty() && !targetQueue.isEmpty()){
                if(tempQueue.peek() == targetQueue.peek()){
                    targetQueue.poll();
                }
                tempQueue.poll();
            }
        }
        System.out.println(i);
    }
}
