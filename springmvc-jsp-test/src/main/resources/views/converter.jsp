<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script >
	function req(){
		$.ajax({
			url:"convert",
			data:"1-wangyunfei",
			type:"post",
			contentType:"application/x-wisely",
			success:function(data){
				$("#resp").val(data);
			}
		});
	
	}

</script>
</head>
<body>
	<input type="button" value="请求" onclick="req()"/><br>
	响应：<input type="text" id="resp"/>
</body>
</html>