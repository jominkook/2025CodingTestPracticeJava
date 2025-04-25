package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Solved_13305_2 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Long [] dist = new Long[N-1];
        Long [] liter = new Long[N];

        for(int i = 0; i < N-1; i++){
            dist[i] = (long)sc.nextInt();
        }

        for(int i = 0; i<N; i++){
            liter[i] = (long)sc.nextInt();
        }

        long minLiter = liter[0];
        long result = 0;

        for(int i = 0; i<N-1; i++){
            if(minLiter > liter[i]){
                minLiter = liter[i];
            }
            result +=  minLiter * dist[i];
        }
        System.out.println(result);
    }
}
