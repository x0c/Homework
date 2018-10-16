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
		
	//����ְԱ�б�
	private List<Emp> empList = new ArrayList<Emp>();
	//����
	private List<Mnger> mngerList = new ArrayList<Mnger>();
	//�ɶ�
	private List<SHolder> shderList = new ArrayList<SHolder>();
	
	//���б��������Ϣ
	public void addEmp(Emp e) {
		empList.add(e);
	}
	public void addMnger(Mnger m) {
		mngerList.add(m);
	}
	public void addSHolder(SHolder s) {
		shderList.add(s);		
	}

	//��XML�ļ�д��List
	public void write() {
		XMLWriter writer = null;
		try {
			Document doc = DocumentHelper.createDocument();
			Element root = doc.addElement("list");
			
			//ְԱ�ӱ�ǩ
			for(Emp emp : empList) {
				Element empEle = root.addElement("emp");
				empEle.addElement("name").addText(emp.getName());
				empEle.addElement("sal").addText(emp.getSal()+"");
				empEle.addElement("bir").addText(emp.getBir()+"");			
			}
			
			//�����ӱ�ǩ
			for(Mnger mnger : mngerList) {
				Element empEle = root.addElement("mnger");
				empEle.addElement("name").addText(mnger.getName());
				empEle.addElement("sal").addText(mnger.getSal()+"");
				empEle.addElement("bir").addText(mnger.getBir()+"");			
			}
			
			//�ɶ��ӱ�ǩ
			for(SHolder sholder : shderList) {
				Element empEle = root.addElement("sholder");
				empEle.addElement("name").addText(sholder.getName());
				empEle.addElement("sal").addText(sholder.getSal()+"");
				empEle.addElement("bir").addText(sholder.getBir()+"");			
			}
			
			//�����ļ�
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
