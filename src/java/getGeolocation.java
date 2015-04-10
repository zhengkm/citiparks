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
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Kehao Xu
 */
public class getGeolocation extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    request.setCharacterEncoding("UTF-8");
   		    response.setCharacterEncoding("UTF-8");
		try {  
		
  			 getGeoLocation(request,response);
  			
		       
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	//doGet方法
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
       doPost(request,response);
    }
    
    public Connection connect() throws ClassNotFoundException, SQLException{
    	Connection conn=null; 
	    Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/citipark"; 
	        String user="root"; 
		String password="123456"; 
		conn=DriverManager.getConnection(url,user,password); 
		return conn;
	}
	//关闭数据库资源
	public void close(Statement stat,Connection conn) throws SQLException{
		if(stat!=null){
	    	   stat.close();
	    }
	    if(conn!=null){
	    	   conn.close();
	    }
            
	}
        
public void getGeoLocation(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException{
    	Connection conn=null;
    	Statement stat=null;
        ResultSet rs=null;

        StringBuilder sb= new StringBuilder();
 
    	conn=connect();
        stat=conn.createStatement();
                 rs=stat.executeQuery("select begin_date,end_date,longtitude,latitude,site_name,address from location ");
                 //System.out.print(rs.getString(salesperson_id));
//                 if(!rs.first()){
//                 
//                  response.getWriter().print("0");
//                  System.out.print(rs);
//                  
//                 }
//                 else{
                 try{
                     
//                     ArrayList<String[]> newString=new ArrayList<String[]>();
//                     String[] save;
                        Date today=new Date();
                        
                        sb.append("[");
                        //sb.append(rs.next());
                        SimpleDateFormat dateF=new SimpleDateFormat("yyyy-MM-dd");
                       // String PDate=dateF.format(today);
                        String PDate="2015-6-18";
                       // rs.next();
                            while(rs.next()){
                                if( !dateCompare(PDate,rs.getString("begin_date"),rs.getString("end_date"))){
                                StringBuilder sb1= new StringBuilder();


                               // save= new String[4];
                                String longtitude=rs.getString("longtitude");
                                String latitude=rs.getString("latitude");
                                String site_name=rs.getString("site_name");
                                String address=rs.getString("address");

                                sb1.append("{");
                                sb1.append("\"site_name\":\"").append(site_name).append("\",");
                                sb1.append("\"longtitude\":\"").append(longtitude).append("\",");
                                sb1.append("\"latitude\":\"").append(latitude).append("\",");
                                sb1.append("\"address\":\"").append(address).append("\"");
                                sb1.append("}");
                                sb1.append(",");
                                sb.append(sb1);

                                }else{
                                    sb.append("haha");
                                }
                                
                                

                            }
                            
                            sb.deleteCharAt(sb.length()-1);
                                sb.append("]");
                                response.setContentType("text/javascript");
                 
                 }
                 catch (Exception e){
                     sb.append("fuck");
                  System.out.println("fuck1");
//                     request.getRequestDispatcher("productwrong.jsp").forward(request, response);
                 }
                 String result = sb.toString();
                 response.getWriter().print(result);
               //}
      

      
    }
        
private boolean dateCompare(String input,String begindate,String enddate){

    String[] in=input.split(" ")[0].split("\\-");
    String[] bd=begindate.split(" ")[0].split("\\-");
    String[] ed=enddate.split(" ")[0].split("\\-");
    for(int i=0;i<in.length;i++){
        if(in[i].compareTo(bd[i])<0||in[i].compareTo(ed[i])>0){
            return false;
        }
    }
    return true;
}
}
