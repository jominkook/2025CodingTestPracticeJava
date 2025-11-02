package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_11 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String target = br.readLine();

        Queue<Character> q = new LinkedList<Character>();

        for(char a : target.toCharArray()){
            q.add(a);
        }

        int i = 0;

        while(!q.isEmpty()){
            i++;
            String nums = String.valueOf(i);

            Queue<Character> q2 = new LinkedList<>();

            for(char a : nums.toCharArray()){
                q2.add(a);
            }

            while(!q2.isEmpty() && !q.isEmpty()){
                if(q.peek() == q2.peek()){
                    q.poll();
                }
                q2.poll();
            }
        }
        System.out.println(i);
    }
}
