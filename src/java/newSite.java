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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kehao Xu
 */
public class newSite extends HttpServlet {

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
        
        String site_num=request.getParameter("site_num");
        String site_name=request.getParameter("site_name");
        String address=request.getParameter("address");
        String longtitude=request.getParameter("longtitude");
        String latitude=request.getParameter("latitude");
        String begin_date=request.getParameter("begin_date");
        String end_date=request.getParameter("end_date");
        String b=request.getParameter("b");
        String l=request.getParameter("l");
        String s=request.getParameter("s");
        String hot_cold=request.getParameter("hot_cold");
        String ovens=request.getParameter("ovens");       
        String coolers=request.getParameter("coolers");
        String days=request.getParameter("days");  
        String state=request.getParameter("state");
        
        StringBuilder html = new StringBuilder();
        String check="select * from location where site_num="+site_num;
        String sql="insert into location VALUES("+site_num+",'"+site_name+"','"+address+"','"+longtitude+"','"+latitude+"','"+begin_date+"','"+end_date+"',"+b+","+l+","+s+","+hot_cold+","+ovens+","+coolers+",'"+days+"',"+state+")";
        
        String url = "jdbc:mysql://localhost:3306/citipark";  // 数据库只能小写！！！
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;
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
                rs = stat.executeQuery(check);
                
                
                int result=1;
                if(rs.next()==false)
                    result=stat.executeUpdate(sql);
                else
                    html.append("Already has this site, do not add again!");
                if(result>0)
                    html.append("successful add new site!");
                else
                    html.append("fail to add site!");
                
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
            
            String result=html.toString();
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
