package programmers;

public class VideoPlayer {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_lenS = second(video_len);
        //System.out.println(video_lenS);
        int posS = second(pos);
        int op_startS = second(op_start);
        int op_endS = second(op_end);

        if(posS >= op_startS && posS <= op_endS) {
            posS = op_endS;
        }

        for(String command : commands){
            if(command.equals("prev")){
                posS = Math.max(posS - 10,0);
            }else{
                posS = Math.min(posS + 10,video_lenS);
            }

            if(posS >= op_startS && posS <= op_endS){
                posS = op_endS;
            }
        }
        String minute = String.format("%02d",(int) Math.floor((double)posS / 60));
        String second = String.format("%02d",posS % 60);
        return minute + ":" + second;
    }
    private static int second(String time){
        String [] convertMinutes = time.split(":");
        return (Integer.parseInt(convertMinutes[0]) * 60) +  Integer.parseInt(convertMinutes[1]);
    }
}
