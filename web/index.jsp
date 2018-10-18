<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
   <frameset  rows="64,*" frameborder="NO" border="0" framespacing="0">
    <frame src="head.jsp" noresize="noresize" frameborder="NO" name="topFrame" scrolling="no" marginwidth="0" marginheight="0" target="main">
    <frameset cols="200,*" rows="560,*" id="frame">
	<frame src="left.jsp" name="leftFrame" noresize="noresize" marginwidth="0" marginheight="0" frameborder="0" scrolling="yes" target="main">
	<frame src="middle.jsp" name="main" marginwidth="0" marginheight="0" frameborder="0" scrolling="auto" target="_self">
    </frameset>
<noframes>
    </noframes>
</frameset>
</html>