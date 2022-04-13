<%@page import="repository.user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
User principalUser = (User) session.getAttribute("principal");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<link rel="stylesheet" href="/JspStudy_8452/static/css/style.css">
<link rel="stylesheet" href="/JspStudy_8452/static/css/mypage.css">

</head>
<body>
	<div id="container">
		<div class="mypage-items">
			<form action="">
				<table>
					<tr>
						<td>사용자이름</td>
						<td><input type="text" readonly="readonly"
							value="<%=principalUser.getUsername()%>"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" value="<%=principalUser.getName()%>"></td>
					</tr>
					<tr>
						<td>이메일</td>
						<td><input type="text" value="<%=principalUser.getEmail()%>"></td>
					</tr>
				</table>
				<div>
					<button type="button" class="profile-update-btn">회원 수정</button>
					<button type="button" class="password-update-btn">비밀번호 변경</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>