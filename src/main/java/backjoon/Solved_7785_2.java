package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solved_7785_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> map = new HashMap<>();
        int N  = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            String [] buffer = br.readLine().split(" ");
            String name = buffer[0];
            String action = buffer[1];

            if(action.equals("enter")){
                map.put(name,action);
            }else if(action.equals("leave")){
                map.remove(name);
            }
        }
        //System.out.println(map);

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());

        for(String a : list){
            System.out.println(a);
        }

    }
}
