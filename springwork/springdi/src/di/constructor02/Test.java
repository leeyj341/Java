package di.constructor02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		Service myService = factory.getBean("service", Service.class);
		myService.test();
		factory.close();
	}

}
