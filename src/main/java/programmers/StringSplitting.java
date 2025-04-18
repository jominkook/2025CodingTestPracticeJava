package programmers;

public class StringSplitting {
    public int solution(String s) {
        int answer = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        char k = '\0';

        for(int i = 0; i<s.length(); i++){
            char currChar = s.charAt(i);
            if(cnt1 == cnt2){
                answer++;
                k = currChar;
            }
            if(k == currChar){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        return answer;
    }
}
