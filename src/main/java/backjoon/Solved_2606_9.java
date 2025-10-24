package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_2606_9 {
    static List<List<Integer>> list = new ArrayList<List<Integer>>();
    static int com;
    static int connect;
    static boolean [] visited;
    static int count = 0;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        com = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());

        for(int i = 0; i <= com; i++){
            list.add(new ArrayList<>());
        }
        visited = new boolean[com+1];

        for(int i = 1; i <= connect; i++){
            String [] buffer = br.readLine().split(" ");
            int a = Integer.parseInt(buffer[0]);
            int b = Integer.parseInt(buffer[1]);

            list.get(a).add(b);
            list.get(b).add(a);
        }

        dfs(list,1,visited);
        System.out.println(count);
    }
    private static void dfs(List<List<Integer>> list,int start,boolean[] visited){
        visited[start] = true;

        for(int a :  list.get(start)){
            if(!visited[a]){
                dfs(list,a,visited);
                count++;
            }
        }
    }
}
