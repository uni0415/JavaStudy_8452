<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ page import="student.Student" %>
</head>
<body>
<%
	Student student1 = (Student)request.getAttribute("student1");
%>

	학교명: <%= student1.getSchoolName()%><br>
	학생이름: <%=student1.getName() %><br>
	학년: <%=student1.getStudentYear() %><br>
	학과: <%=student1.getDepartment() %><br>
	학점:  <%=student1.getGrade() %><br>
</body>
</html>