package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solved_2606_1 {
    static int count  = 0;
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = Integer.parseInt(br.readLine());
        int connections = Integer.parseInt(br.readLine());
        boolean [] visited = new boolean[com+1];

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<=com; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<connections; i++){
            String [] buffer = br.readLine().split(" ");
            int a = Integer.parseInt(buffer[0]);
            int b = Integer.parseInt(buffer[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        dfs(graph,1,visited);
        System.out.println(count-1);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int start, boolean [] visitied){
        visitied[start] = true;
        count +=1;
        for(int i : graph.get(start)){
            if(!visitied[i]){
                dfs(graph,i,visitied);
            }
        }
    }
}
