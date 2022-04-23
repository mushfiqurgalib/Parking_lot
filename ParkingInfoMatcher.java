import java.util.Scanner;

public class ParkingInfoMatcher implements InputMatcher {
    Scanner scan;

    @Override
    public boolean matches(int size) {

        if(size == 4)
        return true;
        else
        return false;
    }

    @Override
    public String generateRresponse() {

        int cheakspot = parkingspot.si();
        if (cheakspot == 10) {
            System.out.println("There is no car .");
        }

        else {
            System.out.print("Enter your car number : ");
            String number = scan.nextLine();
            ScanTicket scanticket = new ScanTicket();
            TotalTime totaltime = new TotalTime();
            Payment payment = new Payment();

            for (ParkingTicket cp : assignedspotlist) {
                String carnumber = cp.getAssignedCar().getNumberPlate();
                int item = scanticket.checknumber(number, carnumber);
                if (item == 0) {
                    continue;
                } else if (item == 1) {
                    int spot = assignedspotlist.indexOf(cp);
                    // System.out.println("\n"+spot+"\n");

                    String exitdate = randominfo.ExitDate();

                    String exittime = randominfo.ExitTime();

                    String enterdate = assignedspotlist.get(spot).getDate();
                    String entertime = assignedspotlist.get(spot).getTime();

                    int time[] = totaltime.CalculateTime(enterdate, exitdate, entertime, exittime);
                    float amount = payment.TotalAmount(time[0], time[1]);

                    System.out.println("\n\t\t=== Your Parking information ===\n" +
                            "Car Number : " + assignedspotlist.get(spot).getAssignedCar().getNumberPlate() +
                            "    Car Color : " + assignedspotlist.get(spot).getAssignedCar().getCarColor() +
                            "    Car Type : " + assignedspotlist.get(spot).getAssignedCar().getCarType() +
                            "\nParking Time : " + assignedspotlist.get(spot).getTime() +
                            "    Exit Time : " + exittime +
                            "\nParking Date : " + assignedspotlist.get(spot).getDate() +
                            "    Exit Date :" + exitdate +
                            "    Spot Number : " + assignedspotlist.get(spot).getSpotNumber() +
                            "\nTotal Time : " + time[0] + " Hour " + time[1] + " Minute " +
                            "\nTotal Amount : " + amount + " rupees\n");

                    parkingspot.FreeSpot(assignedspotlist.get(spot).getSpotNumber());
                    assignedspotlist.remove(spot);

                    break;
                }
            }
        }
        return null;
    }
}
