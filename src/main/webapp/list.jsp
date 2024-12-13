<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 글 목록 보기</title>
</head>
<body>
	<h2>게시판 전체 글 보기</h2>
	<hr>
	<!-- 
	for bDto in boardList:
		print(bDto.bnum)
		print(bDto.btitle)
	 --> 
	<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>	
		<c:forEach items="${boardList}" var="bDto">
		<tr>
			<td>${bDto.bnum}</td>
			<td>${bDto.btitle }</td>
			<td>${bDto.bname }</td>
			<td>${bDto.bdate }</td>
			<td>${bDto.bhit }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="right">
				<input type="button" value="글쓰기" onclick="location.href='write_form.do'">
			</td>
		</tr>
	</table> 
	
	
</body>
</html>