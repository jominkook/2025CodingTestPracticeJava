package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_19941_6 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        char [] tableArr = new char[N];

        String table = br.readLine();

        for(int i = 0; i<N; i++){
            tableArr[i] = table.charAt(i);
        }
        int count = 0;
        for(int i = 0; i<tableArr.length; i++){
            if(tableArr[i] == 'P'){
                for(int j = Math.max(0,i-K); j < Math.min(N,i+K+1); j++){
                    if(tableArr[j] == 'H'){
                        count++;
                        tableArr[j] = 'X';
                        break;
                    }
                }
            }
        }
        System.out.println(count);

//        for(int i = 0; i<N; i++){
//            System.out.println(tableArr[i]);
//        }


    }
}
