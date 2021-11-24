<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input{
		display: block;
		}
</style>

</head>
<body>
<h2>join2.jsp</h2>
<h2>회원가입</h2>
<form action="join2" method="post">
        <input type="text" name="id" placeholder="아이디를 입력하세요"><br>
        <input type="text" name="password" placeholder="비밀번호를 입력하세요"><br>
        <input type="text" name="name" placeholder="이름을 입력하세요"><br>
        <input type="radio" name="gender" value="male">남<br>
        <input type="radio" name="gender" value="female">여<br>
        <input type="email" name="email" placeholder="이메일 입력하세요"><br>
        <input type="submit" value="회원가입">
        
    </form>
</body>
</html>