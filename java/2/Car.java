package two;

public class Car {

	private String model;
	private int tank;
	private int oilConsumption;
	
	public Car(String model, int tank, int oilConsumption) {
		super();
		this.model = model;
		this.tank = tank;
		this.oilConsumption = oilConsumption;
	}
	
	public Car() {
		super();
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTank() {
		return tank;
	}

	public void setTank(int tank) {
		this.tank = tank;
	}

	public int getOilConsumption() {
		return oilConsumption;
	}

	public void setOilConsumption(int oilConsumption) {
		this.oilConsumption = oilConsumption;
	}
	
	
	public void gas(int n) {
		this.tank += n;
		System.out.println("加了"+n+"升油");
	}
	
	public void run(int n) {
		this.tank -= n*this.oilConsumption;
		System.out.println("跑了"+n+"百公里");
	}

}

