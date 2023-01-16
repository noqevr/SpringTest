<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
 <meta charset="UTF-8"> 
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a class="magin" href = "http://localhost:8080/project/test/test"><input type = "button" value = "경로test"><a>
<a class="magin" href = "test/test"><input type = "button" value = "test 값"><a>
<a class="magin" href = "index"><input type = "button" value = "test페이지"><a>
<a class="magin" href = "section"><input type = "button" value = "회전목마"><a>
</body>
</html>
