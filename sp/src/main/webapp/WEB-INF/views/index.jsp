<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
  
 
}

li {
  float: left;
}

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
  
 
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: #f1f1f1;
  color:black;
  
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: #f1f1f1;
  
  
}

li.dropdown {
  display: inline-block;
  
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
background-color: #333;
  color: white;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: center;
}

.dropdown-content a:hover {background-color: black;
color:white;}

.dropdown:hover .dropdown-content {
  display: block;
}


/*///////////////////////////////////////////*/

* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* 헤더부분 */
.header {
  background-color: #f1f1f1;
  padding: 0px;
  text-align: center;
  font-size: 15px;
   height: 100px; 
}

/* 요소 크기 설정*/
.column {
  float: left;
  padding: 10px;
  height: 400px; 
}

/* 양 옆 사이드 넓이*/
.column.side {
  width: 25%;
}

.column.right {
  width: 25%;
}

/* 가운데 넓이*/
.column.middle {
  width: 50%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* 푸터 */
.footer {
  background-color: #f1f1f1;
  padding: 30px;
  text-align: center;
}

/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media (max-width: 600px) {
  .column.side, .column.middle {
    width: 100%;
  }
}
</style>
</head>
<body>

<h2>test 페이지</h2>
<p>.</p>
<p></p>

<div class="header">
  <h3>Header</h3>
  <ul >
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">회사소개</a>
    <div class="dropdown-content">
      <a href="#">회사개요</a>
      <a href="#">ceo인사말</a>
      <a href="#">회사연혁</a>
      <a href="#">오시는길</a>
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">솔루션</a>
    <div class="dropdown-content">
      <a href="#">전자문서솔루션</a>
      <a href="#">증명서</a>
      <a href="#">여신약정</a>
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">온라인문의</a>
    <div class="dropdown-content">
      <a href="#">온라인 문의</a>
      
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">채용정보</a>
    <div class="dropdown-content">
      <a href="#">채용정보</a>
     
    </div>
  </li>
</ul>
</div>

<div class="row">
  <div class="column side" style="background-color:#aaa;">왼쪽</div>
  <div class="column middle" style="background-color:#bbb;">
  	<p>안녕하세요</p>
  	<p>안녕하세요</p>
  	<p>안녕하세요</p>
  	<p>안녕하세요</p>
  	<p>안녕하세요</p>
  	<p>안녕하세요</p>
  	<p>${path}</p>
  </div>
  <div class="column right" style="background-color:#ccc;">오른쪽</div>
</div>

<div class="footer">
  <p>Footer</p>
</div>

<div onmouseover="mOver(this)" onmouseout="mOut(this)" 
style="background-color:#D94A38;width:120px;height:20px;padding:40px;">
Mouse Over Me</div>

<script>
function mOver(obj) {
  obj.innerHTML = "Thank You"
}

function mOut(obj) {
  obj.innerHTML = "Mouse Over Me"
}
</script>



<button onclick="alert('Hello\nHow are you?')">Try it</button>

</body>
</html>