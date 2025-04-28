package programmers;

public class BillFolding_2 {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int max_w = Math.max(wallet[0],wallet[1]);
        int min_w = Math.min(wallet[0],wallet[1]);
        int max_b = Math.max(bill[0],bill[1]);
        int min_b = Math.min(bill[0],bill[1]);

        while(true){
            if(max_w <= max_b|| min_w <= min_b){
                max_b /= 2;
                answer++;
            }if(max_b < min_b){
                int temp = max_b;
                max_b = min_b;
                min_b = temp;
            }if(max_b <= max_w && min_b <= min_w){
                break;
            }

        }
        return answer;
    }
}
