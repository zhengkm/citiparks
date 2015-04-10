/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kehao Xu
 */
public class getSiteInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "jdbc:mysql://localhost:3306/citipark";  // 数据库只能小写！！！
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;
        StringBuilder html = new StringBuilder();
        String siteName=request.getParameter("siteName");
        Date now=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String getNumber="select * from location where site_name = '"+siteName+"'";
        String address="";
        String b_date="";
        String e_date="";
        String ovens="";
        String coolers="";
        String days="";
        StringBuilder json = new StringBuilder();
        json.append('{');
//        String today=dateFormat.format(now);
        String today="2015-06-17";
            try{
                   // Class.forName("org.gjt.mm.mysql.Driver").newInstance();
                   Class.forName("com.mysql.jdbc.Driver");
                   //html.append("mysql working ...");
            }
            catch (Exception ex){
                   html.append("fail to create mysql drive");
                   html.append(ex.getMessage());
            }
            try
            {
                // root为mysql用户名, 123456为密码
                con = DriverManager.getConnection(url, "root", "123456");
                stat = con.createStatement();
                rs = stat.executeQuery(getNumber);
                if(rs.next()==false)
                {
                    html.append("No such site");
                }
                else
                {
                    address=rs.getString(3);
                    b_date=rs.getString(6);
                    e_date=rs.getString(7);
                    ovens=rs.getString(12);
                    if(ovens.equals("0"))
                        ovens="False";
                    else
                        ovens="True";
                    coolers=rs.getString(13);
                    if(coolers.equals("0"))
                        coolers="False";
                    else
                        coolers="True";
                    days=rs.getString(14);
                    json.append("\"address\":\"");
                    json.append(address);
                    json.append("\",");
                    json.append("\"b_date\":\"");
                    json.append(b_date.split(" ")[0]);
                    json.append("\",");
                    json.append("\"e_date\":\"");
                    json.append(e_date.split(" ")[0]);
                    json.append("\",");  
                    json.append("\"ovens\":\"");
                    json.append(ovens);
                    json.append("\",");
                    json.append("\"coolers\":\"");
                    json.append(coolers);
                    json.append("\",");
                    json.append("\"days\":\"");
                    json.append(days);
                    json.append("\",");                          
                    }
                

                rs.close();
                stat.close();
                con.close();
            }
    
            catch (SQLException ex){
                while (ex != null){
                        html.append(ex.toString());
                        ex = ex.getNextException();
                }
            }
            json.deleteCharAt(json.length()-1);
            json.append('}');
            String result="";
            if(html.length()!=0)
                result=html.toString();
            else
                result=json.toString();
            response.getWriter().print(result);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
