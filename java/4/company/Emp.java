package company;

public class Emp extends People {
	
	public Emp(String name, int sal, int bir) {
		super(name, sal, bir);
	}
	
	@Override
	public void getInfo(int mon) {
		String name = this.getName();
		int sal = this.getSal();
		String birS;
		if(this.getBir() == mon) {
			birS = " ��������������";
		} 
		else birS = "";
		
		System.out.println("Ա��:"+name+" ����:"+sal+birS);
	}
	
}
