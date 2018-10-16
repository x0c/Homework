package company;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Reader {
	
	//����ְԱ�б�
	List<Emp> empList = new ArrayList<Emp>();
	//����
	List<Mnger> mngerList = new ArrayList<Mnger>();
	//�ɶ�
	List<SHolder> shderList = new ArrayList<SHolder>();
	
	//��XML�ж�ȡָ����������
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
	
	//��XML��ȡ������
	public void findAll() {
		
		try {
			SAXReader reader = new SAXReader();
			Document doc = 
					reader.read(new FileInputStream("pplist.xml"));
			
			Element root = doc.getRootElement();

			//�ڵ��б�
			List<Element> elements = root.elements();	
			
			String ele = null;
			for(Element ppEle : elements) {
				
				//��ȡ����
				String name = ppEle.elementTextTrim("name");				
				//��ȡ����
				int sal = Integer.parseInt(
						ppEle.elementTextTrim("sal"));
				//��ȡ����
				int bir = Integer.parseInt(
						ppEle.elementTextTrim("bir"));
				
				//����
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
	
	//��ȡ�ܹ���
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
