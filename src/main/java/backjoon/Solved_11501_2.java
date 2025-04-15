package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_11501_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] stocks = new int[N];
            String[] stockPrices = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                stocks[j] = Integer.parseInt(stockPrices[j]);
            }

            int maxPrice = 0;
            long profit = 0;

            for (int j = N - 1; j >= 0; j--) {
                if (stocks[j] > maxPrice) {
                    maxPrice = stocks[j];
                } else {
                    profit += (maxPrice - stocks[j]);
                }
            }
            System.out.println(profit);
        }
    }
}