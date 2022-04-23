public class SameAmLastClass extends SameMonthLastClass{
    public void timecount(String exittime) {
        if (Integer.parseInt(exittime.substring(0, 2)) == 12) {
            HoursInLastDay = 0;
            MinutesInLastDay = Integer.parseInt(exittime.substring(3, 5));
        } else {
            HoursInLastDay = Integer.parseInt(exittime.substring(0, 2));
            MinutesInLastDay = Integer.parseInt(exittime.substring(3, 5));
        }}}
