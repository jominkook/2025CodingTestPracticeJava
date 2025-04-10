import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_21921_9 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int X = Integer.parseInt(buffer[1]);

        List<Integer> list = new ArrayList<>();
        String [] input = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            list.add(Integer.parseInt(input[i]));
        }
        int sum = 0;
        int max;
        int count = 1;
        for(int i = 0; i<X; i++){
            sum += list.get(i);
        }

        if(sum == 0){
            System.out.println("SAD");
            //System.exit(0);
        }else{
            max = sum;
            //System.out.println(max);

            for(int i = X; i<N; i++){
                sum = sum - list.get(i-X) + list.get(i);
                //System.out.println(sum);

                if(sum > max){
                    max = sum;

                }else if(sum == max ){
                    count ++;
                }
            }
            System.out.println(max);
            System.out.println(count);
        }

    }
}
