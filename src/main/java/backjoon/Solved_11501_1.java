package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solved_11501_1 {
    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger[] stocks = new BigInteger[N];
            String[] stockPrices = br.readLine().split(" ");
            for(int j = 0; j < N; i++) {
                stocks[j] = new BigInteger(stockPrices[j]);
            }
            BigInteger maxPrice = BigInteger.ZERO;
            BigInteger profit = BigInteger.ZERO;

            for (int j = N - 1; j >= 0; j--) {
                if (stocks[j].compareTo(maxPrice) > 0) {
                    maxPrice = stocks[j];
                } else {
                    profit = profit.add(maxPrice.subtract(stocks[j]));
                }
            }
            System.out.println(profit);
        }
    }
}
