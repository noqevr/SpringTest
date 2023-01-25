<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap/min.css" rel="stylesheet">
<!-- Optional theme -->
<link  rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap/min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">Board</h2>
		<table class="table table-boardered table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>등록일</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="board" items="${list}">
					<tr>${board.wr_uid }
					<td>
						<a href="view.do?wr_uid=${board.wr_uid}">${board.subject}</a>
						
					</td>
					
					<td>${board.name}</td>
					<td>${board.viewcnt}</td>
					<td>${board.regdate}</td>
					</tr>
				</c:forEach>
				
				<tr>
					<td colspan="5" class="text_center">
						<button onclick="location.href='write.do'">신규등록</button>
					</td>
				</tr>
			</tbody>
		</table>
		
	</div>
</body>
</html>
