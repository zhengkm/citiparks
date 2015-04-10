package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.io.*;
import java.util.*;

public final class browse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/wrong.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if(session.getAttribute("username")==null){

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    alert(\"You should log in\");\n");
      out.write("    window.location.href=\"login.jsp\";\n");
      out.write("</script>\n");

    }

      out.write('\n');

   String username = (String)session.getAttribute("username");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"browse.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\" type=\"text/javascript\"></script> \n");
      out.write("        <title>Index</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"l\">\n");
      out.write("        <div class=\"log\">\n");
      out.write("           \n");
      out.write("          <div class=\"fullcontent\">\n");
      out.write("               \n");
      out.write("            <div id=\"leftContent\">\n");
      out.write("                \n");
      out.write("                <!--show the username and set the function of log out-->\n");
      out.write("              <div class=\"user-desc\">\n");
      out.write("                <div class=\"hd\">                 \n");
      out.write("                  <h1 id=\"message\">");
 out.print(username); 
      out.write("</h1>      \n");
      out.write("                  <button class=\"btn btn-embossed btn-primary\" id =\"logout\" type=\"submit\">Log Out</button>\n");
      out.write("                </div>  \n");
      out.write("              </div>\n");
      out.write("                            \n");
      out.write("            </div>\n");
      out.write("                  \n");
      out.write("            <!--show the content of selected rss feed-->\n");
      out.write("            <div id=\"rightContent\">\n");
      out.write(" \n");
      out.write("                <div class=\"submit\"><button class=\"btn\" type=\"submit\" id=\"update\">update</button></div> \n");
      out.write("                <div class=\"submit\"><button class=\"btn\" type=\"submit\" id=\"manager\">manager</button></div> \n");
      out.write("                <div class=\"submit\"><button class=\"btn\" type=\"submit\" id=\"delete\">delete</button></div>\n");
      out.write("                <div class=\"submit\"><button class=\"btn\" type=\"submit\" id=\"changeState\">changeState</button></div>\n");
      out.write("                        \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("       </div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("  \n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("  $(document).ready(function()\n");
      out.write("        {\n");
      out.write("            $(\"#logout\").click(function()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                  $.post(\n");
      out.write("                    \"./logout\",\n");
      out.write("                    {},\n");
      out.write("                     function(data){     \n");
      out.write("                         \n");
      out.write("                         window.location.href = \"login.jsp\";\n");
      out.write("                     },\n");
      out.write("                    \"text\" ); \n");
      out.write("                    \n");
      out.write("             }\n");
      out.write("                         \n");
      out.write("            );\n");
      out.write("                    \n");
      out.write("            $(\"#update\").click(function()\n");
      out.write("            {\n");
      out.write("                   \n");
      out.write("               window.location.href = \"update.jsp\";\n");
      out.write("                    \n");
      out.write("             }\n");
      out.write("                         \n");
      out.write("            );\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("            $(\"#manager\").click(function()\n");
      out.write("            {\n");
      out.write("                   \n");
      out.write("               window.location.href = \"manager.jsp\";\n");
      out.write("                    \n");
      out.write("             }\n");
      out.write("                         \n");
      out.write("            );\n");
      out.write("    \n");
      out.write("             $(\"#delete\").click(function()\n");
      out.write("            {\n");
      out.write("                   \n");
      out.write("               window.location.href = \"delete.jsp\";\n");
      out.write("                    \n");
      out.write("             }\n");
      out.write("                         \n");
      out.write("            );\n");
      out.write("    \n");
      out.write("           $(\"#changeState\").click(function()\n");
      out.write("            {\n");
      out.write("                   \n");
      out.write("               window.location.href = \"changestate.jsp\";\n");
      out.write("                    \n");
      out.write("             }\n");
      out.write("                         \n");
      out.write("            );\n");
      out.write("        });\n");
      out.write("\n");
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
