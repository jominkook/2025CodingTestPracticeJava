import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_2606_2 {
    static int count  = 0;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int com = Integer.parseInt(br.readLine());
        int connections = Integer.parseInt(br.readLine());
        boolean [] visitied = new boolean[com+1];

        List<ArrayList<Integer>> graph = new ArrayList<>();

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
        dfs(graph,1,visitied);
        System.out.println(count - 1);
    }

    private static void dfs(List<ArrayList<Integer>> graph, int start, boolean [] visitied){
        visitied[start] = true;
        count += 1;
        for(int i : graph.get(start)){
            if(!visitied[i]){
                dfs(graph,i,visitied);
            }
        }
    }
}
