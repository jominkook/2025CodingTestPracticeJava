package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1158_12 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=N; i++){
            queue.offer(i);
        }

        //System.out.println(queue);
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        while(!queue.isEmpty()){
            for(int i = 0; i<K-1; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());
            if(!queue.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
