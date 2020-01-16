package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		pw.print("<table style='border-collapse: collapse; border: solid 1px'>");
		pw.print("<tr>");
		pw.print("<th style='border: solid 1px'>deptno</th>");
		pw.print("<th style='border: solid 1px'>deptname</th>");
		pw.print("<th style='border: solid 1px'>loc</th>");
		pw.print("<th style='border: solid 1px'>tel</th>");
		pw.print("<th style='border: solid 1px'>mgr</th>");
		pw.print("<th style='border: solid 1px'>mgr</th>");
		pw.print("</tr>");
		
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> list = dao.getDeptList();
		
		for (DeptDTO deptDTO : list) {
			pw.print("<tr>");
			pw.print("<td style='border: solid 1px'>" + deptDTO.getDeptNo() + "</td>");
			pw.print("<td style='border: solid 1px'>" + deptDTO.getDeptName() + "</td>");
			pw.print("<td style='border: solid 1px'>" + deptDTO.getLoc() + "</td>");
			pw.print("<td style='border: solid 1px'>" + deptDTO.getTel() + "</td>");
			pw.print("<td style='border: solid 1px'>" + deptDTO.getMgr() + "</td>");
			pw.print("<td style='border: solid 1px'><a href='/serverweb/dept/delete.do?deptno=" + deptDTO.getDeptNo() + "&info=test'>ªË¡¶</a></td>");
			pw.print("</tr>");
		}
		pw.print("</table>");
	}

}
