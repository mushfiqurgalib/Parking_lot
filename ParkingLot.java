import java.util.*;

public class ParkingLot {
	static ArrayList<InputMatcher> inputMatchers;

	
	public ParkingLot(ArrayList<InputMatcher>inputMatchers)
	{ super();
		this.inputMatchers=inputMatchers;


	}
	 public static void main(String[] args) {
		private String strReturn;
		System.out.print("You want to parked your vehicle : ");
		Scanner scan = new Scanner(System.in);
		String userinput = scan.nextLine();
		
			int size = userinput.length();
			System.out.println(size);
		
			
		for(InputMatcher inputMatcher:inputMatchers){
			
		
			
			if(inputMatcher.matches(size)) strReturn=inputMatcher.generateRresponse();
		
		}
	

	
		

	

	}
}
