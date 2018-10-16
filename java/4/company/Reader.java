package company;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Reader {
	
	//创建职员列表
	List<Emp> empList = new ArrayList<Emp>();
	//经理
	List<Mnger> mngerList = new ArrayList<Mnger>();
	//股东
	List<SHolder> shderList = new ArrayList<SHolder>();
	
	//从XML中读取指定姓名的人
	public People findOne(String name) {
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new FileInputStream("pplist.xml"));
			
			People pp  = null;
			List<Element> List = doc.selectNodes("//*[name='"+name+"']");
			for(Element Ele : List) {
				int sal = Integer.parseInt(
					Ele.elementTextTrim("sal"));
				int bir = Integer.parseInt(
					Ele.elementTextTrim("bir"));
				
				if(Ele.getName() == "emp")
					pp = new Emp(name, sal, bir);
				else if(Ele.getName() == "mnger")
					pp = new Mnger(name, sal, bir);
				else if(Ele.getName() == "sholder")
					pp = new SHolder(name, sal, bir);
				return pp;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//从XML读取所有人
	public void findAll() {
		
		try {
			SAXReader reader = new SAXReader();
			Document doc = 
					reader.read(new FileInputStream("pplist.xml"));
			
			Element root = doc.getRootElement();

			//节点列表
			List<Element> elements = root.elements();	
			
			String ele = null;
			for(Element ppEle : elements) {
				
				//获取名字
				String name = ppEle.elementTextTrim("name");				
				//获取工资
				int sal = Integer.parseInt(
						ppEle.elementTextTrim("sal"));
				//获取生日
				int bir = Integer.parseInt(
						ppEle.elementTextTrim("bir"));
				
				//分类
				ele = ppEle.getName();
				if(ele == "emp") {
					Emp emp = new Emp(name, sal, bir);
					empList.add(emp);
				} else if(ele == "mnger") {
					Mnger mnger = new Mnger(name, sal, bir);
					mngerList.add(mnger);
				} else if(ele == "sholder") {
					SHolder sholder = new SHolder(name, sal, bir);
					shderList.add(sholder);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//获取总工资
	public static int getSalSum() {
		
		try {
			SAXReader reader = new SAXReader();
			Document doc = 
					reader.read(new FileInputStream("pplist.xml"));
			
			List<Element> salList = doc.selectNodes("//sal");
			int salSum = 0;
			for(Element salEle : salList) {
				salSum += Integer.parseInt(
						salEle.getTextTrim());
			}
			return salSum;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
		
}	
