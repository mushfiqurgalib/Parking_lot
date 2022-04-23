public class TotalTime {

    public static int[] CalculateTime(String enterdate, String exitdate, String entertime, String exittime){

        int firstDay = Integer.parseInt(enterdate.substring(8, 10));
        int lastDay = Integer.parseInt(exitdate.substring(8, 10));
        int firstMonth = Integer.parseInt(enterdate.substring(5,7), 10);
        int lastMonth = Integer.parseInt(exitdate.substring(5,7));
        int firstYear = Integer.parseInt(enterdate.substring(0,4));
        int hour=0,minute=0;
        //time calculation for different month days
        if( firstMonth != lastMonth){
            int daysInMonth ;
            if (firstMonth == 1 || firstMonth == 3 || firstMonth == 5 || firstMonth == 7 || firstMonth == 8 || firstMonth == 10 || firstMonth == 12 ) {
                daysInMonth = 31;
            }
            else {
                if (firstMonth == 2) {
                    daysInMonth = (firstYear % 4 == 0) ? 29 : 28;
                } else {
                    daysInMonth = 30;
                }
            }

            int Days = daysInMonth - firstDay;
            Days = Days + (lastDay - 1);
            AmDiff amDiff=new AmDiff();
            PmDiff pmDiff=new PmDiff();
            
            if (entertime.substring(6, 8).equals("AM")) {
                amDiff.timecount("entertime");
             
            } else if (entertime.substring(6, 8).equals("PM")) {
                pmDiff.timecount("entertime");
              
            }


            DiffAmLastClass dalc=new DiffAmLastClass();
            DiffPmLastClass dplc=new DiffPmLastClass();

            if (exittime.substring(6, 8).equals("AM")) {
               dalc.timecount(exittime);
            } else if (exittime.substring(6, 8).equals("PM")) {
             dplc.timecount(exittime);
            }

            // Total hours  and minutes

           

            if (minute >= 60) {
                minute = minute - 60;
                hour = hour + 1;
            }

            return new int[]{hour, minute};

        }
        // time calculation for same month days
        else {
            if ((lastDay - firstDay) >= 2) {
                // Total hour in days
                int Days = (lastDay - (firstDay - 1)) - 2;
                AmSame amsame=new AmSame();
                PmSame pmsame=new PmSame();
                SameAmLastClass salc=new SameAmLastClass();
                SamePmLastClass splc=new SamePmLastClass();
                if (entertime.substring(6, 8).equals("AM")) {
                    amsame.timecount("entertime");
                  
                } else if (entertime.substring(6, 8).equals("PM")) {
                    pmsame.timecount("entertime");
                
                }


                // Total hour and minute in last day
                int HoursInLastDay = 0;
                int MinutesInLastDay = 0;

                if (exittime.substring(6, 8).equals("AM")) {
                salc.timecount(exittime);
                } else if (exittime.substring(6, 8).equals("PM")) {
                  splc.timecount(exittime);
                    }
                }

                // Total hours  and minutes

               

                if (minute >= 60) {
                    minute = minute - 60;
                    hour = hour + 1;
                }

                return new int[]{hour, minute};
            }

           

        }}