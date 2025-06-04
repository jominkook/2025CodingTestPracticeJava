package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AddTwoNumbers_2 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        //System.out.println(set);
        int[] answer = new int[set.size()];

        int idx = 0;

        for(int num : set){
            answer[idx++] = num;
        }
        Arrays.sort(answer);


        //System.out.println(queue);
        return answer;
    }
}
