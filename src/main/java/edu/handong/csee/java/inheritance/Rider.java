package edu.handong.csee.java.inheritance;

public class Rider {

	public static void main(String[] args) {
		Rider rider = new Rider();
		rider.run();
	}

	private void run() {
		Bicycle myBike = new MountainBike(2,2,3, "Dual");	
		Bicycle myBike2 = new MountainBike(3,4,5, "Dual");	
		
		if(myBike.equals(myBike2))
			System.out.println("same");
			
		
		Object a = new MountainBike(5,6,6, "Dual");//new Integer(5);
		MountainBike myBike33 = (MountainBike) a;
		Object b = myBike33;
		System.out.println("Current cadence of myBike:" + myBike.cadence);	
		System.out.println("Current gear of myBike:" + myBike.gear);
		System.out.println("Current speed of myBike:" + myBike.speed);	
		myBike.setGear(3);
		System.out.println("Current gear of myBike:" + myBike.gear);		
		myBike.speedUp(5);
		System.out.println("Current speed of myBike:" + myBike.speed);		
	}
} 