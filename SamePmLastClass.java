public class SamePmLastClass extends SameMonthLastClass{
    public void timecount(String exittime){
    if (Integer.parseInt(exittime.substring(0, 2)) == 12) {
        HoursInLastDay = 12;
        MinutesInLastDay = Integer.parseInt(exittime.substring(3, 5));
    } else {
        HoursInLastDay = 12 + Integer.parseInt(exittime.substring(0, 2));
        MinutesInLastDay = Integer.parseInt(exittime.substring(3, 5));
    }}}
