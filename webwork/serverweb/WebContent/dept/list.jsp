<%@page import="dept.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table style="border-collapse: collapse; border: solid 1px">
		<tr>
			<th style='border: solid 1px'>deptno</th>
			<th style='border: solid 1px'>deptname</th>
			<th style='border: solid 1px'>loc</th>
			<th style='border: solid 1px'>tel</th>
			<th style='border: solid 1px'>mgr</th>
			<th style='border: solid 1px'>��Ÿ</th>
		</tr>
		<%
			//������ �������� ArrayList<DeptDTO>��ü ��������
			ArrayList<DeptDTO> list = (ArrayList<DeptDTO>)request.getAttribute("arrList");
			for (DeptDTO deptDTO : list) {
		%>
		<tr>
			<td style='border: solid 1px'><%= deptDTO.getDeptNo() %></td>
			<td style='border: solid 1px'><a href="/serverweb/dept/read.do?deptno=<%= deptDTO.getDeptNo()%>&Info=�ѱ۵�����"><%= deptDTO.getDeptName() %></a></td>
			<td style='border: solid 1px'><%= deptDTO.getLoc() %></td>
			<td style='border: solid 1px'><%= deptDTO.getTel() %></td>
			<td style='border: solid 1px'><%= deptDTO.getMgr() %></td>
			<td style='border: solid 1px'><a href="/serverweb/dept/delete.do?deptno=<%= deptDTO.getDeptNo()%>&info=test">����</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>