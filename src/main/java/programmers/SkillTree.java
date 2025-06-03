package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skill_tree : skill_trees){
            Queue<Character> skillQueue = new LinkedList<>();

            for(char c : skill.toCharArray()){
                skillQueue.add(c);
            }

            boolean isValid = true;

            for(char c : skill_tree.toCharArray()){
                if(skillQueue.contains(c)){
                    if(c != skillQueue.peek()){
                        isValid = false;
                        break;
                    } else{
                        skillQueue.poll();
                    }
                }
            }
            if(isValid) answer++;
        }


        return answer;
    }
}
