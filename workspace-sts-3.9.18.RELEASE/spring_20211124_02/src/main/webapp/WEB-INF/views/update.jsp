<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<title>update title here</title>
<form action="update" method="post">
        
        번호: <input type="text" name="t_number"value="${trainee.t_number}" readonly><br>
        이름: <input type="text" name="t_name"value="${trainee.t_name}"readonly><br>
        나이: <input type="text" name="t_age"value="${trainee.t_age}"readonly><br>
        전화번호 :<input type="text" name="t_phone"value="${trainee.t_phone}"><br>
        주소: <input type="text" name="t_assress"value="${trainee.t_assress}"><br>
        <input type="submit" value="수정">
        
    </form>
</body>
</html>