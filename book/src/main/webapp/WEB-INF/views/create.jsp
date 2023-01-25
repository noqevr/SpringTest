<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<html>
 <head>
  <title>책 생성하기</title>
 </head>
 <body>
  <h1>책 생성하기</h1>
  <form action="create" method="post">
   <p>제목 : <input type="text" name="title" /></p>
   <p>카테고리 : <input type="text" name="category" /></p>
   <p>가격 : <input type="text" name="price" /></p>
   
   <p><input type="submit" value="저장"/>
   
    <p><input type="submit" value="test저장" onclick="location.href='detail.jsp'"/>
   <a href="detail">목록으로</a>
  </form>
 </body>
</html>