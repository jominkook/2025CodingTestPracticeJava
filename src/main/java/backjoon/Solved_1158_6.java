package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1158_6 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        Queue queue = new LinkedList();

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        sb.append("<");
        while(!queue.isEmpty()){
            for(int i = 0; i<K-1;i++){
                queue.add(queue.poll());
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
