package lgs;


public class Auto {

	private int horsePower;
	private int yearOfProduction;
	private Helm helm;
	private Engine engine;
	/* Constructor declaration */

	public Auto(int horsePower, int yearOfProduction, Helm helm, Engine engine) {
		super();
		this.horsePower = horsePower;
		this.yearOfProduction = yearOfProduction;
		this.helm = helm;
		this.engine = engine;
	}

	/* getters and setters */
	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/* toString declaration */
	@Override
	public String toString() {
		return "Auto [horsePower=" + horsePower + ", yearOfProduction=" + yearOfProduction + ", helm=" + helm
				+ ", engine=" + engine + "]";
	}

	

}