<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>fineAll.jsp</h2>

<table class="table table-dark">
<tr>
<th>번호</th>
<th>아이디</th>
<th>비번</th>
<th>이름</th>
<th>이메일</th>
<th>전화번호</th>
<th>상세조회</th>
<th>삭제</th>
<th>수정</th>
</tr>

<c:forEach items="${memberList}" var="m">
	<tr>
	<td>${m.m_number}</td>
	<td>${m.m_id}</td>
	<td>${m.m_pw}</td>
	<td>${m.m_name}</td>
	<td>${m.m_email}</td>
	<td>${m.m_phone}</td>
	<!-- detail 이라는 주소요청을 통해 회원 상세조회를 해봅시다. 상세조회 데이터는 detail.jsp에 출력합니다. -->
	<td><a href="detail?m_number=${m.m_number}">조회</a></td>
	<td>삭제</td>
	<td>수정</td>
	</tr>
</c:forEach>
</body>
</html>