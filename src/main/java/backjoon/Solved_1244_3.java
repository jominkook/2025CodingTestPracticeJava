package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_1244_3 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] swit = new int[N];
        String [] input = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            swit[i] = Integer.parseInt(input[i]);
        }

        //System.out.println(swit[0]);

        int student = Integer.parseInt(br.readLine());

        for(int i = 0; i<student; i++){
            String [] input2 = br.readLine().split(" ");
            int gender = Integer.parseInt(input2[0]);
            int num = Integer.parseInt(input2[1]);

            if(gender == 1){
                for(int j = num-1; j<N; j+=num){
                    swit[j] = 1 - swit[j];
                }
            }else if(gender == 2){
                num = num -1;
                swit[num] = 1 - swit[num];
                for(int j = 1; j<N; j++){
                    if(num - j >= 0 && num + j <N && swit[num - j] == swit[num + j]){
                        swit[num - j] = 1 - swit[num - j];
                        swit[num + j] = 1 - swit[num + j];
                    }else{
                        break;
                    }
                }
            }
        }

        for(int i = 0; i<swit.length; i++){
            System.out.print(swit[i] + " ");
            if((i+1) % 20 == 0){
                System.out.println();
            }
        }
    }
}
