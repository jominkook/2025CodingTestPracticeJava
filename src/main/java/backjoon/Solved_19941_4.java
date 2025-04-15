package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_19941_4 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        char [] table = new char[N];
        String input = br.readLine();
        for(int i = 0; i<N; i++){
            table[i] = input.charAt(i);
        }


        int count = 0;
        for(int i = 0; i<table.length; i++){
            if(table[i] == 'P'){
                for(int j = Math.max(0,i-K); j<Math.min(N,i+K+1); j++){
                    if(table[j] == 'H'){
                        count++;
                        table[j] = 'X';
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
