<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>insert.jsp</h2>
<h2>훈련생 정보 등록</h2>
<form action="insert" method="post">
        
        <input type="text" name="t_name" placeholder="이름을 입력하세요"><br>
        <input type="text" name="t_age" placeholder="나이입력"><br>
        <input type="text" name="t_phone" placeholder="저나번호 입력하세요"><br>
       <select name="gender">
       <option value="male">남</option>
       <option value="female">여</option>
       </select>
        <input type="date" name="t_birth"><br>
        <input type="text" name="t_assress" placeholder="사는곳을 입력하세요"><br>
        <input type="submit" value="회원가입">
        
    </form>

</body>
</html>