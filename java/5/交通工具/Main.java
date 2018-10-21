package c;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入出发地:");
		String a = scan.next();
		System.out.println("请输入目的地:");
		String b = scan.next();
		System.out.println("请输入距离:");
		double dist = scan.nextInt();
		System.out.print("由"+a+"到"+b);
		Car car = new Car();
		System.out.print("汽车");
		car.out(dist);
		Train train = new Train();
		System.out.print("火车");
		train.out(dist);
		Plane plane = new Plane();
		System.out.print("飞机");
		plane.out(dist);
		scan.close();
		
	}

}
