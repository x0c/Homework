package c;

public class Car extends Vehicle{
	protected String type = "Æû³µ";
	protected double goTime = 0.3;
	protected double backTime = 0.4;
	protected double ticketTime = 0.5;
	protected double secureTime = 0.0;
	protected double waitTime = 0.5;
	protected double speed = 60;
	protected double price = 0.32;
	
	@Override
	public Double[] Count(Double distence) {		
		sumTime = distence/speed+backTime+ticketTime+secureTime+waitTime;
		sumPrice = distence * price;
		Double[] d = new Double[2];
		d[0] = sumTime;
		d[1] = sumPrice;
		return d;
	}
	
}
