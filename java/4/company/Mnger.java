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
			birS = " ��������������";
		} 
		else birS = "";
		
		System.out.println("����:"+name+" ����:"+sal+" ����10000Ԫ"+birS);
	}
}
