package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_1244_4 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] swit = new int[N];

        String [] input = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            swit[i] = Integer.parseInt(input[i]);
        }

        int students = Integer.parseInt(br.readLine());


        for(int i = 0; i<students; i++){
            String [] input2 = br.readLine().split(" ");
            int sex = Integer.parseInt(input2[0]);
            int num = Integer.parseInt(input2[1]);

            if(sex == 1){
                for(int j = num; j<=N; j+=num){
                    swit[j-1] = 1 -swit[j-1];
                }
            }else if(sex == 2){
                num = num - 1;
                swit[num] = 1 - swit[num];

                for(int j = 0; j<N; j++){
                    if(num - j >=0 && num + j <N && swit[num - j] == swit[num +j]){
                        swit[num - j] = 1 - swit[num - j];
                        swit[num + j] = 1 - swit[num + j];

                    }else{
                        break;
                    }
                }
            }
        }

        for(int i = 0; i<N; i++){
            System.out.print(swit[i] + " ");
            if((i+1) % 20 == 0){
                System.out.println();
            }
        }

    }
}
