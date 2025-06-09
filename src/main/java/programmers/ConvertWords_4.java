package programmers;

public class ConvertWords_4 {
    private int min = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, visited, 0);
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    private void dfs(String begin, String target, String[] words, boolean[] visited, int count) {
        if (begin.equals(target)) {
            min = Math.min(min, count); // fix: use Math.min
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && canConvert(begin, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, visited, count + 1);
                visited[i] = false;
            }
        }
    }
    private boolean canConvert(String begin, String target) {
        int diff = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != begin.charAt(i)) {
                diff++;
            }
            if (diff > 1) {
                return false;
            }
        }
        return diff == 1;
    }
}
