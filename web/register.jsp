<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/regCss.css" />
        <script src="js/reg.js" type="text/javascript"></script>
        <title>注册界面</title>
    </head>
    <body>
        <table width="90%" align="center">
  <tr>
    <td><div align="center">head.jsp</div></td>
  </tr>
  <tr>
    <td>
<div class="divAll"> 
   <div id="titles">新用户注册</div> 
   <div id="contents"> 
   <h3>基本信息</h3> 
   <hr width="95%" color="#f2f2f2"/> 
   <form action="regServlet" onSubmit="return checkForm()"> 
    <div id="form-itemGroup"> 
      <label>用户名：</label> 
      <input type="text" name="userName" id="userName" class="userName" onBlur="checkUserName()" oninput="checkUserName()"> 
      <span class="default" id="nameErr">请输入至少3位的用户名</span> 
    </div> 
    <div id="form-itemGroup"> 
      <label>密码：</label> 
      <input type="password"  name="userPasword" id="userPasword" class="userName" onBlur="checkPassword()" oninput="checkPassword()"> 
      <span class="default" id="passwordErr">请输入4到8位的密码</span> 
    </div> 
    <div id="form-itemGroup"> 
      <label>确认密码：</label> 
      <input type="password"  name="userConfirmPasword" id="userConfirmPasword" class="userName" onBlur="ConfirmPassword()" oninput="ConfirmPassword()"> 
      <span class="default" id="conPasswordErr">请再输入一遍密码</span> 
    </div> 
   <div id="form-itemGroup"> 
      <label>邮箱：</label> 
      <input type="text" name="email" id="email" class="userName" onBlur="checkEmail()" oninput="checkEmail()"> 
      <span class="default" id="emailErr">请输入有效邮箱</span> 
    </div> 
    <div> 
     <button type="submit" class="divBtn">注册</button> 
     <button type="reset" class="divBtn">重置</button> 
    </div> 
   </form> 
   <a href="login.jsp">已有账号？点击登录</a>
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