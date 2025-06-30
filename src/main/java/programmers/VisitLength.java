package programmers;

import java.util.*;
public class VisitLength {
    public static void main(String[] args) {
        String[] testCases = {
                "ULURRDLLU",
                "LULLLLLLU" 
        };

        for (String dirs : testCases) {
            int answer = solution(dirs);
            System.out.println(answer);
        }
    }

    public static int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        int answer = 0;

        for(char dir : dirs.toCharArray()){
            int nx = x, ny = y;
            if(dir == 'U') ny++;
            else if(dir == 'D') ny--;
            else if(dir == 'R') nx++;
            else if(dir == 'L') nx--;


            if(nx < -5 || nx > 5 || ny < -5 || ny > 5){
                continue;
            }

            String path1 = x + "," + y + "," + nx + "," + ny;
            String path2 = nx + "," + ny + "," + x + "," + y;
            //System.out.println(path1);
            //System.out.println(path2);
            if(!visited.contains(path1) && !visited.contains(path2)){
                visited.add(path1);
                visited.add(path2);
                answer++;
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}
