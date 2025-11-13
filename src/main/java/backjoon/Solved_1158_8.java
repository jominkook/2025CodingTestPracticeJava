package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1158_8 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        Queue<Integer> q = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=N; i++){
            q.add(i);
        }
        sb.append("<");
        while(!q.isEmpty()){
            for(int i = 0; i<K-1; i++){
                q.add(q.poll());
            }
            sb.append(q.poll());
            if(!q.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);

    }
}
