<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
	요청주소: /signin
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#container {
		margin: 0 auto;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		
		width: 500px;
		height: 700px;
	}
	
	.item-input {
		display: flex;
		flex-direction: column;
		width: 200px;
		height: 60px;
	}
	
	.login-btn, .signup-btn {
		
		width: 90px;
		border-radius: 3px;
		border: 1px solid;
	}
	
	.login-btn {
		margin-right: 15px;
	}
	
</style>
</head>
<body>
	<div id="container">
		<div>
			<h1>로그인</h1>
		</div>
		<form action="/JspStudy_8452/auth/signin" method="post">
			<div>
				<div class="item-input">
					<label class="item-label">사용자이름</label> 
					<input type="text" name="username">
				</div>
				<div class="item-input">
					<label class="item-label">비밀번호</label> 
					<input type="password" name="password">
				</div>
			</div>
			<button type="submit" class="login-btn">로그인</button>
			<button type="button" class="signup-btn">회원가입</button>
		</form>
	</div>
	<script type="text/javascript">
		const signup_btn = document.querySelector(".signup-btn");
		signup_btn.onclick = () => {
			location.href="/JspStudy_8452/auth/signup";
		}
	</script>
</body>
</html>