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
		
		//1.¼�벿��
		System.out.println("��ʼ����,�뿪ʼ¼����Ϣ:");
		while(true) {
			
			System.out.println("��ѡ��ְλ��ź�¼��:1.ְԱ; 2.����; 3.�ɶ�; 4.¼�����/��ʼ��ѯ; 5.�˳�ϵͳ");
			n = scan.nextInt();	
			if(n == 5) return;
			else if(n == 4) {
				wt.write();
				break;
			}
			System.out.println("����������");
			name = scan.next();
			System.out.println("��������н");
			sal = scan.nextInt();
			System.out.println("�����������·�");
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
					System.out.println("��������Ч���");
			}

		}
		
		
		//2.��ѯ����
		System.out.println("��ʼ��ѯ");
		rd.findAll();
		while(true) {
			System.out.println("��ѡ��: 1.ͨ��������ѯ; 2.��ѯȫ��; 3.�˳�ϵͳ");
			n = scan.nextInt();
			if(n == 3) return;
			System.out.println("�������ѯ�·�");
			mon = scan.nextInt();
			if(n == 1) {
				System.out.println("����������");
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
