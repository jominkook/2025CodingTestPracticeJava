import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solved_1021_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> deque = new LinkedList<>();

        int cnt = 0;

        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        for(int i = 1; i<=N; i++) {
            deque.offer(i);
        }

        int [] arr = new int[M];
        String [] input2 = br.readLine().split(" ");
        for(int i = 0; i<M; i++){
            arr[i] = Integer.parseInt(input2[i]);
        }

        for(int i = 0; i<M; i++){
            int target = deque.indexOf(arr[i]);

            int half;

            if(deque.size() % 2 == 0){
                half = deque.size()/2 -1;
            }else {
                half = deque.size()/2;
            }

            if(target <= half){
                for(int j = 0; j<target; j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    cnt++;
                }
            }else{
                for(int j = 0; j<target; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);

    }
}
