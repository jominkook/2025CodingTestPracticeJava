package backjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_4  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        Queue<Character> numsQueue = new LinkedList<>();
        int i = 0;

        for(char a : nums.toCharArray()){
            numsQueue.add(a);
        }

        while(!numsQueue.isEmpty()){
            i += 1;
            String num = String.valueOf(i);

            Queue<Character> numQueue = new LinkedList<>();

            for(char a : num.toCharArray()){
                numQueue.add(a);
            }
            while(!numQueue.isEmpty() && !numsQueue.isEmpty()){
                if(numQueue.peek() == numsQueue.peek()){
                    numsQueue.poll();
                }
                numQueue.poll();
            }
        }
        System.out.println(i);
    }
}
