import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Main {

    static LocalTime videoLen;
    static LocalTime current;
    static LocalTime openingStart;
    static LocalTime openingEnd;

    public static void main(String[] args) {
//        Solution("34:33", "13:00", "00:55", "02:55", new String[]{"next","prev"});
//        Solution("00:06", "00:05" ,"00:05" , "00:06", new String[]{"prev","next","next"} );
        Solution("34:33", "09:50", "10:00", "13:00", new String[] {"next", "next", "next", "prev"});
    }



    public static String Solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        videoLen = toTime(video_len);
        current = toTime(pos);
        openingStart = toTime(op_start);
        openingEnd = toTime(op_end);

        // 입력된 commands를 탐색합니다.
        for(String command: commands) {
            int second = 0;
            switch (command) {
                // next일 경우 10초 앞으로 이동이므로 10 으로 설정합니다.
                case "next" : {
                    second = 10;
                    break;
                }

                // prev 일 경우 10초 뒤로 이동이므로 -10 으로 설정합니다.
                case "prev" : {
                    second = -10;
                    break;
                }
            }

            // second를 현재 시간에 더한 후, 현재 시간의 validation을 체크합니다.
            current = current.plusSeconds(second);
            current = checkCurrent(current);

        }

        // 정답을 %2s:%2s 형식으로 출력합니다.
        return current.format(DateTimeFormatter.ofPattern("mm:ss"));
    }


    // 들어온 시간을 : 기준으로 split 하여 LocalTime 으로 변환하는 함수입니다.
    // 문제에서 분과 초만을 사용하기 때문에 시간은 0 으로 고정해둡니다.
    public static LocalTime toTime(String time) {
        String[] timeArray = time.split(":");
        return LocalTime.of(0, Integer.parseInt(timeArray[0]), Integer.parseInt(timeArray[1]));
    }


    // validation을 체크하는 함수입니다.
    // 각 분기 별로 return 을 하지 않는 이유는 openingStart가 00:00:00 와 같은 시간이 될 수 있기에, 독립적으로 시행합니다.
    public static LocalTime checkCurrent(LocalTime cur) {

        // 만약 cur의 시간이 23 이라면, prev를 하며 00:00 을 지나간 것입니다. 그렇기에 MIN 값인 00:00:00 으로 설정해줍니다.
        if(cur.getHour() == 23) cur = LocalTime.MIN;

        // 만약 cur이 videoLen보다 크다면, 비디오 길이를 초과한 것이므로 videooLen으로 설정해줍니다.
        if(cur.isAfter(videoLen)) cur = videoLen;

        // 만약 현재 시간이 openingStart <= cur <= openingEnd 라면, opening 중의 시간이므로 openingEnd로 설정해줍니다.
        if(( cur.equals(openingStart)  || cur.isAfter(openingStart)) && (cur.equals(openingEnd) || cur.isBefore(openingEnd))) cur = openingEnd;

        return cur;

    }

}
