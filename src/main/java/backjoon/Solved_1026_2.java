package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solved_1026_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());

        int [] A = new int[N];
        int [] B = new int[N];


        String [] input = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            A[i] = Integer.parseInt(input[i]);
        }

        String [] input2 = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            B[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);
        int result = 0;
        for(int i = 0; i<N; i++){
            result += A[i] * B[N - i -1];
        }

        System.out.println(result);


//        for(int i = 0; i<N; i++){
//            System.out.print(A[i] + " ");
//            System.out.println();
//            System.out.print(B[i] + " ");
//        }
    }
}
