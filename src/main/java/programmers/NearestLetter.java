package programmers;
import java.util.*;
public class NearestLetter {
    public int[] solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            char charWord = s.charAt(i);

            if(!map.containsKey(charWord)){
                list.add(-1);
            }else{
                list.add(i - map.get(charWord));
            }
            map.put(charWord,i);
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
