<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	private String name = "김경운";
	private String phone = "010-2623-8452";
	private String email = "rudd1242@naver.com";
	
	public void show() {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=name %></title>
</head>
<body>
	<% show(); %>
		<p><%=name %></p>
		<p><%=phone %></p>
		<p><%=email %></p>
	
	<h1>hello JSP</h1>
</body>
</html>