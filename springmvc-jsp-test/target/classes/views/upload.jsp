<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 50px auto; width: 300px;height:50px">
		<form action="uploadFile" enctype="multipart/form-data" method="post">
			<table>
				<tr>
					<td><input type="file" name="file"><br></td>
					<td><input type="submit" value="上传"></td>
				</tr>
			</table>
			
			
			
			
		</form>
	
	</div>
</body>
</html>