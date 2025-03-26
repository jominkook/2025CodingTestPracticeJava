import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solved_1260_2 {
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean [] visited;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);
        int V = Integer.parseInt(buffer[2]);

        for(int i = 0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        visited = new boolean[M];

        for(int i = 0; i<M; i++){
            String [] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(graph,V,visited);
        System.out.println();
    }
    private static void dfs(List<ArrayList<Integer>> graph, int start,boolean [] visited){
        visited[start] = true;
        System.out.print(start + " ");
        for(int a : graph.get(start)){
            if(!visited[a]){
                dfs(graph,a,visited);
            }
        }
    }
}
