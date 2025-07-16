package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_2805_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);

        int [] tree = new int[N];
        String [] heights = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            tree[i] = Integer.parseInt(heights[i]);
        }

        int start = 0;
        int end = 0;
        int res = 0;

        for(int h : tree){
            end = Math.max(end, h);
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            long sum = 0;

            for(int h : tree){
                if(h > mid ) {
                    sum += h - mid;
                }
            }
            if(sum >= M){
                res = mid;
                start = mid + 1;


            }else{
                end = mid - 1;
            }

        }
        System.out.println(res);
    }
}




