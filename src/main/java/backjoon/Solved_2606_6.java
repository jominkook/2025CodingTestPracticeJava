package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_2606_6 {
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean [] visited;
    static int count = 0;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int com = Integer.parseInt(br.readLine());
        int connect = Integer.parseInt(br.readLine());


        for(int i = 0; i<= com; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<connect; i++){
            String [] pos = br.readLine().split(" ");

            int a = Integer.parseInt(pos[0]);
            int b = Integer.parseInt(pos[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        visited = new boolean[com+1];
        dfs(graph,1,visited);
        System.out.println(count);

    }
    private static void dfs(List<ArrayList<Integer>> graph,int start, boolean[] visited){
        visited[start] = true;
        for(int a : graph.get(start)){
            if(!visited[a]){
                dfs(graph,a,visited);
                count++;
            }
        }
    }
}
