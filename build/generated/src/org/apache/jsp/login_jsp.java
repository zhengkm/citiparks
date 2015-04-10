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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\" type=\"text/javascript\"></script>        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">   \n");
      out.write("        <link rel=\"stylesheet\" rel=\"stylesheet\" href=\"manager.css\" type=\"text/css\" ></link>\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"l\">\n");
      out.write("        <div class=\"log\">\n");
      out.write("           \n");
      out.write("              \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" for=\"login-name\">username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"username\" id=\"username\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" for=\"login-name\">password</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"password\" id=\"password\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("            <div class=\"submit\"><button class=\"btn\" type=\"submit\" id=\"log\">Login</button>                  \n");
      out.write("                \n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write(" $(document).ready(function()\n");
      out.write("        {\n");
      out.write("            $(\"#log\").click(function()\n");
      out.write("            {\n");
      out.write("                var username=$(\"#username\").val();\n");
      out.write("                var password=$(\"#password\").val();\n");
      out.write("                if(username==\"\" || password==\"\")\n");
      out.write("                    alert(\"Please input all information!\");\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    $.post(\n");
      out.write("                            \n");
      out.write("                    \"./Login\",\n");
      out.write("                    {\"username\":username,\"password\":password},\n");
      out.write("                     function(data){  \n");
      out.write("                         alert(data);\n");
      out.write("                         if(data!=\"0\")\n");
      out.write("                        {\n");
      out.write("                           alert(\"Username or Password wrong! Please check your enter\");\n");
      out.write("                         }else{\n");
      out.write("                             window.location.href=\"browse.jsp\";\n");
      out.write("                         }    \n");
      out.write("                            $(\"#login-pass\").val(\"\");\n");
      out.write("                     },\n");
      out.write("                    \"text\" );\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("        });\n");
      out.write("</script>\n");
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
