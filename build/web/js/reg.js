/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function checkForm(){ 
  var nametip = checkUserName(); 
  var passtip = checkPassword();  
  var conpasstip = ConfirmPassword(); 
  var emailtip = checkEmail(); 
  return nametip && passtip && conpasstip && emailtip; 
  } 
  //验证用户名   
  function checkUserName(){ 
  var username = document.getElementById('userName'); 
  var errname = document.getElementById('nameErr'); 
  var pattern = /^\w{3,}$/;  //用户名格式正则表达式：用户名要至少三位 
  if(username.value.length == 0){ 
    errname.innerHTML="用户名不能为空";
    errname.className="error";
    return false; 
    } 
  if(!pattern.test(username.value)){ 
    errname.innerHTML="用户名不合规范";
    errname.className="error";
    return false; 
    } 
   else{ 
     errname.innerHTML="√";
     errname.className="success"; 
     return true; 
     } 
  } 
  //验证密码   
function checkPassword(){ 
  var userpasswd = document.getElementById('userPasword'); 
  var errPasswd = document.getElementById('passwordErr'); 
  var pattern = /^\w{4,8}$/; //密码要在4-8位 
  if(!pattern.test(userpasswd.value)){ 
    errPasswd.innerHTML="密码不合规范";
    errPasswd.className="error";
    return false; 
    } 
   else{ 
     errPasswd.innerHTML="√";
     errPasswd.className="success"; 
     return true; 
     } 
  } 
  //确认密码 
  function ConfirmPassword(){ 
  var userpasswd = document.getElementById('userPasword'); 
  var userConPassword = document.getElementById('userConfirmPasword'); 
  var errConPasswd = document.getElementById('conPasswordErr'); 
  if((userpasswd.value)!=(userConPassword.value) || userConPassword.value.length == 0){ 
    errConPasswd.innerHTML="两次密码不一致";
    errConPasswd.className="error";
    return false; 
    } 
   else{ 
     errConPasswd.innerHTML="√";
     errConPasswd.className="success"; 
     return true; 
     }    
  } 
//验证邮箱 
  function checkEmail(){ 
  var email = document.getElementById('email'); 
  var emailErr = document.getElementById('emailErr'); 
  var pattern = /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/; //验证手机号正则表达式 
  if(!pattern.test(email.value)){ 
    emailErr.innerHTML="邮箱不合规范";
    emailErr.className="error";
    return false; 
    } 
   else{ 
     emailErr.innerHTML="√";
     emailErr.className="success"; 
     return true; 
     } 
  } 
