package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solved_22233_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);

        Map<String,Boolean> map = new HashMap<>();

        for(int i = 0; i<N; i++) {
            String keyword = br.readLine();
            map.put(keyword, true);
        }

        for(int i = 0; i<M; i++){
            String [] used = br.readLine().split(" ");
            for(String word : used){
                map.remove(word);
            }
            System.out.println(map.size());
        }
    }
}
