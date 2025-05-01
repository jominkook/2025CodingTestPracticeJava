package programmers;
import java.util.*;
public class PaintingOver {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int s : section){
            queue.add(s);
        }

        while(!queue.isEmpty()){
            int start = queue.poll();

            while(!queue.isEmpty() && start + m > queue.peek()){
                queue.poll();
            }
            answer++;
        }
        return answer;
    }
}
