package groom;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CafeStudy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);

        String[] input2 = br.readLine().split(" ");
        int X1 = Integer.parseInt(input2[0]);
        int Y1 = Integer.parseInt(input2[1]);

        String[] input3 = br.readLine().split(" ");
        int X2 = Integer.parseInt(input3[0]);
        int Y2 = Integer.parseInt(input3[1]);

        boolean canPlace = false;

        if (canFit(H, W, X1, Y1, X2, Y2)) {
            canPlace = true;
        }
        if (canFit(H, W, X1, Y1, Y2, X2)) {
            canPlace = true;
        }
        if (canFit(H, W, Y1, X2, Y2, X1)) {
            canPlace = true;
        }
        if (canFit(H, W, Y2, X1, Y1, X2)) {
            canPlace = true;
        }

        if (canPlace == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    private static boolean canFit(int H, int W, int X1, int Y1, int X2, int Y2) {
        return (X1 + X2 <= H && Math.max(Y1,Y2) <= W) || (Y1 + Y2 <= W && Math.max(X1,X2) <= H)
                || (Y1 + X2 <= H && Math.max(Y2,X1) <= W) || (Y2 + X1) <= W && (Math.max(Y1,X2) <= H
        );
    }
}
