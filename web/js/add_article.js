    function checkForm(){
        var title= checkTitle();
        var content=checkContent();
        return title && content;
     }
     function checkTitle(){
         var title = document.getElementById('title');
         var titleErr = document.getElementById('titleErr'); 
         if(title.value.length==0){ 
            titleErr.innerHTML="请输入标题";
            titleErr.className="error";
            return false; 
             }
             else{ 
            titleErr.innerHTML="";
            return true;
            } 
     }
     function checkContent(){
         var test=init(); 
         var contentErr = document.getElementById('contentErr'); 
         if(test.getContent()==""){
            contentErr.innerHTML="请输入内容";
            contentErr.className="error";
            return false; 
             }else{ 
            contentErr.innerHTML="";
            return true;
        }
     }
        function init(){
        var ue = UE.getEditor('myeditor');
        return ue;
        }