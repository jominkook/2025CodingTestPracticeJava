import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_3 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        Queue<Character> numQueue = new LinkedList<>();

        for(char a : num.toCharArray()){
            numQueue.add(a);
        }
        int i = 0;
        //System.out.println(numQueue);

        while(!numQueue.isEmpty()){
            i += 1;
            String nums = String.valueOf(i);

            Queue<Character> numsQueue = new LinkedList<>();

            for(char a : nums.toCharArray()){
                numsQueue.add(a);
            }
            while(!numQueue.isEmpty() && !numsQueue.isEmpty()){
                if(numQueue.peek() == numsQueue.peek()){
                    numQueue.poll();
                }
                numsQueue.poll();
            }
        }
        System.out.println(i);

    }
}
