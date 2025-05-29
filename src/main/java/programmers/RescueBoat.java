package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RescueBoat {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();
        int answer = 0;
        for(int i = 0; i<people.length; i++){
            deque.add(people[i]);
        }

        while(!deque.isEmpty()){
            // System.out.println(deque.peekFirst());
            // System.out.println(deque.peekLast());
            if(deque.size() == 1){
                answer++;
                break;
            }
            if(deque.peekFirst() + deque.peekLast() <= limit){
                deque.pollFirst();
                deque.pollLast();
            }else{
                deque.pollLast();
            }
            answer++;
        }

        //System.out.println(deque);
        return answer;
    }
}
