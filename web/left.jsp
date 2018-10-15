<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="css/adminCSS.css" rel="stylesheet" type="text/css"/>
<script src="js/prototype.lite.js" type="text/javascript"></script>
<script src="js/moo.fx.js" type="text/javascript"></script>
<script src="js/moo.fx.pack.js" type="text/javascript"></script>
</head>

<body>
<table width="100%" height="280" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="182" valign="top"><div id="container">
      <h1 class="type"><a href="javascript:void(0)">日志管理</a></h1>
      <div class="content">
        <ul class="MM">
          <li><a href="article.jsp" target="main">查看日志</a></li>
          <li><a href="add_article.jsp" target="main">发表日志</a></li>
          <li><a href="delete_article.jsp" target="main">删除日志</a></li>
        </ul>
      </div>
      <h1 class="type"><a href="javascript:void(0)">相册管理</a></h1>
      <div class="content">
        <ul class="MM">
          <li><a href="imageupload.jsp" target="main">添加照片</a></li>
          <li><a href="photoshow.jsp" target="main">查看照片</a></li>
          <li><a href="delete_photo.jsp" target="main">删除照片</a></li>
        </ul>
      </div>
      <h1 class="type"><a href="javascript:void(0)">视频管理</a></h1>
      <div class="content">
        <ul class="MM">
          <li><a href="admin_video.jsp" target="main">查看视频</a></li>
          <li><a href="admin_delete_video.jsp" target="main">删除视频</a></li>
          <li><a href="video_upload.jsp" target="main">添加视频</a></li>   
        </ul>
      </div>
        <h1 class="type"><a href="javascript:void(0)">音乐管理</a></h1>
      <div class="content">
        <ul class="MM">
            <li><a href="musicupload.jsp" target="main">添加音乐</a></li>
            <li><a href="admin_music.jsp" target="main">播放音乐</a></li>
          <li><a href="delete_music.jsp" target="main">删除音乐</a></li>
          
        </ul>
      </div>
        </div>
        <script type="text/javascript">
		var contents = document.getElementsByClassName('content');
		var toggles = document.getElementsByClassName('type');
	
		var myAccordion = new fx.Accordion(
			toggles, contents, {opacity: true, duration: 400}
		);
		myAccordion.showThisHideOpen(contents[0]);
	</script>
        </td>
  </tr>
</table>
</body>
</html>