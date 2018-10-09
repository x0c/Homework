package b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Compare {
	
	private static List<Integer> arrayList;
	private static Map<Integer, Integer> treeMap;
	private static Map<Integer, Integer> hashMap;
	private static Set<Integer> treeSet;
	private static Set<Integer> hashSet;
	
	public void testListSpeed(List<Integer> list, Integer[] search_int){
		for(Integer n : search_int) {
			list.get(n);
		}
	}

	public void testMapSpeed(Map<Integer, Integer> map, Integer[] search_int){
		for(Integer n : search_int){
			map.get(n);
		}
	}
	
	public void testSetSpeed(Set<Integer> set, Integer[] search_int){
		for(Integer n : search_int){
			set.contains(n);
		}
	}
	
	public void init(Integer[] search_int){
		arrayList = new ArrayList<Integer>();
		hashMap = new HashMap<Integer, Integer>();
		treeMap = new TreeMap<Integer, Integer>();
		treeSet = new TreeSet<Integer>();
		hashSet = new HashSet<Integer>();
		
		for(Integer n : search_int) {
			arrayList.add(n);
			hashMap.put(n, n);
			treeMap.put(n, n);
			hashSet.add(n);
			treeSet.add(n);
		}
	}
	
	public static void main(String[] args){
		Integer[] x = new Integer[1000000];
		for(int j=0;j<1000000;j++) {
			x[j] = j;
		}
		Compare cp = new Compare();
		cp.init(x);
		
		long t1 = System.currentTimeMillis();
		long t2 = System.currentTimeMillis();
       
        t1 = System.currentTimeMillis();
        cp.testMapSpeed(hashMap, x);
        t2 = System.currentTimeMillis();
        System.out.println("测试hashMap用时 = "+(t2-t1)+" ms");
       
        t1 = System.currentTimeMillis();
        cp.testMapSpeed(treeMap, x);
        t2 = System.currentTimeMillis();
        System.out.println("测试treeMap用时 = "+(t2-t1)+" ms");
        
        t1 = System.currentTimeMillis();
        cp.testSetSpeed(hashSet, x);
        t2 = System.currentTimeMillis();
        System.out.println("测试hashSet用时 = "+(t2-t1)+" ms");
       
        t1 = System.currentTimeMillis();
        cp.testSetSpeed(treeSet, x);
        t2 = System.currentTimeMillis();
        System.out.println("测试treeSet用时 = "+(t2-t1)+" ms");
		
        t1 = System.currentTimeMillis();
        cp.testListSpeed(arrayList, x);
        t2 = System.currentTimeMillis();
        System.out.println("测试ArrayList用时 = "+(t2-t1)+" ms");
        //测试hashMap用时 = 16 ms
        //测试treeMap用时 = 71 ms
        //测试hashSet用时 = 15 ms
        //测试treeSet用时 = 78 ms
        //测试ArrayList用时 = 16 ms
    }
}







