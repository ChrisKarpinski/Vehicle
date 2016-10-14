/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Oct 2016
 * This program creates two vehicle objects and changes their properties
 *
 ****************************************************************************/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle bike1 = new Bicycle ("blue", "", 30, 2);
		Truck truck = new Truck ("red", "AAAA", 150, 4);
	 
		
		System.out.println("Bike1: " + bike1.currentState());
		System.out.println("Truck1: " + truck.currentState());
	}

}
