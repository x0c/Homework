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
			birS = " 本月有生日礼物";
		} 
		else birS = "";
		
		System.out.println("员工:"+name+" 工资:"+sal+birS);
	}
	
}
