package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_17266_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int [] light = new int[M];



        String [] buffer = br.readLine().split(" ");
        for(int i = 0; i < M; i++){
            light[i] = Integer.parseInt(buffer[i]);
        }

        int maxDistance = 0;
        if(M == 1){
            System.out.println(Math.max(light[0],N - light[0]));
        }else{
            for(int i = 0; i<M; i++){
                if(i == 0) {
                    maxDistance = light[i];
                }else if(i == N-1){
                    maxDistance = Math.max(maxDistance, N - light[i]);
                }else{
                    int distance = light[i] - light[i-1];

                    if(distance % 2 == 0){
                        distance = distance / 2;
                    }else{
                        distance = distance / 2 + 1;
                    }
                    maxDistance = Math.max(maxDistance, distance);
                }
            }
            System.out.println(maxDistance);
        }

    }
}

