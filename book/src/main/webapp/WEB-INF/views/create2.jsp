<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<html>
 <head>
  <title>책 생성하기</title>
 </head>
 <body>
  <h1>입력된책</h1>
  <%
  		String title = request.getParameter("title");
 		String category = request.getParameter("category");
 		String price = request.getParameter("price");
  	%>
  	
  	
  	<h1><%=title+category+price %></h1>
 </body>
</html>