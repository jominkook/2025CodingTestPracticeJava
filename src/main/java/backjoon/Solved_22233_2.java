package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solved_22233_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);
        Set<String> set = new HashSet<>();

        for(int i = 0; i<N; i++){
            String keywords = br.readLine();
            set.add(keywords);
        }

        for(int i = 0; i<M; i++){
            String [] word = br.readLine().split(",");
            for(String a : word){
                set.remove(a);
            }
            System.out.println(set.size());
        }

    }
}
