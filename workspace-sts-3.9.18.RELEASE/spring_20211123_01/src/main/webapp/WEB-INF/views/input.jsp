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
    <h2>요청 완료</h2>
    <!-- http://localhost:8081/ex/inputparam?param1=입력하세요. -->
    <!-- form태그의 action 속성: 목적지를 지정한다.(컨트롤러로 요청할 주소) -->
    <form action="inputparam" method="post">
        입력1: <input type="text" name="param1">
        입력1: <input type="text" name="param2">
        <input type="submit" value="전송">
    </form>
</body>
</html>









