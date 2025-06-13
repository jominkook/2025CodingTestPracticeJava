package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesertlslandTrip_2 {
    static int count = 0;
    static int [][] graph;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static boolean [][] visited;
    static int N,M;

    public static void main(String[] args) {
        String[][] testCases = {
                {"X591X", "X1X5X", "X231X", "1XXX1"},
                {"XXX", "XXX", "XXX"}
        };

        for (String[] maps : testCases) {
            int[] answer = solution(maps);
            for (int n : answer) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static int[] solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        //System.out.println(N);
        //System.out.println(M);

        graph = new int [N][M];
        visited = new boolean[N][M];

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(maps[i].charAt(j) == 'X'){
                    graph[i][j] = 0;
                }else{
                    graph[i][j] = Character.getNumericValue(maps[i].charAt(j));
                }
            }
        }
        List<Integer> list = new ArrayList<>();


        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(graph[i][j] != 0 && !visited[i][j]){
                    dfs(graph,i,j,visited);
                    list.add(count);
                    count = 0;
                }
            }
        }
        
        if(list.isEmpty()){
            list.add(-1);
        }else{
            Collections.sort(list);
        }
        int [] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    private static void dfs(int [][] graph,int x , int y, boolean[][]visited){
        visited[x][y] = true;
        count += graph[x][y];

        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < N && ny >=0 && ny<M){
                if(graph[nx][ny] != 0 && !visited[nx][ny]){
                    dfs(graph,nx,ny,visited);
                }
            }
        }
    }
}
