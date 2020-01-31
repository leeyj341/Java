package dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//사용자정의 dao클래스
//DB연동과 관련된 bean을 만들 때 사용하는 annotation
@Repository
public class DeptDAOImpl {
	@Autowired
	JdbcTemplate myTemplate;
	
	public int count() {
		return myTemplate.queryForObject("select count(*) from dept", Integer.class);
	}
	public int insert(String deptno, String deptname) {
		String sql = "insert into dept(deptno, deptname) values(?, ?)";
		return myTemplate.update(sql, deptno, deptname);
	}
	public int update(String deptname, String deptno) {
		String sql = "update dept set deptname = ? where deptno = ?";
		return myTemplate.update(sql, deptname, deptno);
	}
	
	public List<DeptDTO> selectAll() {
		return myTemplate.query("select deptno, deptname from dept", new MyDeptRowMapper());
	}

}
