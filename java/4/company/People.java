package company;

public class People {
	//��ĿҪ��:
	//��������:Ա������͹ɶ�
	//�����˶�������:�����������յ�
	
	//�ɶ�ÿ��15�շ�����  (12���зֺ�)
	//Ա��ÿ��15�շ�����+��������
	//����ÿ��15�շ�����+��������+���⽱��
	//�ɶ�12�·ֺ�=0.1*(������:�������Ӫҵ��-ȫ�깤��֧��)
	
	//��������ʱ¼��Ա����Ϣ
	//�û���ѯ������ָ������
	//���ʰ� Ա��-����-�ɶ� ˳�����
	
	//������ѯ����:
	//����������ѯ ����/����/�ֺ�
	//��ѯ������ ����/����/�ֺ�
	private String name;
	private int sal;
	private int bir;
	
	public People() {
		super();
	}
	
	public People(String name, int sal, int bir) {
		super();
		this.name = name;
		this.sal = sal;
		this.bir = bir;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getBir() {
		return bir;
	}
	public void setBir(int bir) {
		this.bir = bir;
	}
	
	public void getInfo(int mon) {
		
	}
	
}
