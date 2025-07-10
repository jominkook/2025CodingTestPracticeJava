package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//종말의수
public class Solved_1436_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;

        while(true){
            String s  = String.valueOf(num);

            if(s.contains("666")){

                count++;
                if(count == N){
                    System.out.println(s);
                    break;
                }
            }
            num += 1;

        }
    }
}
