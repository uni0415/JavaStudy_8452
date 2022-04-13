<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<td>이전 비밀번호 확인</td>
						<td><input type="password" readonly="readonly"></td>
					</tr>
					<tr>
						<td>새 비밀번호</td>
						<td><input type="password"></td>
					</tr>
					<tr>
						<td>새 비밀번호 확인</td>
						<td><input type="password"></td>
					</tr>
				</table>
				<div>
					<button>비밀번호 변경하기</button>
					<button>회원 정보 수정</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>