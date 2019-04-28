package edu.handong.csee.java.inheritance;

public class Rider {

	public static void main(String[] args) {
		Rider rider = new Rider();
		rider.run();
	}

	private void run() {
		Bicycle myBike = new MountainBike(100,1,1,1);	
		myBike.speedUp(5);
		System.out.println("Current speed of myBike:" + myBike.speed);		
	}

}
