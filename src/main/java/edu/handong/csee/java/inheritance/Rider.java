package edu.handong.csee.java.inheritance;

public class Rider {

	public static void main(String[] args) {
		Rider rider = new Rider();
		rider.run();
	}

	private void run() {
		Bicycle myBike = new MountainBike(1,1,1, "Dual");	
		Bicycle myBike2 = new MountainBike(1,1,1, "Dual");	
		
		if(myBike.equals(myBike2))
			System.out.println("same");
			
		
		Object a = new MountainBike(1,1,1, "Dual");//new Integer(5);
		MountainBike myBike33 = (MountainBike) a;
		Object b = myBike33;
		myBike.setGear(3);
		System.out.println("Current gear of myBike:" + myBike.gear);		
		myBike.speedUp(5);
		System.out.println("Current speed of myBike:" + myBike.speed);		
	}

}
