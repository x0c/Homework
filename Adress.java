
public class Adress {

	public static void main(String[] args) {	
		String c = "abc";
		String a = c;
		System.out.println("c:" + c + "         " + "a:" + a);
		
		int hashCodeC = System.identityHashCode(c);
		int hashCodeA = System.identityHashCode(a);
		System.out.println("c:" + hashCodeC + "  " + "a:" + hashCodeA);
		
		a = "123";
		System.out.println("�޸�a��ֵΪ" + a + "��,c��ֵΪ" + c);
		int hashCodeC1 = System.identityHashCode(c);
		int hashCodeA1 = System.identityHashCode(a);
		System.out.println("c:" + hashCodeC1 + "  " + "a:" + hashCodeA1);
	}

}
