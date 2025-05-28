package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solved_7785_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());
        Map<String,String> map = new HashMap<>();
        for(int i = 0; i<N; i++){
            String [] buffer = br.readLine().split(" ");

            String name = buffer[0];
            String action = buffer[1];
            if(action.equals("enter")){
                map.put(name,action);
            } else if (action.equals("leave")) {
                map.remove(name);
            }
        }

        List<String> names = new ArrayList<>(map.keySet());

        Collections.sort(names,Collections.reverseOrder());

        for(String a : names){
            System.out.println(a);
        }
    }
}
