package edu.hanodng.csee.java.interfaces;

public class JC implements Husband, Professor, Son, Student{

	public static void main(String[] args) {
		
		JC itsJC = new JC();
		itsJC.whoAmI();;
		
		Husband jcAsHusband = new JC();
		jcAsHusband.cleanHouse();
		
		Professor jcAsProfessor = new JC();
		jcAsProfessor.teach();;
		
		Son jcAsSon = new JC();
		jcAsSon.makeAPhoneCallToMother();
		
		Student jcAsStudent = new JC();
		jcAsStudent.learn();
	}
	
	public void whoAmI() {
		System.out.println("This is JC");
	}

	@Override
	public void learn() {
		System.out.println("I'm studying.");
	}

	@Override
	public void makeAPhoneCallToMother() {
		System.out.println("I'm calling my mom.");
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cleanHouse() {
		System.out.println("I'm clearning a living room and my wife is cooking.");
	}

}
