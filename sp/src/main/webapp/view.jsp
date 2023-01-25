<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap/min.css" rel="stylesheet">
<!-- Optional theme -->
<link  rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap/min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>
function chkDelete(wr_uid){
	var r = confirm("삭제하시겠습니까?")
	
	if(r){
		location.href = "deleteOK.do/${board.wr_uid}";
	}
}
</script>
<title>view</title>
</head>
<body>
	<div class="container">
			<h2>${board.subject} }</h2>
			<table class="table table-boardered table table-hover">
				<tr>
					<td>번호</td>
					<td>${board.wr_uid}</td>
				</tr>
				
				<tr>
					<td>작성자</td>
					<td>${board.name}</td>
				</tr>
				
				<tr>
					<td>작성일</td>
					<td>${board.regdate}</td>
				</tr>
				
				<tr>
					<td>조회수</td>
					<td>${board.viewcnt}</td>
				</tr>
				<tr>
					<td colspan="2">내용</td>
					
				</tr>
				<tr>
					<td colspan="2">${board.content}</td>
				</tr>
				
				<tr>
					<td conspan="2" class="test-center">
						<button onclick="Location.href= 'update.do?wr_uid=${board.wr_uid}'">수정하기</button>
						<button onclick="location.href='list.do'">목록보기</button>
						<button onclick="chkDelete(${board.wr_uid})">삭제하기</button>
						<button onclick="location.href='write.do'">신규종목</button>
					
					</td>
				</tr>
			</table>
		</div>
	</body>
	</html>
	