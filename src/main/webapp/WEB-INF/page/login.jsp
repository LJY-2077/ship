<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.7.2.min.js"></script>
<title>登录页</title>
</head>
<body>
${pageContext.request.contextPath }
<form action="${pageContext.request.contextPath }/adminLogin"  method="post">
 <input name="name" type="text" ><br>
<input type="text" name="password"><br>
<input type="submit" value="提交">

</form>


</body>
</html>