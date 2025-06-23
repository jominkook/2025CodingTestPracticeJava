package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_1522_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int n = word.length();

        int cntA = 0;
        for(char c : word.toCharArray()){
            if(c == 'a') cntA++;
        }

        if(cntA == 0 || cntA == n){
            System.out.println(0);
            return;
        }

        String doubled = word + word;

        int minChange = Integer.MAX_VALUE;
        int cntB = 0;

        for(int i = 0; i<cntA; i++){
            if(doubled.charAt(i) == 'b') cntB++;
        }
        minChange = cntB;

        for(int i = 1; i<n; i++){
            if(doubled.charAt(i - 1) == 'b') cntB--;

            if(doubled.charAt(i + cntA - 1) == 'b') cntB++;

            minChange = Math.min(minChange, cntB);
        }
        System.out.println(minChange);
    }
}
