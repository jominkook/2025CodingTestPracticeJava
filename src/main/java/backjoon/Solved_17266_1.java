package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solved_17266_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<Integer> light = new ArrayList<>();
        String [] input = br.readLine().split(" ");
        for(int i = 0; i<M; i++){
            light.add(Integer.parseInt(input[i]));
        }
        //System.out.println(light);
        int maxDistance = 0;
        if(M == 1){
            System.out.print(Math.max(light.get(0),N - light.get(0)));
        }else {
            for(int i = 0; i<M; i++){
                if(i == 0){
                    maxDistance = light.get(i);
                }else if(i == M - 1){
                    maxDistance = Math.max(maxDistance,N - light.get(i));
                }else{
                    int distance = light.get(i+1) - light.get(i);

                    if(distance % 2 == 0){
                        distance = distance / 2;
                    }else{
                        distance = distance /2 + 1;
                    }
                    maxDistance = Math.max(distance,maxDistance);
                }
            }
            System.out.println(maxDistance);
        }

    }
}
