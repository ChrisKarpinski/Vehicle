public class Truck extends Vehicle{
	
	private int _numberOfTires;
	
	public Truck(String colour, String license, double maxspeed, int numberTires) {
		super(colour, license, maxspeed);
		
		this._numberOfTires = numberTires;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getTires() {
		
		return this._numberOfTires;
		
	}
	
	public String currentState() {
		
		String current;
		
current = super.currentState() + " number of tires " + getTires();
    	
    	
    	return current;
		
	}
}
