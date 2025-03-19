import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solved_9625_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        ArrayList<Integer> dp = new ArrayList<>();

        dp.add(0);
        dp.add(1);
        //System.out.println(dp);

        for(int i = 2; i<=K; i++){
            dp.add(dp.get(i-1) + dp.get(i-2));
        }
        System.out.print(dp.get(K-1) + " " + dp.get(K));
    }


}
