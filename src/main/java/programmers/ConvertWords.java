package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertWords {
    public int solution(String begin, String target, String[] words) {
        return bfs(begin,target,words);
    }
    private int bfs(String begin, String target, String [] words){
        Queue<String> queue = new LinkedList<>();
        Queue<Integer> countQueue = new LinkedList<>();

        boolean [] visited = new boolean[words.length];

        queue.add(begin);
        countQueue.add(0);

        while(!queue.isEmpty()){
            String curr = queue.poll();
            int count = countQueue.poll();

            if(curr.equals(target)){
                return count;
            }

            for(int i = 0; i<words.length; i++){
                if(!visited[i] && canConvert(curr,words[i])){
                    visited[i] = true;
                    queue.add(words[i]);
                    countQueue.add(count + 1);
                }
            }
        }

        return 0;
    }

    private boolean canConvert(String a, String b) {
        int diff = 0;

        for(int i = 0; i< a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) diff++;
            if(diff > 1) return false;
        }
        return diff == 1;
    }
}
