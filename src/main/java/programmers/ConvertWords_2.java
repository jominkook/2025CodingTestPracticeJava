package programmers;

//dfs/bfs  -> 백트래킹
public class ConvertWords_2 {
    private int min = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        boolean [] visited = new boolean[words.length];
        dfs(begin,target,words,visited,0);
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    private void dfs(String curr,String target,String [] words,boolean[] visited,int count){
        if(curr.equals(target)){
            min = Math.min(min,count);
            return;
        }

        for(int i = 0; i<words.length; i++){
            if(!visited[i] && canConvert(curr,words[i])){
                visited[i] = true;
                dfs(words[i],target,words,visited,count+1);
                visited[i] = false;

            }
        }
    }
    private boolean canConvert(String curr, String target){
        int diff = 0;

        for(int a = 0; a<curr.length(); a++){
            if(curr.charAt(a) != target.charAt(a)){
                diff++;
            }

            if(diff > 1){
                return false;
            }
        }
        return true;
    }
}
