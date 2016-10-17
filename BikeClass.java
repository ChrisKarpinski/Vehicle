public class Bicycle extends Vehicle{
	
	private int _numberOfSeats;
	
	public Bicycle(String colour, double maxspeed, int numberSeats) {
		super(colour, null, maxspeed);
		
		this._numberOfSeats = numberSeats;
		// TODO Auto-generated constructor stub
	}
	
	public Bicycle(String colour, int numberSeats) {
		super(colour, null, 0);
	
		
		this._numberOfSeats = numberSeats;
		// TODO Auto-generated constructor stub
	}
	
	public int getSeats() {
		
		int seatsNum = this._numberOfSeats;
		return seatsNum;
		
	}
	
	public String currentState () {
		 
		String current;
		
       current = super.currentState() + " number of seats " + getSeats();
    	
    	
    	return current;
		
	}
	
}
