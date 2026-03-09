package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_13 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Character> q1 = new LinkedList<Character>();
        String target = br.readLine();

        for(Character c : target.toCharArray()){
            q1.add(c);
        }

        int i = 0;
        while(!q1.isEmpty()){
            i++;
            Queue<Character> q2 = new LinkedList<Character>();
            String nums = String.valueOf(i);
            for(Character c : nums.toCharArray()){
                q2.add(c);
            }

            while(!q2.isEmpty() && !q1.isEmpty()){
                if(q1.peek() == q2.peek()){
                    q1.poll();
                }
                q2.poll();

            }
        }
        System.out.println(i);


    }
}
