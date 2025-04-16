package programmers;
import java.util.*;
public class NumberTransformation {
    //Set활용
    public int solution(int x, int y, int n) {
        int answer = 0;
        Set<Integer> currSet = new HashSet<>();
        currSet.add(x);

        while(!currSet.isEmpty()){
            if(currSet.contains(y)){
                return answer;
            }

            Set<Integer> nextSet = new HashSet<>();
            for(int a : currSet){
                if(a + n <=y){
                    nextSet.add(a + n);
                }if(a * 2 <= y){
                    nextSet.add(a * 2);
                }if(a * 3 <= y){
                    nextSet.add(a * 3);
                }
            }
            currSet = nextSet;
            answer++;
        }
        return -1;
    }
}
