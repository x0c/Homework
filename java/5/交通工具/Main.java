package c;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����������:");
		String a = scan.next();
		System.out.println("������Ŀ�ĵ�:");
		String b = scan.next();
		System.out.println("���������:");
		double dist = scan.nextInt();
		System.out.print("��"+a+"��"+b);
		Car car = new Car();
		System.out.print("����");
		car.out(dist);
		Train train = new Train();
		System.out.print("��");
		train.out(dist);
		Plane plane = new Plane();
		System.out.print("�ɻ�");
		plane.out(dist);
		scan.close();
		
	}

}
