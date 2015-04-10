package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>map</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0, width=device-width\"/>\n");
      out.write("        <!--<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">-->\n");
      out.write("        \n");
      out.write("        <!-- Loading Bootstrap -->\n");
      out.write("        <link href=\"./dist/css/vendor/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Loading Flat UI -->\n");
      out.write("        <link href=\"./dist/css/flat-ui.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"\">\n");
      out.write("        \n");
      out.write("         <!--Loading myfeed CSS--> \n");
      out.write("        <link href=\"./media/css/myfeed.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            html { height: 100% }\n");
      out.write("            body { height: 100%; margin: 0; padding: 0;  }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDZthIqDtWlS3wbtqF5PWPGkBAH4vtOt2g&sensor=TRUE\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      \n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"map_canvas\" style=\"width:100%; height:100%\"></div>\n");
      out.write("        <div class=\"secondary\" style=\"display:none\">   \n");
      out.write("                <div class=\"feed\" id=\"site\">\n");
      out.write("                    <header class=\"\">\n");
      out.write("                        <h2 class=\"feed-title\"><a class=\"feed-title\" id=\"siteName\" href=\"#\"></a></h2>\n");
      out.write("                        <p class=\"feed-meta\">\n");
      out.write("                            <span class=\"fui-location\"></span>\n");
      out.write("                            Address: <a class=\"feed-date\" id=\"address\" href=\"#\"></a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"feed-meta\">\n");
      out.write("                            <span class=\"fui-calendar\"></span>\n");
      out.write("                            Begin Date: <a class=\"feed-date\" id=\"b_date\" href=\"#\"></a> | End Date: <a class=\"feed-date\" id=\"e_date\" href=\"#\"></a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"feed-meta\">\n");
      out.write("                            <span class=\"fui-triangle-right-large\"></span>\n");
      out.write("                            Hot/Cold: <a class=\"feed-date\" id=\"hot_cold\" href=\"#\"></a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"feed-meta\">\n");
      out.write("                            <span class=\"fui-triangle-right-large\"></span>\n");
      out.write("                            Ovens: <a class=\"feed-date\" id=\"ovens\" href=\"#\"></a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"feed-meta\">\n");
      out.write("                            <span class=\"fui-triangle-right-large\"></span>\n");
      out.write("                            coolers: <a class=\"feed-date\" id=\"coolers\" href=\"#\"></a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"feed-meta\">\n");
      out.write("                            <span class=\"fui-info-circle\"></span>\n");
      out.write("                            Days: <a class=\"feed-date\" id=\"days\" href=\"#\"></a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"feed-meta\">\n");
      out.write("                            <span class=\"fui-info-circle\"></span>\n");
      out.write("                            Status: <a class=\"feed-date\" id=\"state\" href=\"#\"></a>\n");
      out.write("                        </p>\n");
      out.write("                    </header>\n");
      out.write("                </div>  \n");
      out.write("        \n");
      out.write("                \n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"feed\">\n");
      out.write("                <h3 class=\"brand\" >Menu </h3>\n");
      out.write("              \n");
      out.write("              <div class=\"menu\">\n");
      out.write("              <p class=\"feed-meta\">\n");
      out.write("                Breakfast: \n");
      out.write("              </p>\n");
      out.write("                <ul id=\"B_menu\">\n");
      out.write("                    <li><span class=\"feed-date\">---</span></li>\n");
      out.write("                    <li><span class=\"feed-date\">---</span></li>\n");
      out.write("                    <li><span class=\"feed-date\">---</span></li>\n");
      out.write("               </ul>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            <div class=\"menu\">\n");
      out.write("              <p class=\"feed-meta\">\n");
      out.write("                Lunch: \n");
      out.write("              </p>\n");
      out.write("                <ul id=\"L_menu\">\n");
      out.write("                    <li><span class=\"feed-date\">---</span></li>\n");
      out.write("                    <li><span class=\"feed-date\">---</span></li>\n");
      out.write("                    <li><span class=\"feed-date\">---</span></li>\n");
      out.write("               </ul>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"menu\">\n");
      out.write("              <p class=\"feed-meta\">\n");
      out.write("                Snacks: \n");
      out.write("              </p>\n");
      out.write("                   <ul id=\"S_menu\">\n");
      out.write("                        <li><span class=\"feed-date\">---</span></li>\n");
      out.write("                        <li><span class=\"feed-date\">---</span></li>\n");
      out.write("                        <li><span class=\"feed-date\">---</span></li>\n");
      out.write("                   </ul>\n");
      out.write("              </div>     \n");
      out.write("            </div>\n");
      out.write("            <div class=\"feed-icon\" STYLE=\"padding-right:28px;margin-bottom: 8px;\"> \n");
      out.write("                <a class=\"fb-share-button icon\" data-layout=\"button_count\"></a>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("            </div> \n");
      out.write("             <div class=\"feed-icon\"> \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                <a  href=\"https://twitter.com/share\" class=\"icon twitter-share-button \" data-hashtags=\"Citipark\">Tweet</a>\n");
      out.write("<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>\n");
      out.write("               \n");
      out.write("            </div> \n");
      out.write("            <!--<div Style=\"clear:both;\"></div>-->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div id=\"fb-root\"></div>\n");
      out.write("        <script>(function(d, s, id) {\n");
      out.write("        var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("        if (d.getElementById(id)) return;\n");
      out.write("        js = d.createElement(s); js.id = id;\n");
      out.write("        js.src = \"//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.0\";\n");
      out.write("        fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("        }(document, 'script', 'facebook-jssdk'));</script>\n");
      out.write("      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("      <script src=\"./dist/js/vendor/jquery.min.js\"></script>\n");
      out.write("      <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("      <script src=\"./dist/js/flat-ui.min.js\"></script>\n");
      out.write("      \n");
      out.write("      <script src=\"./media/js/map.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
