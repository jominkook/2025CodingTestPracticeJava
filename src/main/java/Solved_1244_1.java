import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solved_1244_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> swit = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        String [] buffer = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            int input = Integer.parseInt(buffer[i]);
            swit.add(input);
        }
        //System.out.println(swit);

        int student = Integer.parseInt(br.readLine());

        for(int i = 0; i<student; i++){
            String [] stu = br.readLine().split(" ");
            int gender = Integer.parseInt(stu[0]);
            int num = Integer.parseInt(stu[1]);

            if(gender == 1){
                for(int j = num-1; j<N; j+=num ){
                    swit.set(j,1 -swit.get(j));
                }
            }else if(gender == 2){
                num = num - 1;
                swit.set(num,1 - swit.get(num));
                for(int j = 1; j<N; j++){
                    if(num -j >= 0 && num + j <N && swit.get(num - j) == swit.get(num + j)){
                        swit.set(num-j,1-swit.get(num-j));
                        swit.set(num+j,1-swit.get(num+j));
                    }else{
                        break;
                    }
                }
            }
        }
        for(int i = 0; i<N; i++){
            System.out.print(swit.get(i) + " ");
            if((i+1) % 20 == 0){
                System.out.println();
            }
        }

    }
}
