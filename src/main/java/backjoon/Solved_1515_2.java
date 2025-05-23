package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int i = 0;

        Queue<Character> num = new LinkedList<>();

       for(char c : input.toCharArray()){
           num.add(c);
       }

       while (!num.isEmpty()){
           i += 1;
           String input2 = String.valueOf(i);
           Queue<Character> nums = new LinkedList<>();
           for(char c : input2.toCharArray()){
               nums.add(c);
           }
           while(!num.isEmpty() && !nums.isEmpty()){
               if(nums.peek() == num.peek()){
                   num.poll();
               }
               nums.poll();
           }
       }
       System.out.println(i);

    }
}
