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
public class deleteSite extends HttpServlet {






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
            String Site_Number=request.getParameter("siteNumber");
            String sql="delete from location where site_num="+Site_Number;

            StringBuilder html = new StringBuilder();
            String url = "jdbc:mysql://localhost:3306/citipark";  // 数据库只能小写！！！
        Connection con = null;
        Statement stat = null;

        
        //String sql = "select password from StaffAccount where username='"+username+"'";
        //String salespersonid="select salesperson_id from StaffAccount where username='"+username+"'";
        
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
                stat =  con.createStatement();
                int result= stat.executeUpdate(sql);
                if(result>0)
                    html.append("0");
                else
                    html.append("1");
                    

                stat.close();
                con.close();
            }
            catch (SQLException ex){
                
                        html.append("1");
                        
                
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
