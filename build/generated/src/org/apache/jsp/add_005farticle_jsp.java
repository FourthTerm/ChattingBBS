package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005farticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"ueditor/ueditor.config.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"ueditor/ueditor.all.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"ueditor/lang/zh-cn/zh-cn.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"ueditor/ueditor.parse.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"ueditor/third-party/video-js/video-js.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"ueditor/third-party/video-js/video.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"http://api.html5media.info/1.1.4/html5media.min.js\"></script>\n");
      out.write("        <link href=\"css/articleCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/add_article.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>添加文章</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"divAll\"> \n");
      out.write("            <div id=\"titles\">添加新文章</div> \n");
      out.write("            <div id=\"contents\"> \n");
      out.write("                <hr width=\"95%\" color=\"#f2f2f2\"/> \n");
      out.write("                <form action=\"add_articleServlet\" >\n");
      out.write("                    <div id=\"form-itemGroup\">\n");
      out.write("                        <label>标题：</label> \n");
      out.write("                        <input type=\"text\" name=\"title\" id=\"title\" class=\"title\" onBlur=\"checkTitle()\" oninput=\"checkTitle()\"> \n");
      out.write("                        <span class=\"default\" id=\"titleErr\"></span>\n");
      out.write("                    </div> \n");
      out.write("                    <div id=\"form-itemGroup\"> \n");
      out.write("                        <label>内容：</label> \n");
      out.write("                        <span class=\"default\" id=\"contentErr\"></span> \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"form-content\">\n");
      out.write("                        <script id=\"myeditor\" name=\"content\" type=\"text/plain\" onBlur=\"checkContent()\" oninput=\"checkContent()\">这里写你的初始化内容</script>\n");
      out.write("                    </div>\n");
      out.write("                    <div> \n");
      out.write("                        <input type=\"submit\" name=\"Submit\" class=\"divBtnSubmit\" value=\"提交\" onclick=\"return checkForm()\"/>\n");
      out.write("                        <input type=\"reset\" name=\"Submit2\" class=\"divBtnReturn\" value=\"返回\" />\n");
      out.write("                    </div>\n");
      out.write("                </form> \n");
      out.write("            </div> \n");
      out.write("        </div> \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var ue = UE.getEditor('myeditor', {\n");
      out.write("                elementPathEnabled: false\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
