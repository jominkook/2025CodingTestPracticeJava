import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_2606_5 {
    static boolean [] visited;
    static int count = 0;
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int com = Integer.parseInt(br.readLine());
        int connections = Integer.parseInt(br.readLine());

        for(int i = 0; i<=com; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<connections; i++){
            String [] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        visited = new boolean[com+1];
        dfs(graph,1,visited);
        System.out.println(count);

    }
    private static void dfs(List<ArrayList<Integer>> graph,int strart,boolean[]visited){
        visited[strart] = true;

        for(int a : graph.get(strart)){
            if(!visited[a]){
                dfs(graph,a,visited);
                count++;
            }
        }
    }
}
