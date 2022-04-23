public class AmDiff extends DiffMonthClass{
    public void timecount(String entertime) {
    if (Integer.parseInt(entertime.substring(0, 2)) == 12) {
        HoursInFirstDay = 11 + 12;
        MinutesInFirstDay = 60 - Integer.parseInt(entertime.substring(3, 5));
    } else {
        HoursInFirstDay = (12 - (Integer.parseInt(entertime.substring(0, 2)) + 1)) + 12;
        MinutesInFirstDay = 60 - Integer.parseInt(entertime.substring(3, 5));
    };
}}