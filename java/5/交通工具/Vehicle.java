package c;

import java.text.DecimalFormat;

public abstract class Vehicle {
	protected String type;
	protected double goTime;
	protected double backTime;
	protected double ticketTime;
	protected double secureTime;
	protected double waitTime;
	protected double speed;
	protected double price;
	protected double sumPrice;
	protected double sumTime;
	 
	public abstract Double[] Count(Double distence);
	
	public void out(Double distence) {
		sumTime = Count(distence)[0];
		sumPrice = Count(distence)[1];
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println("耗时:"+df.format(sumTime)+"小时"+",价格:"+sumPrice+"元");
	}
}
