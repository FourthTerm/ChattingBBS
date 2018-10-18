<%@page import="com.chattingbbs.dao.ArticleDao"%>
<%@page import="com.chattingbbs.model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
request.setCharacterEncoding("UTF-8"); 
response.setCharacterEncoding("UTF-8"); 
response.setContentType("text/html; charset=utf-8"); 
%> 
<%
int currentPage=1;    
if(request.getParameter("currentPage")!=null)
currentPage=Integer.parseInt(request.getParameter("currentPage"));   
Article article=new Article();
ArticleDao ad=new ArticleDao();    
String username=(String)request.getSession().getAttribute("username");
ArrayList al =ad.getArticleByPage(6, currentPage,username);   
int pageCount=ad.getRowCount()/6+1;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/articleCss.css" rel="stylesheet" type="text/css"/>
        <title></title>
    </head>
    <body> 
              <%
for(int n=0;n<al.size();n++){   
article=(Article)al.get(n);
 %> 
     <div class="divAll"> 
   <div id="contents">
       <ul class="MM">
          <li><a href="contentServlet?aid=<%=article.getAid()%>"><%=article.getTitle()%></a></li>
          <li><%=article.getDate()%></li>
        </ul>
    </div> 
   </div>
        <%
}
        %>
        <div align="right">     
<%
if(currentPage<pageCount&&currentPage>0){
%>
<a href="admin_article.jsp?currentPage=<%=currentPage+1%>">下一页</a>         
<%
}        
if(currentPage>1){
%>      
<a href="admin_article.jsp?currentPage=<%=currentPage-1%>">上一页</a>
<%
 }
 %>           
总页数:<%=pageCount%> 当前页:<%=currentPage%>
</div>
    </body>
</html>