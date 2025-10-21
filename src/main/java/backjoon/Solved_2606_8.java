package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_2606_8 {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int coms,conncect;
    static int count = 0;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        coms = Integer.parseInt(br.readLine());
        conncect = Integer.parseInt(br.readLine());

        for(int i = 0; i <= coms; i++){
            graph.add(new ArrayList<>());
        }

        visited = new boolean[coms+1];


        for(int i = 0; i < conncect; i++){
            String [] buffer = br.readLine().split(" ");
            int a = Integer.parseInt(buffer[0]);
            int b = Integer.parseInt(buffer[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        dfs(graph,1,visited);

        System.out.println(count);

    }
    private static void dfs(List<List<Integer>> graph, int start, boolean[] visited){
        visited[start] = true;
        for(Integer v : graph.get(start)){
            if(!visited[v]){
                dfs(graph,v,visited);
                count++;
            }
        }
    }
}
