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
	<!--  파이썬 for문 
	for bDto in boardList:
		print("bDto.bnum")
		print("bDto.btitle")	
	-->		
	<c:forEach items="${boardList}" var="bDto"> 
		${bDto.bnum} / ${bDto.btitle} / ${bDto.bdate} <br>	
	</c:forEach>
	
</body>
</html>