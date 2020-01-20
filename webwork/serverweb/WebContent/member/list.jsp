<%@page import="member.MemberDTO"%>
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
			<th style='border: solid 1px'>id</th>
			<th style='border: solid 1px'>pass</th>
			<th style='border: solid 1px'>name</th>
			<th style='border: solid 1px'>addr</th>
			<th style='border: solid 1px'>deptno</th>
			<th style='border: solid 1px'>grade</th>
			<th style='border: solid 1px'>point</th>
			<th style='border: solid 1px'>기타</th>
		</tr>
		<%
			//서블릿이 공유해준 ArrayList<DeptDTO>객체 가져오기
			ArrayList<MemberDTO> list = (ArrayList<MemberDTO>)request.getAttribute("arrList");
			for (MemberDTO memberDTO : list) {
		%>
		<tr>
			<td style='border: solid 1px'><%= memberDTO.getId() %></td>
			<td style='border: solid 1px'><%= memberDTO.getPass() %></td>
			<td style='border: solid 1px'><%= memberDTO.getName() %></td>
			<td style='border: solid 1px'><%= memberDTO.getAddr() %></td>
			<td style='border: solid 1px'><a href="/serverweb/member/read.do?id=<%= memberDTO.getId()%>"><%= memberDTO.getDeptNo() %></a></td>
			<td style='border: solid 1px'><%= memberDTO.getGrade() %></td>
			<td style='border: solid 1px'><%= memberDTO.getPoint() %></td>
			<td style='border: solid 1px'><a href="/serverweb/member/delete.do?deptno=<%= memberDTO.getDeptNo()%>&info=test">삭제</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>