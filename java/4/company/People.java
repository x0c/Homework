package company;

public class People {
	//项目要求:
	//有三种人:员工经理和股东
	//三种人都有属性:姓名工资生日等
	
	//股东每月15日发工资  (12月有分红)
	//员工每月15日发工资+生日礼物
	//经理每月15日发工资+生日礼物+额外奖金
	//股东12月分红=0.1*(年利润:随机数总营业额-全年工资支出)
	
	//程序启动时录入员工信息
	//用户查询工资需指定年月
	//工资按 员工-经理-股东 顺序输出
	
	//两个查询功能:
	//根据姓名查询 工资/奖金/分红
	//查询所有人 工资/奖金/分红
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
