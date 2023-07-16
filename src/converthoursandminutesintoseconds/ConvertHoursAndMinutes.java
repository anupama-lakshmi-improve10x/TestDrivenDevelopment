package converthoursandminutesintoseconds;

public class ConvertHoursAndMinutes {


    public int convert(int hours, int mins) {
        int seconds = 0;
        if(hours > -1 && mins > -1) {
            seconds = hours * 3600 + mins * 60;
        } else{
           seconds = -1;
        }
        return seconds;
    }
}
