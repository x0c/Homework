package company;

public class SHolder extends People {
	
	public SHolder(String name, int sal, int bir) {
		super(name, sal, bir);
	}
	
	@Override
	public void getInfo(int mon) {
		String name = this.getName();
		int sal = this.getSal();
		
		//年营业额取20万到25万间随机值
		int turnover = (int)(Math.random()*50000+200000);
		int bonus = turnover - Reader.getSalSum();
		String bonusS;
		if(12 == mon) {
			bonusS = " 12月分红:"+bonus;
		}
		else bonusS = "";
		
		System.out.println("股东:"+name+" 工资:"+sal+bonusS);
	}
}
