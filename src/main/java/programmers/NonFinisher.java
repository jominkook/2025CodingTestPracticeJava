package programmers;

import java.util.HashMap;
import java.util.Map;

public class NonFinisher {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for(String a : participant){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(String a : completion){
            map.put(a,map.get(a)-1);
        }

        for(String key : map.keySet()){
            if(map.get(key) !=0) {
                answer = key;
            }
        }
        return answer;
    }
}
