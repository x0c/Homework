
public class Nursery {

	public static void main(String[] args) {
		String s = "bottles";
		for(int n=99; n>0; n--) {
			System.out.println(n + s + " of beer on the wall," + n + s + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			if(n-1 == 1)
				s="bottle";
			if(n!=1)
				System.out.println(n-1 + s + " of beer on the wall.\n");
			else
				System.out.println("No more bottles of beer on the wall.");
		}
	}

}
