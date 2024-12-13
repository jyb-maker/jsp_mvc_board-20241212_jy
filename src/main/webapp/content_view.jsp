<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h2>글 내용 보기</h2>
	<hr>
	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th>제목</th>
			<td>${boardDto.btitle}</td>		
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardDto.bhit}</td>		
		</tr>				
		<tr>
			<th>작성자</th>
			<td>${boardDto.bname}</td>	
		</tr>		
		<tr height="250" valign="top">
			<th>내용</th>
			<td>${boardDto.bcontent}</td>	
		</tr>	
		<tr>
			<th>등록일</th>
			<td>${boardDto.bdate}</td>	
		</tr>	
	</table>

</body>
</html>