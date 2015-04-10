package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changestate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\" type=\"text/javascript\"></script>        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" rel=\"stylesheet\" href=\"./manager.css\" type=\"text/css\" >    \n");
      out.write("        <title>Change State</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label class=\"label\" >Site_Number</label>\n");
      out.write("     <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Site Number\" id=\"Site_Number\" />\n");
      out.write("     </div>        \n");
      out.write("     <div class=\"form-group\">\n");
      out.write("     <label class=\"label\" >State</label>\n");
      out.write("    <select class=\"select1\" id=\"State\">\n");
      out.write("        <option value=\"0\">Close</option>\n");
      out.write("        <option value=\"1\">Open</option>\n");
      out.write("    </select>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"submit\"><button class=\"btn\" type=\"submit\" id=\"store\">Change</button></div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("       $(document).ready(function()\n");
      out.write("        {\n");
      out.write("            $(\"#store\").click(function()\n");
      out.write("            {\n");
      out.write("                var State=$(\"#State\").val();\n");
      out.write("                var Site_Num=$(\"#Site_Number\").val();\n");
      out.write("                    $.post(\n");
      out.write("                    \"./changeState\",\n");
      out.write("                    {\"state\":State,\"site_num\":Site_Num},\n");
      out.write("                     function(data){                    \n");
      out.write("                        alert(data);                       \n");
      out.write("                     },\n");
      out.write("                    \"text\" );\n");
      out.write("            }\n");
      out.write("        );\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
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
