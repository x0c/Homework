package four;

import java.util.ArrayList;
import java.util.List;

public class Clist {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(1);
		Integer integer = new Integer(10);
		list.add(integer);
		Integer integer1 = list.get(0);
		System.out.println(integer1); //���10
		integer1 = 3;
		System.out.println(list.get(0)); //���10
		//��list�����Ԫ���Ƿ�ı�?
		//��:���ı�,get������ȡ�����±��ӦԪ��
	}
}
