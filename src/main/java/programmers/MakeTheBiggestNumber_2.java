package programmers;

//하드 코딩 -> 고민해야함
public class MakeTheBiggestNumber_2 {
    public String solution(String number, int k) {
        String answer = "";
        int index = -1;
        int len = number.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len - k; i++){
            int maxNum = 0;
            for(int j = index + 1; j<=k + i; j++){
                int num = number.charAt(j) - '0';

                if(maxNum < num){
                    maxNum = num;
                    index = j;
                }
            }
            sb.append(maxNum);
        }
        answer += sb;

        return answer;
    }
}
