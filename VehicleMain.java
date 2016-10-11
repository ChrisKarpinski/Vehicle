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

		Vehicle vehicle1 = new Vehicle("blue", "AAAA", 250, 4);
		Vehicle vehicle2 = new Vehicle("red", "BBBAAA", 200, 2);
		
		vehicle1.accelerate(70);
		vehicle1.brake(20);
		
		vehicle2.accelerate(100);
		vehicle2.brake(10);
		
		vehicle1.currentState();
		vehicle2.currentState();
	}

}
