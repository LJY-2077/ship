<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	String path = request.getContextPath();
	// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量 
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。 
	pageContext.setAttribute("basePath", basePath);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="<%=path%>/statice/js/jquery-1.7.2.min.js"></script>
<title>登录页</title>
<script type="text/javascript">
	function ajaxSub() {
		$.ajax({
			type : 'POST',
			url : "${pageContext.request.contextPath }/userLogin",
			dataType : "json",
			data : {
				"name" : $("#name").val(),
				"password" : $("#pwd").val()
			},
			success : function(data) {
				alert(data);
			location.href="${pageContext.request.contextPath }/index"
			},

		});
	}
</script>

</head>
<body>
	${pageContext.request.contextPath }
	<form action="${pageContext.request.contextPath }/adminLogin"
		method="post">
		<input id="name" name="name" type="text"><br> <input
			id="pwd" type="text" name="password"><br> <input
			type="submit" value="提交">

	</form>


	<button id="btn" onclick="ajaxSub()" value="sub">sub</button>
</body>
</html>