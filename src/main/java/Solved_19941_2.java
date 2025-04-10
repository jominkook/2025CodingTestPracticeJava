import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_19941_2 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");

        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);

        String table = br.readLine();

        char [] arr = new char[N];
        boolean [] visited = new boolean[N];

        for(int i = 0; i<N; i++){
            arr[i] = table.charAt(i);
        }
        int count = 0;
        for(int i = 0; i<N; i++){
            if(arr[i] == 'P'){
                for(int j = Math.max(0,i-K); j<Math.min(N,i+K+1); j++){
                    if(arr[j] == 'H' && !visited[j]){
                        visited[j] = true;
                        count++;
                        break;

                    }
                }
            }
        }
        System.out.println(count);
    }
}
