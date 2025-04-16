package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Solved_1026_1 {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        //sc.nextLine();

        int [] A = new int[N];
        int [] B = new int[N];

        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i<N; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        int res = 0;
        for(int i = 0; i<N; i++){
           res += A[i] * B[N-i-1];
        }
        System.out.println(res);
        sc.close();
    }
}
