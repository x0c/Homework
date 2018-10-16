package company;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Writer wt = new Writer();
		Reader rd = new Reader();
		
		Integer n;
		String name;
		Integer sal;
		Integer bir, mon;
		
		//1.录入部分
		System.out.println("开始运行,请开始录入信息:");
		while(true) {
			
			System.out.println("请选择职位序号后录入:1.职员; 2.经理; 3.股东; 4.录入结束/开始查询; 5.退出系统");
			n = scan.nextInt();	
			if(n == 5) return;
			else if(n == 4) {
				wt.write();
				break;
			}
			System.out.println("请输入姓名");
			name = scan.next();
			System.out.println("请输入月薪");
			sal = scan.nextInt();
			System.out.println("请输入生日月份");
			bir = scan.nextInt();
			
			switch(n) {
				case 1:
					Emp e = new Emp(name, sal, bir);
					wt.addEmp(e);
					break;
				case 2:
					Mnger m = new Mnger(name, sal, bir);
					wt.addMnger(m);
					break;
				case 3:
					SHolder s = new SHolder(name, sal, bir);
					wt.addSHolder(s);
					break;
				default:
					System.out.println("请输入有效序号");
			}

		}
		
		
		//2.查询部分
		System.out.println("开始查询");
		rd.findAll();
		while(true) {
			System.out.println("请选择: 1.通过姓名查询; 2.查询全部; 3.退出系统");
			n = scan.nextInt();
			if(n == 3) return;
			System.out.println("请输入查询月份");
			mon = scan.nextInt();
			if(n == 1) {
				System.out.println("请输入姓名");
				name = scan.next();
				People pp = rd.findOne(name);
				pp.getInfo(mon);
			} else if(n == 2) {
				for(Emp emp : rd.empList) {
					emp.getInfo(mon);
				}
				for(Mnger mng : rd.mngerList) {
					mng.getInfo(mon);
				}
				for(SHolder shd : rd.shderList) {
					shd.getInfo(mon);
				}
			}
		}
		
	}

}
