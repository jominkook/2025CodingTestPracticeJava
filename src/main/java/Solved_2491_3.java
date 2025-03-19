import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_2491_3 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int length = 0;


        String [] input = br.readLine().split(" ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        if(N == 1){
            System.out.println(1);
        }else{
            int inc = 1;
            int dec = 1;
            for(int i = 1; i<N; i++){
                if(arr[i] >= arr[i-1]){
                    inc += 1;
                }else {
                    inc = 1;
                }
                if(arr[i] <= arr[i-1]){
                    dec += 1;
                }else {
                    dec = 1;
                }
                System.out.println("inc:" + inc);
                System.out.println("dec:" + dec);
                int max = inc > dec ? inc : dec;
                length = max > length ? max : length;
                System.out.println("max:" +  max);
                System.out.println("length:" + length);
            }
            System.out.println(length);

        }
    }
}
