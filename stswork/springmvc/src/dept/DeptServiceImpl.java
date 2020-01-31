package dept;
//dao의 메서드를 호출하는 클래스

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deptService")
public class DeptServiceImpl {
	@Autowired
	DeptDAOImpl dao;
	
	public int count() {
		return dao.count();
	}
	
	public int insert(String deptno, String deptname) {
		return dao.insert(deptno, deptname);
	}
	
	public int update(String deptname, String deptno) {
		return dao.update(deptname, deptno);
	}
	public List<DeptDTO> selectAll() {
		return dao.selectAll();
	}
}
