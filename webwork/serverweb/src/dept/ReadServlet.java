package dept;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptRead", urlPatterns = { "/dept/read.do" })
public class ReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr"); //POST��Ŀ����� ����
		response.setContentType("text/html;charset=euc-kr");
		
		// ��û��������
		//	- Ŭ���̾�Ʈ�� ���� ���±׿� �Է��� ������ �ʿ信 ���ؼ� �ѱ� �Ķ���� ����
		//	- �⺻������ ��� POST��Ŀ����� ����, get����� ��� �����Ϸ��� server.xml�� ������ �����Ѵ�.
		String info = request.getParameter("Info");
		String deptNo = request.getParameter("deptno");
		System.out.println("�ѱ� ���� ����: " + info);
		
		// �����Ͻ� �޼��� ȣ��
		//	- DeptDAO Ŭ������ �޼��� �߰��ϰ� ȣ���ϱ�
		DeptDAO dao = new DeptDAO();
		DeptDTO dto =  dao.read(deptNo);
		
		// jsp�� �Ѱ� �� ������ �����ϱ�
		request.setAttribute("dto", dto);
		
		// ��û������(forward) - ������ jsp ��û�ϱ�
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
		
	}

}
