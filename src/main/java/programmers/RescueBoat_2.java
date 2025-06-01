package programmers;

import java.util.Arrays;

public class RescueBoat_2 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer  = 0;
        int i = 0;
        int j = people.length - 1;

        while (i<=j){
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
            answer++;
        }

        return answer;
    }
}
