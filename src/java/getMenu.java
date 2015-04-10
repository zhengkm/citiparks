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
public class getMenu extends HttpServlet {

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
    @Override


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "jdbc:mysql://localhost:3306/citipark";  // 数据库只能小写！！！
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        StringBuilder html = new StringBuilder();
        String siteName=request.getParameter("siteName");
        Date now=new Date();
        System.out.println(now);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String getMenu="";
        String getNumber="select * from location where site_name = '"+siteName+"'";
        String B_number="";
        String L_number="";
        String S_number="";
        String B_menu="";
        String L_menu="";
        String S_menu="";
        String address="";
        String b_date="";
        String e_date="";
        String ovens="";
        String coolers="";
        String days="";
        String state="";
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
                    state=rs.getString(15);
                    if(state.equals("0"))
                        state="Close";
                    else
                        state="Open";                   
                    address=rs.getString(3);
                    b_date=rs.getString(6);
                    e_date=rs.getString(7);
                    ovens=rs.getString(12);
                    if(ovens.equals("0"))
                        ovens="No";
                    else
                        ovens="Yes";
                    coolers=rs.getString(13);
                    if(coolers.equals("0"))
                        coolers="No";
                    else
                        coolers="Yes";
                    days=rs.getString(14);
                    json.append("\"state\":\"");
                    json.append(state);
                    json.append("\",");
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
                    B_number=rs.getString(8);
                    L_number=rs.getString(9);
                    S_number=rs.getString(10);
                    json.append("\"B_number\":\"");
                    json.append(B_number);
                    json.append("\",");
                    json.append("\"L_number\":\"");
                    json.append(L_number);
                    json.append("\",");
                    json.append("\"S_number\":\"");
                    json.append(S_number);
                    json.append("\",");  
                    if(rs.getString(11).equals("1"))
                    {
                        json.append("\"hot_cold\":\"");
                        json.append("Cold");
                        json.append("\",");                    
                        getMenu="select * from cold_menu where date='"+today+"'";
                        rs2=stat.executeQuery(getMenu);
                        if(rs2.next()==false)
                        {
                            json.append("\"B_menu\":\"");
                            json.append("\",");
                            json.append("\"L_menu\":\"");
                            json.append("\",");
                            json.append("\"S_menu\":\"");
                            json.append("\",");                             
                        }
                        else
                        {
                            B_menu=rs2.getString(2).trim();
                            L_menu=rs2.getString(3).trim();
                            S_menu=rs2.getString(4).trim();
                            json.append("\"B_menu\":\"");
                            json.append(B_menu);
                            json.append("\",");
                            json.append("\"L_menu\":\"");
                            json.append(L_menu);
                            json.append("\",");
                            json.append("\"S_menu\":\"");
                            json.append(S_menu);
                            json.append("\",");                             
                            
                        }
                    }
                    else
                    {
                        json.append("\"hot_cold\":\"");
                        json.append("Hot");
                        json.append("\",");
                        getMenu="select * from hot_menu where date='"+today+"'";
                        rs2=stat.executeQuery(getMenu);
                        if(rs2.next()==false)
                        {
                            json.append("\"B_menu\":\"");
                            json.append("\",");
                            json.append("\"L_menu\":\"");
                            json.append("\",");
                            json.append("\"S_menu\":\"");
                            json.append("\",");
                        }
                        else
                        {
                            B_menu=rs2.getString(2).trim();
                            L_menu=rs2.getString(3).trim();
                            S_menu=rs2.getString(4).trim();
                            json.append("\"B_menu\":\"");
                            json.append(B_menu);
                            json.append("\",");
                            json.append("\"L_menu\":\"");
                            json.append(L_menu);
                            json.append("\",");
                            json.append("\"S_menu\":\"");
                            json.append(S_menu);
                            json.append("\",");                             
                        }
                        
                    }
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
//            if(html.length()!=0)
//                result="{\"err\":\""+html.toString()+"\"}";
//            else
                result=json.toString();
            System.out.println();
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
