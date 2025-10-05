package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_17266_9 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int [] lights = new int[M];

        String [] buffer = br.readLine().split(" ");
        for(int i = 0; i < M; i++){
            lights[i] = Integer.parseInt(buffer[i]);
        }
        int maxDistance = 0;
        if(M == 1) {
            System.out.println(Math.max(lights[0], N - lights[0]));

        }else{
            for(int i = 0; i<M; i++){
                if(i == 0){
                    maxDistance = lights[i];
                }else if(i == M-1){
                    maxDistance = Math.max(maxDistance, N - lights[i]);
                }else {
                    int distance = lights[i] - lights[i-1];
                    if(distance % 2 == 0){
                        distance = distance / 2;
                    }else{
                        distance = distance / 2 + 1;
                    }
                    maxDistance = Math.max(maxDistance,distance);
                }
            }
            System.out.println(maxDistance);
        }
    }
}
