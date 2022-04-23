public class AllCarinfoMatcher implements InputMatcher {

    @Override
    public boolean matches(int size) {

        if (size == 6)
            return true;
        else
            return false;
    }

    @Override
    public String generateRresponse() {

        System.out.println("All Car Information : \n");
        for (ParkingTicket pt : assignedspotlist) {
            return"\n\ncar number : " + pt.getAssignedCar().getNumberPlate() +
                    "       car color : " + pt.getAssignedCar().getCarColor() +
                    "       car type : " + pt.getAssignedCar().getCarType() +
                    "\nparking time : " + pt.getTime() + "    date : " + pt.getDate() +
                    "       spot number : " + pt.getSpotNumber();
        }
        return null;

    }

    public String toastring(AllCarinfoMatcher all){
        return all.toString();
    }
}
