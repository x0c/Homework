package company;

public class SHolder extends People {
	
	public SHolder(String name, int sal, int bir) {
		super(name, sal, bir);
	}
	
	@Override
	public void getInfo(int mon) {
		String name = this.getName();
		int sal = this.getSal();
		
		//��Ӫҵ��ȡ10��15������ֵ
		int turnover = (int)(Math.random()*100000+50000);
		int bonus = turnover - Reader.getSalSum();
		String bonusS;
		if(12 == mon) {
			bonusS = " 12�·ֺ�:"+bonus;
		}
		else bonusS = "";
		
		System.out.println("�ɶ�:"+name+" ����:"+sal+bonusS);
	}
}
