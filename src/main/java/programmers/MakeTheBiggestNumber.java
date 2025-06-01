package programmers;

import java.util.ArrayDeque;
import java.util.Deque;

public class MakeTheBiggestNumber {
    public String solution(String number, int k) {
        String answer = "";

        Deque<Character> deque = new ArrayDeque<>();

        for(char a : number.toCharArray()){
            while(!deque.isEmpty() && k > 0 && deque.peekLast() < a){
                deque.pollLast();
                k--;
            }
            deque.addLast(a);
        }

        while(k-- > 0){
            deque.pollLast();
        }

        //System.out.println(deque);
        StringBuilder sb = new StringBuilder();
        for(char c : deque){
            sb.append(c);
        }
        answer += sb;
        return answer;
    }
}
