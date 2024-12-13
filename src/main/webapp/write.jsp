<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<hr>
	<form action="write.do" method="post">
		제목 : <input type="text" name="btitle" size="60"><br><br>
		이름 : <input type="text" name="bname" size="30"><br><br>
		내용 : <textarea rows="10" cols = "50" name="bcontent" size="30"></textarea> <br><br>
		<input type= "submit" value="글쓰기">
		
	</form>

</body>
</html>