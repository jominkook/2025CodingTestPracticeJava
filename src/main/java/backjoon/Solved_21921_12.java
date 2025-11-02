package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solved_21921_12 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int X = Integer.parseInt(buffer[1]);

        int [] visited = new  int[N];

        String [] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            visited[i] = Integer.parseInt(input[i]);
        }
        int sum = 0;
        int maxDay = 1;

        for(int i = 0; i < X; i++){
            sum +=  visited[i];
        }

        int maxVisited = sum;

        if(maxVisited == 0){
            System.out.println("SAD");
            System.exit(0);
        }else{
            for(int i = X; i<visited.length; i++){
                 sum = sum  - visited[i-X] + visited[i];

                 if(maxVisited < sum){
                     maxVisited = sum;
                     maxDay = 1;
                 }else if(maxVisited == sum){
                     maxDay++;
                 }
            }
        }
        System.out.println(maxVisited);
        System.out.println(maxDay);
    }
}
