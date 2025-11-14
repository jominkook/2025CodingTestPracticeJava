package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solved_20310_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int oneLen = 0;
        int zeroLen = 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '0'){
                zeroLen++;
            }else if(S.charAt(i) == '1'){
                oneLen++;
            }
        }

        int removeZero = zeroLen / 2;
        int removeOne = oneLen / 2;

        StringBuilder sb = new StringBuilder();

        int [] removeOneIdx = new int[S.length()];
        int cnt = removeOne;

        for(int i = S.length() - 1; i >= 0; i--){
            if(S.charAt(i) == '1' && cnt > 0){
                removeOneIdx[i] = 1;
                cnt--;
            }
        }

        for(int i = S.length() - 1; i >= 0; i--){
            char c = S.charAt(i);
            if(S.charAt(i) == '0' && removeZero > 0){
                removeZero--;
                continue;
            }
            if(S.charAt(i) == '1' && removeOneIdx[i] == 1){
                continue;
            }
            sb.append(c);
        }
        sb.reverse();
        System.out.println(sb);


    }
}
