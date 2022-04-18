<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
<link rel="stylesheet" href="/JspStudy_8452/static/css/style.css">
<link rel="stylesheet" href="/JspStudy_8452/static/css/file-upload.css">
</head>
<body>
	<div id="container">
		<form action="/JspStudy_8452/file-upload" enctype="multipart/form-data" method="post">
			<table>
				<tr>
					<td>미리보기</td>
				</tr>
				<tr>
					<td class="preview-img"></td>
				</tr>
				<tr>
					<td>파일 업로드</td>
				</tr>
				<tr>
					<td><input type="file" class="file-upload" multiple="multiple" name="file">
					</td>
				</tr>
			</table>
			<button>이미지 업로드</button>
		</form>
		<a download href="/JspStudy_8452/static/fileupload/a979cc6948584d3191b234231cef7d37_Air_980180.jpg">이미지 다운로드</a>
		<img alt="" src="/JspStudy_8452/static/fileupload/a979cc6948584d3191b234231cef7d37_Air_980180.jpg">
	</div>
	<script type="text/javascript" src="/JspStudy_8452/static/js/file.js"></script>
</body>
</html>