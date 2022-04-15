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
			<form action="/JspStudy_8452/profile/update" method ="post">
				<table>
					<tr>
						<td>사용자이름</td>
						<td><input type="text" readonly="readonly"
							value="<%=principalUser.getUsername()%>"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" class="profile-input" name="name" value="<%=principalUser.getName()%>"></td>
					</tr>
					<tr>
						<td>이메일</td>
						<td><input type="text" class="profile-input" name="email" value="<%=principalUser.getEmail()%>"></td>
					</tr>
				</table>
				<div>
					<button type="button" class="update-submit-btn">수정하기</button>
					<button type="button" class="password-update-btn">비밀번호 변경</button>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript" charset="UTF-8" src="/JspStudy_8452/static/js/profile_update.js"></script>
</body>
</html>