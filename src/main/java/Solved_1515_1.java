import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1515_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int i = 0;
        Queue<Character> target = new LinkedList<>();

        for(char c : input.toCharArray()){
            target.add(c);
        }
        while (!target.isEmpty()){
            i += 1;
            String input2 = String.valueOf(i);
            Queue<Character> curNum = new LinkedList<>();

            for(char c : input2.toCharArray()){
                curNum.add(c);
            }

            while (!curNum.isEmpty() && !target.isEmpty()){
                if(curNum.peek() == target.peek()){
                    target.poll();
                }
                curNum.poll();
            }

        }
        System.out.println(i);

    }
}
