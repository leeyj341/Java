package dept;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/erp.xml");
		
		DeptServiceImpl service = factory.getBean("deptService", DeptServiceImpl.class);
		System.out.println("전체 부서 개수: " + service.count());
		//System.out.println("삽입 성공 ? " + service.insert("exam01", "framework"));
		//System.out.println("수정 성공 ? " + service.update("부서", "exam01"));
		List<DeptDTO> list = service.selectAll();
		for (DeptDTO dto : list) {
			System.out.println(dto.getDeptno() + " : " + dto.getDeptname());
		}
		
		factory.close();
	}

}
