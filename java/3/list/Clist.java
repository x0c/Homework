package four;

import java.util.ArrayList;
import java.util.List;

public class Clist {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(1);
		Integer integer = new Integer(10);
		list.add(integer);
		Integer integer1 = list.get(0);
		System.out.println(integer1); //输出10
		integer1 = 3;
		System.out.println(list.get(0)); //输出10
		//问list里面的元素是否改变?
		//答:不改变,get方法获取给定下标对应元素
	}
}
