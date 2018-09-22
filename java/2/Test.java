package two;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请依次输入型号、油量(L)、百公里耗油量(L):");
	    
	    String model = scanner.next();
	    int[] n = new int[2];
		    for(int i=0;i<2;i++) {
		    	n[i] = scanner.nextInt();
		    }
	    scanner.close();
	    
	    Car car = new Car(model,n[0],n[1]);
	    System.out.println("汽车型号:"+ car.getModel());
	    System.out.println("初始油量:"+car.getTank()+" 耗油量:"+car.getOilConsumption()+"L/百公里");
	    car.run(5);
	    car.gas(20);
	    
	    System.out.println("剩余油量:"+ car.getTank());

	}

}
