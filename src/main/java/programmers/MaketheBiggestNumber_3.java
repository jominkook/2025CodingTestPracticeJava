package programmers;


import java.util.Stack;

public class MaketheBiggestNumber_3 {
    public String solution(String number, int k) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(char a : number.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() < a){
                stack.pop();
                k--;
            }
            stack.push(a);
        }

        while(k-- > 0){
            stack.pop();
        }

        //System.out.println(deque);
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        answer += sb;
        return answer;
    }
}
