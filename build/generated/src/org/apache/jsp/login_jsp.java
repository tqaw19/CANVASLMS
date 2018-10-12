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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("   <title>LOGIN</title>\n");
      out.write("   <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("   <meta name=\"google-signin-client_id\" content=\"624454173141-v7t6h0petkghakuj4hjsuajj5dqfkrig.apps.googleusercontent.com\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"g-signin2\" data-onsuccess=\"onSignIn\" id=\"myP\"></div>\n");
      out.write("      <img id=\"myImg\"><br>\n");
      out.write("      <p id=\"name\"></p>\n");
      out.write("      <div id=\"status\">\n");
      out.write("   </div>\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("      function onSignIn(googleUser) {\n");
      out.write("      //window.location.href='success.jsp';\n");
      out.write("      var profile = googleUser.getBasicProfile();\n");
      out.write("      var imagurl=profile.getImageUrl();\n");
      out.write("      var name=profile.getName();\n");
      out.write("      var email=profile.getEmail();\n");
      out.write("      document.getElementById(\"myImg\").src = imagurl;\n");
      out.write("      document.getElementById(\"name\").innerHTML = name;\n");
      out.write("      document.getElementById(\"myP\").style.visibility = \"hidden\";\n");
      out.write("      document.getElementById(\"status\").innerHTML = 'Welcome '+name+'!<a href=success.jsp?email='+email+'&name='+name+'/>Continue with Google login</a></p>';\n");
      out.write("   }\n");
      out.write("   </script>\n");
      out.write("   <button onclick=\"myFunction()\">Sign Out</button>\n");
      out.write("   <script>\n");
      out.write("      function myFunction() {\n");
      out.write("      gapi.auth2.getAuthInstance().disconnect();\n");
      out.write("      location.reload();\n");
      out.write("   }\n");
      out.write("   </script>\n");
      out.write("</body>\n");
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
