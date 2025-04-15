package programmers;
import java.util.*;
public class DesertIslandTrip {
    static int count = 0;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int [][] graph;
    static boolean [][] visited;
    static int M,N,nx,ny;
    public int[] solution(String[] maps) {
        M = maps.length;
        N = maps[0].length();
        //System.out.println(M);
        //System.out.println(N);

        graph = new int[M][N];
        visited = new boolean[M][N];

        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                if(maps[i].charAt(j) == 'X'){
                    graph[i][j] = 0;
                }else{
                    graph[i][j] = Character.getNumericValue(maps[i].charAt(j));
                }

            }
        }
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
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

        //System.out.println(list);
        /*for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                System.out.println(graph[i][j]);
            }
        }*/
        int[] answer = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    private static void dfs(int [][] graph,int x , int y, boolean[][]visited){
        visited[x][y] = true;
        count += graph[x][y];

        for(int i = 0; i<4; i++){
            nx = x + dx[i];
            ny = y + dy[i];

            if(nx >= 0 && nx < M && ny >=0 && ny<N){
                if(graph[nx][ny] != 0 && !visited[nx][ny]){
                    dfs(graph,nx,ny,visited);
                }
            }
        }
    }
}
