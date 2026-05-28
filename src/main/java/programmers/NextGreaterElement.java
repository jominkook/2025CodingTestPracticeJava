package programmers;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int [] answer = new int [numbers.length];

        for(int i = 0; i<numbers.length; i++){
            answer[i] = 0;
        }

        // for(int i = 0; i<numbers.length; i++){
        //     System.out.println(answer[i]);
        // }

        Stack<Integer> stack = new Stack();
        for (int i = 0; i < numbers.length; i++) {


            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }


            stack.push(i);
        }


        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

}
