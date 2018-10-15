<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/loginCss.css" />
        <script src="js/login.js" type="text/javascript"></script>
        <title>登录界面</title>
    </head>
    <body>
        <table width="90%" align="center">
  <tr>
    <td><div align="center">head.jsp</div></td>
  </tr>
  <tr>
    <td>
<div class="divAll"> 
   <div id="titles">用户登录</div> 
   <div id="contents">
   <hr width="95%" color="#f2f2f2"/> 
   <form action="loginServlet"  method="POST" onSubmit="return checkForm()"> 
    <div id="form-itemGroup"> 
      <label>用户名：</label> 
      <input type="text" name="userName" id="userName" class="userName" onBlur="checkUserName()" oninput="checkUserName()"> 
      <span class="default" id="nameErr"></span> 
    </div> 
    <div id="form-itemGroup"> 
      <label>密码：</label> 
      <input type="password"  name="userPasword" id="userPasword" class="userName" onBlur="checkPassword()" oninput="checkPassword()"> 
      <span class="default" id="passwordErr"></span> 
    </div> 
    <div> 
     <button type="submit" class="divBtn">登录</button> 
     <button type="reset" class="divBtn">清空</button> 
    </div> 
    <a href="register.jsp">还没有账号？点击注册</a>
   </form> 
   </div> 
 </div>
    </td>
  </tr>
  <tr>
    <td><div align="center">tail.jsp</div></td>
  </tr>
</table>
    </body>
</html>
