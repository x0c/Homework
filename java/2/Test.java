package two;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("�����������ͺš�����(L)���ٹ��������(L):");
	    
	    String model = scanner.next();
	    int[] n = new int[2];
		    for(int i=0;i<2;i++) {
		    	n[i] = scanner.nextInt();
		    }
	    scanner.close();
	    
	    Car car = new Car(model,n[0],n[1]);
	    System.out.println("�����ͺ�:"+ car.getModel());
	    System.out.println("��ʼ����:"+car.getTank()+" ������:"+car.getOilConsumption()+"L/�ٹ���");
	    car.run(5);
	    car.gas(20);
	    
	    System.out.println("ʣ������:"+ car.getTank());

	}

}
