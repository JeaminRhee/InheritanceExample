package edu.handong.csee.java.inheritance;

public class MountainBike extends Bicycle {
    
	private String suspension;

    public MountainBike(
               int startCadence,
               int startSpeed,
               int startGear,
               String suspensionType){
        
        this.setSuspension(suspensionType);
    }

    

    @Override
	public boolean equals(Object obj) {
    	
    	MountainBike other = (MountainBike) obj;
    	
    	if(this.speed != other.speed)
    			return false;
    	
    	if(this.cadence != other.cadence)
			return false;
    	
    	if(this.gear != other.gear)
			return false;
    	
    	if(!this.suspension.equals(other.suspension))
    		return false;
    	
		return true;
	}


	public String getSuspension(){
        return this.suspension;
      }

      public void setSuspension(String suspensionType) {
          this.suspension = suspensionType;
      }

      @Override
      public void printDescription() {
          super.printDescription();
          System.out.println("The " + "MountainBike has a" +
              getSuspension() + " suspension.");
      }
  } 

