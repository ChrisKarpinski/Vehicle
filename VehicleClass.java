/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Oct 2016
 * This is the vehicle class holding all of the properties and methods
 *  of a vehicle
 *
 ****************************************************************************/

public class Vehicle {

	protected String _licenseNum;
	protected String _colour;
	//protected int _numberOfDoors;
	protected double _speed;
	protected double _maxSpeed;
	
	public Vehicle (String colour, String license, double maxspeed) {
		this._licenseNum = license;
		this._colour = colour;
		this._maxSpeed = maxspeed;
		//this._numberOfDoors = doors;
	}
	
	protected void accelerate(int accelerateAmount) {
		
		this._speed = this._speed + accelerateAmount;
	}
	
    protected void brake(int decelerateAmount) {
		
    	if (this._speed > decelerateAmount) {
    		
		    this._speed = this._speed - decelerateAmount;
    	}
    	else System.out.println("You cannot brake by this amount");
	}
    
    public double getSpeed () {
    	
    	double currentSpeed = this._speed;
    	return currentSpeed;
    	
    }
    
    public String getLicense () {
    	
    	String license = this._licenseNum;
    	return license;
    	
    }
    
    public String getColour() {
    	String colour = this._colour;
    	return colour;
    }
    
    
    public double getMaxSpeed() {
    	double maxspeed = this._maxSpeed;
    	return maxspeed;
    }
    
    public String currentState() {
    	
    	String current;
    	current = ",speed: " + getSpeed() + " ,colour: " + getColour()
		+ " ,license plate #: " + getLicense() + " ,max speed: " + getMaxSpeed();
    	
    	return current;
    	
    }
    
    
}
