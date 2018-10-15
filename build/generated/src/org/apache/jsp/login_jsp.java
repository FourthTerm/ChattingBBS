package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>  \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/loginCss.css\" />\n");
      out.write("        <script src=\"js/login.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>登录界面</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"90%\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td><div align=\"center\">head.jsp</div></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("<div class=\"divAll\"> \n");
      out.write("   <div id=\"titles\">用户登录</div> \n");
      out.write("   <div id=\"contents\">\n");
      out.write("   <hr width=\"95%\" color=\"#f2f2f2\"/> \n");
      out.write("   <form action=\"loginServlet\"  method=\"POST\" onSubmit=\"return checkForm()\"> \n");
      out.write("    <div id=\"form-itemGroup\"> \n");
      out.write("      <label>用户名：</label> \n");
      out.write("      <input type=\"text\" name=\"userName\" id=\"userName\" class=\"userName\" onBlur=\"checkUserName()\" oninput=\"checkUserName()\"> \n");
      out.write("      <span class=\"default\" id=\"nameErr\"></span> \n");
      out.write("    </div> \n");
      out.write("    <div id=\"form-itemGroup\"> \n");
      out.write("      <label>密码：</label> \n");
      out.write("      <input type=\"password\"  name=\"userPasword\" id=\"userPasword\" class=\"userName\" onBlur=\"checkPassword()\" oninput=\"checkPassword()\"> \n");
      out.write("      <span class=\"default\" id=\"passwordErr\"></span> \n");
      out.write("    </div> \n");
      out.write("    <div> \n");
      out.write("     <button type=\"submit\" class=\"divBtn\">登录</button> \n");
      out.write("     <button type=\"reset\" class=\"divBtn\">清空</button> \n");
      out.write("    </div> \n");
      out.write("    <a href=\"register.jsp\">还没有账号？点击注册</a>\n");
      out.write("   </form> \n");
      out.write("   </div> \n");
      out.write(" </div>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><div align=\"center\">tail.jsp</div></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
