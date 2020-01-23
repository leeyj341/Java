package di.constructor03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		IWriteArticleMgr mgr = factory.getBean("mgr", IWriteArticleMgr.class);
		
		mgr.write(new ArticleDTO());
		
		factory.close();
	}

}
