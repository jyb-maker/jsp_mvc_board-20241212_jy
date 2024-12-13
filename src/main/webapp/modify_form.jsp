<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글수정</title>
</head>
<body>
	<h2>게시판 글수정</h2>
	<hr>
	<form action="modify.do" method="post">
		<input type="hidden" name="bnum" value="${boardDto.bnum }">
		제목 : <input type="text" name="btitle" size="60" value="${boardDto.btitle}"><br><br>
		이름 : <input type="text" name="bname" size="30" value="${boardDto.bname}"><br><br>
		내용 : <textarea rows="10" cols="50" name="bcontent">${boardDto.bcontent}</textarea><br><br>
		<input type="submit" value="수정완료">
		<input type="button" value="취소" onclick="location.href='list.do'">
	</form>
</body>
</html>