<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.js"></script>

<script type="text/javascript">
 $(document).ready(function(){
	 var max = 30000;
	 for(var i = 0; i < max; i++){
		 $.post({
			 url:"grapRedPacket?redPacketId=1&userId=" + i,
			 success:function(result){
				 //alert(result);
			 },
			 error:function(result){
				 //alert(result);
			 }
		 });
	 }
 });
</script>
</head>
<body>
<h1>New</h1>
</body>
</html>