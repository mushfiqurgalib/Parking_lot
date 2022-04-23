import java.util.ArrayList;

public interface InputMatcher{
    ParkingSpot parkingspot = new ParkingSpot();
	RandomInfo randominfo = new RandomInfo();
    ParkingTicket parkingticket = new ParkingTicket();
    Car car=new Car();
    ArrayList<ParkingTicket> assignedspotlist = new ArrayList<>();
    
    public boolean matches(int size);
	public String generateRresponse();
}