<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input{
displat: block;
}
</style>
</head>
<body>
<p>login jsp</p>
<form action="login" method="post">
        <input type="text" name="id" placeholder="아이디를 입력하세요"><br>
        <input type="text" name="password" placeholder="비밀번호를 입력하세요"><br>
        <input type="submit" value="로그인">
    </form>
</body>
</html>