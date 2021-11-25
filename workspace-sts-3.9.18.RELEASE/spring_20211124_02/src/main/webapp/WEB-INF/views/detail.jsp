<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- JSTL(JSP Standard Tag Library사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<h2>detail.jsp</h2>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="table table-dark">
<tr>
<th>번호</th>
<th>이름</th>
<th>나이</th>
<th>전화번호</th>
<th>성별</th>
<th>생년월일</th>
<th>주소</th>
</tr>
	<tr>
	<td>${trainee.t_number}</td>
	<td>${trainee.t_name}</td>
	<td>${trainee.t_age}</td>
	<td>${trainee.t_phone}</td>
	<td>${trainee.t_gender}</td>
	<td>${trainee.t_birth}</td>
	<td>${trainee.t_assress}</td>
	<!-- detail이라는 주소로 t_number 파라미터를 전달함
			링크로 서버에 데이터 전송
			서버에서 t_number를 받아서 sysout으로 출력해보자 -->
	</tr>
	</table>

</body>
</html>