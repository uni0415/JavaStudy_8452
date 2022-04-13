<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="student.Student" %>

<%
	Student student1 = Student.builder()
		.schoolName(request.getParameter("schoolName"))
		.name(request.getParameter("name"))
		.studentYear(Integer.parseInt(request.getParameter("studentYear")))
		.department(request.getParameter("department"))
		.grade(request.getParameter("grade"))
		.build();

	request.setAttribute("student1", student1);
%>
	<jsp:forward page="../view/show.jsp"></jsp:forward>
