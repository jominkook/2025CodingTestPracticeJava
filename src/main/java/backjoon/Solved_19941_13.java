package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_19941_13 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        char [] table =  new char[N];

        String a = br.readLine();

        for(int i = 0; i < N; i++){
            table[i] = a.charAt(i);
        }

        int cnt = 0;
        for(int i = 0; i<table.length; i++){
            if(table[i] == 'P'){
                for(int j = i-K; j<i+K+1; j++){
                    if(j < 0 && j >= N){
                        continue;
                    }
                    if(table[j] == 'H'){
                        table[j] = 'X';
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
