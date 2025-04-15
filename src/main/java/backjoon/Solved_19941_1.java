package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved_19941_1 {
    static char [] graph;
    static boolean [] hambuger;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int K = Integer.parseInt(buffer[1]);
        String table = br.readLine();

        graph = new char[N];
        for(int i = 0; i<N; i++){
            graph[i] = table.charAt(i);
        }
        int count = 0;
        hambuger = new boolean[N];
        for(int i = 0; i<graph.length; i++){
            if(graph[i] == 'P'){

                for(int j = Math.max(0,i-K); j<=Math.min(N-1,i+K); j++){
                    if(!hambuger[j] && graph[j] == 'H'){
                        hambuger[j] = true;
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
