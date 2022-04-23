

public class ParkingDetailsMatcher implements InputMatcher {
    public boolean matches(int size) {
        if(size == 5)
        return true;
        else
        return false;
    }
    
    @Override
    public String generateRresponse() {
     
        System.out.print("\033\143");
      
        // get car information from car class
        String carcolor = randominfo.CarColor();
        String numberplate = randominfo.Numberplate();
        String cartype = randominfo.CarType();

        parkingticket.setAssignedCar(car);
        parkingticket.getAssignedCar().setNumberPlate(numberplate);
        parkingticket.getAssignedCar().setCarColor(carcolor);
        parkingticket.getAssignedCar().setCarType(cartype);

        // get spot from parkingSpot class
        int spotnum = parkingspot.SpotNum();
        if(spotnum == 0){
            System.out.println("Sorry, spot is not available.");
        
        }
        parkingticket.setSpotNumber(spotnum);


        // get parking ticket from parkingticket class
        String cardtype = randominfo.CardType();
        String time = randominfo.Time();
        String date = randominfo.Date();
        long cardnumber = randominfo.CardNumber();

        parkingticket.setCardType(cardtype);
        parkingticket.setTime(time);
        parkingticket.setDate(date);
        parkingticket.setCardNumber(cardnumber);



        System.out.println("\t\t== Parking Ticket ==\n" +
                "Car Number : " + numberplate + "    Car Color : " + carcolor + "    Car Type : " + cartype +
                "\nParking Time : " + time + "    Date : " + date +
                "\nSpot Number : " + spotnum + "\n"
        );


        assignedspotlist.add(parkingticket);
        System.out.println(assignedspotlist.size());
        return date;

    }

  
}
