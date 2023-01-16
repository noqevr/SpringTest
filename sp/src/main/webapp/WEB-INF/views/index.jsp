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

/* ����κ� */
.header {
  background-color: #f1f1f1;
  padding: 0px;
  text-align: center;
  font-size: 15px;
   height: 100px; 
}

/* ��� ũ�� ����*/
.column {
  float: left;
  padding: 10px;
  height: 400px; 
}

/* �� �� ���̵� ����*/
.column.side {
  width: 25%;
}

.column.right {
  width: 25%;
}

/* ��� ����*/
.column.middle {
  width: 50%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Ǫ�� */
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

<h2>test ������</h2>
<p>.</p>
<p></p>

<div class="header">
  <h3>Header</h3>
  <ul >
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">ȸ��Ұ�</a>
    <div class="dropdown-content">
      <a href="#">ȸ�簳��</a>
      <a href="#">ceo�λ縻</a>
      <a href="#">ȸ�翬��</a>
      <a href="#">���ô±�</a>
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">�ַ��</a>
    <div class="dropdown-content">
      <a href="#">���ڹ����ַ��</a>
      <a href="#">����</a>
      <a href="#">���ž���</a>
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">�¶��ι���</a>
    <div class="dropdown-content">
      <a href="#">�¶��� ����</a>
      
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">ä������</a>
    <div class="dropdown-content">
      <a href="#">ä������</a>
     
    </div>
  </li>
</ul>
</div>

<div class="row">
  <div class="column side" style="background-color:#aaa;">����</div>
  <div class="column middle" style="background-color:#bbb;">
  	<p>�ȳ��ϼ���</p>
  	<p>�ȳ��ϼ���</p>
  	<p>�ȳ��ϼ���</p>
  	<p>�ȳ��ϼ���</p>
  	<p>�ȳ��ϼ���</p>
  	<p>�ȳ��ϼ���</p>
  	<p>${path}</p>
  </div>
  <div class="column right" style="background-color:#ccc;">������</div>
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