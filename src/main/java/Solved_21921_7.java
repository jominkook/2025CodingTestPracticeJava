import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_21921_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        int sum = 0;
        int max = 0;


        List<Integer> visit = new ArrayList<>();
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            visit.add(Integer.parseInt(input2[i]));
        }

        for (int i = 0; i < X; i++) {
            sum += visit.get(i);
        }
        max = sum;
        int count = 1;

        if (sum == 0) {
            System.out.println("SAD");
            System.exit(0);
        } else {
            for (int i = X; i < N; i++) {
                sum = sum - visit.get(i - X) + visit.get(i);
                if (sum > max) {
                    max = sum;
                    count = 1;
                } else if (sum == max) {
                    count += 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
