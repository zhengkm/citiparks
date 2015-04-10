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
import javax.servlet.http.HttpSession;

/**
 *
 * @author zhengkaiming
 */
public class Login extends HttpServlet {


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
        HttpSession session = request.getSession();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        StringBuilder html = new StringBuilder();
        String url = "jdbc:mysql://localhost:3306/citipark";  // 数据库只能小写！！！
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;
        
        String sql = "select password from userinfo where username='"+username+"'";
        
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
                
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citipark", "root", "123456");
                stat = con.createStatement();
                rs = stat.executeQuery(sql);
                
                if(!rs.next())
                    html.append("false");
                else if(!rs.getString("password").equals(password))
                    html.append("false");
                else
                {
                        session.setAttribute("username", username);
                        request.getSession().setAttribute("username", username);
                       
                        html.append("0");

                }
                    
                    
                rs.close();
                stat.close();
                con.close();
            }
            catch (SQLException ex){
                
                        html.append(ex);
                        System.out.println(ex);
               
            }
            
            String result=html.toString();
            //System.out.println(result);
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
