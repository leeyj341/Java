<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����ȭ�� �и�</h1>
	<hr/>
	<%
		int result = (Integer)request.getAttribute("result");
	%>
	<h2><%=result %>���� �� ���� ����!!</h2>
</body>
</html>