package book.exam.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		/*
		 * �����������̳ʿ� ���� �����ؼ� ��ü�� ���޹޾� ����� �� �ֵ��� �����ϱ�
		 * Dependency Lookup����
		 * ��������: config/bean.xml
		 * �� ���:
		 * 		SamsungTV => samsung
		 * 		LgTV => lg
		 * 
		 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�		
		 */	
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/exam.xml");
		
//		TV tv1 = (SamsungTV)factory.getBean("samsung");
//		TV tv2 = (LgTV)factory.getBean("lg");
		TV tv = factory.getBean("tv", TV.class);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		factory.close();
	}

}
