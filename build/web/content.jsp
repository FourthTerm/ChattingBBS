<%@page import="com.blog.model.Article"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
 Article article = (Article)request.getAttribute("article"); 
int aid = 0;
if(request.getAttribute("aid")!=null)
    {
String s = request.getAttribute("aid").toString();   
aid = Integer.parseInt(s);
	}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="ueditor/ueditor.config.js" type="text/javascript"></script>
        <script src="ueditor/ueditor.all.js" type="text/javascript"></script>
        <script src="ueditor/ueditor.parse.js" type="text/javascript"></script>
        
        <link href="ueditor/third-party/video-js/video-js.css" rel="stylesheet" type="text/css"/>
        <script src="ueditor/third-party/video-js/video.js" type="text/javascript"></script>
        <script src="http://api.html5media.info/1.1.4/html5media.min.js"></script>
        <link href="css/contentCss.css" rel="stylesheet" type="text/css"/>
        <title></title>
    </head>
    <body>
        <div class="divAll">
            <div id="titles"><%=article.getTitle()%></div>
            <div id="contents">
                <div style="padding-left: 20px"><%=article.getContent()%></div>
                <div style="padding-left: 20px"><%=article.getUsername()%> by <%=article.getDate()%></div>
            </div>
            <div id="contents"> 
   <form action="" >
    <div id="form-itemGroup">
      <label>评论：</label>
    </div>
       <div id="form-content">
            <script style="width:500px" id="myeditor" name="content" type="text/plain" onBlur="()" oninput="()">这里写你的初始化内容</script>
       </div>
       <div> 
            <input type="submit" name="Submit" class="divBtnSubmit" value="提交" onclick="return ()"/>
            <input type="reset" name="Submit2" class="divBtnReturn" value="返回" />
        </div>
       </form> 
    </div> 
        </div>
            <script type="text/javascript">
        var ue = UE.getEditor('myeditor',{
             toolbars:[[
            '|', 'undo', 'redo', '|',
            'emotion','bold', 'italic', 'underline', 'fontborder', 'strikethrough', 'superscript', 'subscript', 'removeformat', 'blockquote', '|', 
            'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist', 'selectall', 'cleardoc', '|',
            'rowspacingtop', 'rowspacingbottom', 'lineheight', '|',
            'directionalityltr', 'directionalityrtl', 'indent', '|',
            'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', '|',
            'link', 'unlink', 'anchor', '|','print', 'preview', 'searchreplace', 'drafts', 'help'
        ]],
             elementPathEnabled : false,
        });
    </script>
    </body>
</html>
