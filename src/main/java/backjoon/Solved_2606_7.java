package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_2606_7 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int count = 0;
    static boolean [] visited;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int com = Integer.parseInt(br.readLine());

        int connections = Integer.parseInt(br.readLine());

        for(int i = 0; i<=com; i++){
            graph.add(new ArrayList<>());
        }

        visited = new boolean[com+1];


        for(int i = 0; i<connections; i++){
            String [] buffer = br.readLine().split(" ");

            int a = Integer.parseInt(buffer[0]);
            int b = Integer.parseInt(buffer[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        //System.out.println(graph);

        dfs(graph,1,visited);
        System.out.println(count);


    }
    private static void dfs(List<List<Integer>> graph,int start, boolean [] visited){
        visited[start] = true;


        for(int a : graph.get(start)){
            if(!visited[a]){
                dfs(graph,a,visited);
                count++;
            }
        }
    }
}
