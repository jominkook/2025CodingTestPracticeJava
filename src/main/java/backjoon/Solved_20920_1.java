package backjoon;

import java.io.*;
import java.util.*;

public class Solved_20920_1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] buffer = br.readLine().split(" ");
        int N = Integer.parseInt(buffer[0]);
        int M = Integer.parseInt(buffer[1]);

        Map<String,Integer> word = new HashMap<>();

        for(int i = 0; i<N; i++){
            String input = br.readLine();
            if(input.length() >= M){
                word.put(input,word.getOrDefault(input,0)+1);
            }
        }

        List<String> wordList = new ArrayList<>(word.keySet());


        wordList.sort((o1,o2) -> {
            int word1 = word.get(o1);
            int word2 = word.get(o2);
//            System.out.println(word.get(o1));
//            System.out.println(word.get(o2));

            if(word1 != word2){
                return word2 - word1;
            }

            if(o1.length() != o2.length()){
                return o2.length() - o1.length();
            }
            return o1.compareTo(o2);
        });

        for(String w : wordList){
            bw.write(w + "\n");
        }
        bw.flush();
        bw.close();

    }
}
