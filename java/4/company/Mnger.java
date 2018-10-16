package company;

public class Mnger extends People {
	
	public Mnger(String name, int sal, int bir) {
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
		
		System.out.println("经理:"+name+" 工资:"+sal+" 奖金10000元"+birS);
	}
}
