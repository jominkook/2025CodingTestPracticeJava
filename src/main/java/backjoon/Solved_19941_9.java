package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_19941_9 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        char [] table =  new char[N];

        String eaten =  br.readLine();
        for(int i = 0; i < eaten.length(); i++){
            table[i] = eaten.charAt(i);
        }

        int count = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] == 'P'){
                for(int j = Math.max(0,i-K); j< Math.min(i+K+1,N); j++){
                    if(table[j] == 'H'){
                        table[j] = 'X';
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
