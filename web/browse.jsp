


<%@ page import="java.util.Iterator" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.*,java.util.*" %>
<%@include file="wrong.jsp" %>
<%
   String username = (String)session.getAttribute("username");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <link rel="stylesheet" rel="stylesheet" href="./media/css/browse.css" type="text/css" >
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js" type="text/javascript"></script> 
        <title>Index</title>
    </head>
    <body>
      <div class="container">
        <br/>
        <div class="l">
        <div class="log">
               
            <div id="leftContent">
                
                <!--show the username and set the function of log out-->
              <div class="user-desc">
                <div class="hd">                 
                  <h1 id="message"><% out.print(username); %></h1>      
                  <button class="btn1 btn-embossed btn-primary" id ="logout" type="submit">Log Out</button>
                </div>  
              </div>
                            
            </div>
                  
            <!--show the content of selected rss feed-->
            <div id="rightContent">
 
<!--                <div class="submit"><button class="btn" type="submit" id="update">update</button></div> -->
                <div class="submit"><button class="btn" type="submit" id="manager">manager</button></div> 
                <div class="submit"><button class="btn" type="submit" id="delete">delete</button></div>
                <div class="submit"><button class="btn" type="submit" id="changeState">changeState</button></div>
                        
            </div>
           
       </div>
             
            </div>
            
           
          </div>
        </div>
      </div>
    </body>
  
 <script type="text/javascript">
  $(document).ready(function()
        {
            $("#logout").click(function()
            {
                
                  $.post(
                    "./logout",
                    {},
                     function(data){     
                         
                         window.location.href = "login.jsp";
                     },
                    "text" ); 
                    
             }
                         
            );
                    
            $("#update").click(function()
            {
                   
               window.location.href = "update.jsp";
                    
             }
                         
            );
    
    
    
            $("#manager").click(function()
            {
                   
               window.location.href = "manager.jsp";
                    
             }
                         
            );
    
             $("#delete").click(function()
            {
                   
               window.location.href = "delete.jsp";
                    
             }
                         
            );
    
           $("#changeState").click(function()
            {
                   
               window.location.href = "changestate.jsp";
                    
             }
                         
            );
        });

</script>
</html>
