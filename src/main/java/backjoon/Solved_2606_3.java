package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solved_2606_3 {
    public static int count = 0;
    public static boolean [] visited;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = Integer.parseInt(br.readLine());
        int connections = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        visited = new boolean[com+1];


        for(int i = 0; i<=com; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i<connections; i++){
            String [] pos = br.readLine().split(" ");
            int a = Integer.parseInt(pos[0]);
            int b = Integer.parseInt(pos[1]);

            list.get(a).add(b);
            list.get(b).add(a);

        }
        dfs(list,1,visited);
        System.out.println(count - 1);


    }
    private static void dfs(ArrayList<ArrayList<Integer>> graph, int start, boolean [] visited){
        visited[start] = true;

        count += 1;
        for(int i : graph.get(start)){
            if(!visited[i]){
                dfs(graph,i,visited);
            }
        }
    }
}
