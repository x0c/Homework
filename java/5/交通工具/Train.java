package c;

public class Train extends Vehicle{
	protected String type = "火车";
	protected double goTime = 0.9;
	protected double backTime = 0.8;
	protected double ticketTime = 0.5;
	protected double secureTime = 0.1;
	protected double waitTime = 0.4;
	protected double speed = 300;
	protected double price = 0.45;
	
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
