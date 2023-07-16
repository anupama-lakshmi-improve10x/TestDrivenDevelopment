package convertminutestoseconds;

public class ConvertMinuteToSecond {


    public int findConMinToSec(int min) {
        int seconds = 0;
        if(min >= 0) {
            seconds = min * 60;
        } else {
            seconds = -1;
        }
        return  seconds;
    }
}
