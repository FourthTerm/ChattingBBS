function checkForm(){ 
  var nametip = checkUserName();
  var passtip = checkPassword();  
  return nametip && passtip; 
  } 
  //验证用户名   
  function checkUserName(){ 
  var username = document.getElementById('userName'); 
  var errname = document.getElementById('nameErr'); 
  if(username.value.length == 0){ 
    errname.innerHTML="请输入用户名";
    errname.className="error";
    return false; 
    }else{ 
     errname.innerHTML="";
     return true; 
     } 
  } 
  //验证密码   
function checkPassword(){ 
  var userpasswd = document.getElementById('userPasword'); 
  var errPasswd = document.getElementById('passwordErr'); 
  if(userpasswd.value.length == 0){ 
    errPasswd.innerHTML="请输入密码";
    errPasswd.className="error";
    return false; 
    }else{ 
     errPasswd.innerHTML="";
     return true; 
     } 
  }  
