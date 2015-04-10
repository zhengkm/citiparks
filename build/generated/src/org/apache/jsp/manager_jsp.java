package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">   \n");
      out.write("        <link rel=\"stylesheet\" rel=\"stylesheet\" href=\"./manager.css\" type=\"text/css\" >\n");
      out.write("        <title>Manager Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"l\">\n");
      out.write("        <div class=\"log\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Site_Number</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Site Number\" id=\"Site_Number\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" for=\"login-name\">Site_Name</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Site Name\" id=\"Site_Name\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" for=\"login-name\">Address</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Address\" id=\"Address\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("              \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Longtitude</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Longtitude\" id=\"Longtitude\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Latitude</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Latitude\" id=\"Latitude\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" for=\"login-name\">Begin_Date</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Begin Date\" id=\"BeginDate\"/>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >End_Date</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"End Date\" id=\"EndDate\"/>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" for=\"login-name\">Days</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Days\" id=\"Days\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Amount Of Breakfast</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Amount\" id=\"Breakfast\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" for=\"login-name\">Amount Of Lunch</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Amount\" id=\"Lunch\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Amount Of Snack</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"Amount\" id=\"Snack\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Type</label>\n");
      out.write("              <select class=\"select1\" id=\"Type\" >\n");
      out.write("                    <option value=\"0\">Hot</option>\n");
      out.write("                    <option value=\"1\">Cold</option>\n");
      out.write("                  </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >State</label>\n");
      out.write("              <select class=\"select1\" id=\"State\" >\n");
      out.write("                    <option value=\"1\">Open</option>\n");
      out.write("                    <option value=\"0\">Close</option>\n");
      out.write("                  </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Cooler</label>\n");
      out.write("              <select class=\"select1\" id=\"Cooler\">\n");
      out.write("                    <option value=\"0\">No</option>\n");
      out.write("                    <option value=\"1\">Yes</option>\n");
      out.write("                  </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"label\" >Ovens</label>\n");
      out.write("              <select class=\"select1\" id=\"Ovens\">\n");
      out.write("                    <option value=\"0\">No</option>\n");
      out.write("                    <option value=\"1\">Yes</option>\n");
      out.write("                  </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"submit\"><button class=\"btn\" type=\"submit\" id=\"store\">Update</button>                  \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function()\n");
      out.write("        {\n");
      out.write("            $(\"#store\").click(function()\n");
      out.write("            {\n");
      out.write("                var Site_Number=$(\"#Site_Number\").val();\n");
      out.write("                var Site_Name=$(\"#Site_Name\").val();\n");
      out.write("                var Address=$(\"#Address\").val();\n");
      out.write("                var Type=$(\"#Type\").val();\n");
      out.write("                var Longtitude=$(\"#Longtitude\").val();\n");
      out.write("                var Latitude=$(\"#Latitude\").val();\n");
      out.write("                var BeginDate=$(\"#BeginDate\").val();\n");
      out.write("                var EndDate=$(\"#EndDate\").val();\n");
      out.write("                var Days=$(\"#Days\").val();\n");
      out.write("                var Breakfast=$(\"#Breakfast\").val();\n");
      out.write("                var Lunch=$(\"#Lunch\").val();\n");
      out.write("                var Snack=$(\"#Snack\").val();\n");
      out.write("                var Ovens=$(\"#Ovens\").val();\n");
      out.write("                var Coolers=$(\"#Coolers\").val();\n");
      out.write("                var State=$(\"#State\").val();\n");
      out.write("\n");
      out.write("\n");
      out.write("                if(State==\"\" || Site_Number==\"\" || Site_Name==\"\" || Address==\"\" || Type==\"\" || Longtitude==\"\" || Latitude==\"\" || BeginDate==\"\" || EndDate==\"\" || Days==\"\" || Breakfast==\"\" || Lunch==\"\" || Snack==\"\" || Ovens==\"\" || Coolers==\"\")\n");
      out.write("                    alert(\"Please finish all information!\");\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    $.post(\n");
      out.write("                    \"./newSite\",\n");
      out.write("                    {\"site_num\":Site_Number,\"site_name\":Site_Name,\"address\":Address,\"hot_cold\":Type,\"longtitude\":Longtitude,\"latitude\":Latitude,\"begin_date\":BeginDate,\"end_date\":EndDate,\"days\":Days,\"b\":Breakfast,\"l\":Lunch,\"s\":Snack,\"ovens\":Ovens,\"coolers\":Coolers,\"state\":State},\n");
      out.write("                     function(data){                    \n");
      out.write("                        alert(data);\n");
      out.write("                        $(\".form-control\").val(\"\");\n");
      out.write("                     },\n");
      out.write("                    \"text\" );\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write("\n");
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
