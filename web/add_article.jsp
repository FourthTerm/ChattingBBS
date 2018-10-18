<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="ueditor/ueditor.config.js" type="text/javascript"></script>
        <script src="ueditor/ueditor.all.js" type="text/javascript"></script>
        <script src="ueditor/lang/zh-cn/zh-cn.js" type="text/javascript"></script>
        <script src="ueditor/ueditor.parse.js" type="text/javascript"></script>
        <link href="ueditor/third-party/video-js/video-js.css" rel="stylesheet" type="text/css"/>
        <script src="ueditor/third-party/video-js/video.js" type="text/javascript"></script>
        <script src="http://api.html5media.info/1.1.4/html5media.min.js"></script>
        <link href="css/articleCss.css" rel="stylesheet" type="text/css"/>
        <script src="js/add_article.js" type="text/javascript"></script>
        <title>添加文章</title>
    </head>
    <body>
        <div class="divAll"> 
            <div id="titles">添加新文章</div> 
            <div id="contents"> 
                <hr width="95%" color="#f2f2f2"/> 
                <form action="add_articleServlet" >
                    <div id="form-itemGroup">
                        <label>标题：</label> 
                        <input type="text" name="title" id="title" class="title" onBlur="checkTitle()" oninput="checkTitle()"> 
                        <span class="default" id="titleErr"></span>
                    </div> 
                    <div id="form-itemGroup"> 
                        <label>内容：</label> 
                        <span class="default" id="contentErr"></span> 
                    </div>
                    <div id="form-content">
                        <script id="myeditor" name="content" type="text/plain" onBlur="checkContent()" oninput="checkContent()">这里写你的初始化内容</script>
                    </div>
                    <div> 
                        <input type="submit" name="Submit" class="divBtnSubmit" value="提交" onclick="return checkForm()"/>
                        <input type="reset" name="Submit2" class="divBtnReturn" value="返回" />
                    </div>
                </form> 
                <p>x</p>
                 <p>x</p>
                  <p>x</p>
                   <p>x</p>
                    <p>x</p>
            </div> 
        </div> 
        <script type="text/javascript">
            var ue = UE.getEditor('myeditor', {
                elementPathEnabled: false
            });
        </script>
    </body>
</html>