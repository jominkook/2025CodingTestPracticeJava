package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_1158_5 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        Queue<Integer> people = new LinkedList<>();

        for(int i = 1; i<=N; i++){
            people.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(!people.isEmpty()){
            for(int i = 0; i<K-1; i++){
                people.add(people.poll());
            }
            sb.append(people.poll());
            if(!people.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
