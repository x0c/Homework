package company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Writer {	
		
	//创建职员列表
	private List<Emp> empList = new ArrayList<Emp>();
	//经理
	private List<Mnger> mngerList = new ArrayList<Mnger>();
	//股东
	private List<SHolder> shderList = new ArrayList<SHolder>();
	
	//向列表中添加信息
	public void addEmp(Emp e) {
		empList.add(e);
	}
	public void addMnger(Mnger m) {
		mngerList.add(m);
	}
	public void addSHolder(SHolder s) {
		shderList.add(s);		
	}

	//向XML文件写入List
	public void write() {
		XMLWriter writer = null;
		try {
			Document doc = DocumentHelper.createDocument();
			Element root = doc.addElement("list");
			
			//职员子标签
			for(Emp emp : empList) {
				Element empEle = root.addElement("emp");
				empEle.addElement("name").addText(emp.getName());
				empEle.addElement("sal").addText(emp.getSal()+"");
				empEle.addElement("bir").addText(emp.getBir()+"");			
			}
			
			//经理子标签
			for(Mnger mnger : mngerList) {
				Element empEle = root.addElement("mnger");
				empEle.addElement("name").addText(mnger.getName());
				empEle.addElement("sal").addText(mnger.getSal()+"");
				empEle.addElement("bir").addText(mnger.getBir()+"");			
			}
			
			//股东子标签
			for(SHolder sholder : shderList) {
				Element empEle = root.addElement("sholder");
				empEle.addElement("name").addText(sholder.getName());
				empEle.addElement("sal").addText(sholder.getSal()+"");
				empEle.addElement("bir").addText(sholder.getBir()+"");			
			}
			
			//生成文件
			FileOutputStream fos = new FileOutputStream("pplist.xml");
			writer = new XMLWriter(fos, OutputFormat.createPrettyPrint());
			writer.write(doc);
			
		} catch(Exception e) {
			e.printStackTrace();
		
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
