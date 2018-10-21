package c;

public class Plane extends Vehicle{
	protected String type = "·É»ú";
	protected double goTime = 1.5;
	protected double backTime = 1.4;
	protected double ticketTime = 0.5;
	protected double secureTime = 0.2;
	protected double waitTime = 0.9;
	protected double speed = 900;
	protected double price = 0.75;
	
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
