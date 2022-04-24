import java.util.ArrayList;

public class ParkingSpot{
	
	private ArrayList<Integer> arr = new ArrayList<Integer> ();

	ArrayList<Integer> iter=(ArrayList<Integer>) arr.iterator();
	public int SpotNum(){
		int spot = 0;
		for (Integer i:arr){
			if(i == 0) {
				spot = i + 1;
				i = i + 1;
				break;
			}
		}
		return spot;
	}

	public int si(){
		int cheakspot = 0;
		for(Integer i:arr){
			if(i != 0){
				return 1;
			}
			else if(i == 0){
				cheakspot++;
			}
		}
		return cheakspot;
	}

	public void sipe(){
		System.out.print("\nSpot status : ");
		for(Integer i:arr){
			System.out.print(i+"  ");
		}
		System.out.println();
	}

	


}
