package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solved_17219_3 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> map = new HashMap<>();

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);

        for(int i=0;i<N;i++){
            String [] input = br.readLine().split(" ");
            String site = input[0];
            String password = input[1];

            map.put(site,password);
        }

        for(int i=0;i<M;i++){
            String word =  br.readLine();

            if(map.containsKey(word)){
                System.out.println(map.get(word));
            }
        }
    }
}
