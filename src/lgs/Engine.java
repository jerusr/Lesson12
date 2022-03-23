package lgs;


public class Engine {
	
	private int cylinderNumber;

	public Engine(int cylinderNumber) {
		super();
		this.cylinderNumber = cylinderNumber;
	}

	public int getCylinderNumber() {
		return cylinderNumber;
	}

	public void setCylinderNumber(int cylinderNumber) {
		this.cylinderNumber = cylinderNumber;
	}

	@Override
	public String toString() {
		return "Engine [cylinderNumber=" + cylinderNumber + "]";
	}
	
	
	
	
}
