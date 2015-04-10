<%-- 
    Document   : login
    Created on : 2015-2-21, 23:11:16
    Author     : zhengkaiming
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js" type="text/javascript"></script>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">   
        <link rel="stylesheet" rel="stylesheet" href="manager.css" type="text/css" ></link>
        <title>Login</title>
    </head>
    
    
    <body>

      <div class="container">
        <br/>
        <div class="l">
        <div class="log">
           
              
             <div class="form-group">
              <label class="label" for="login-name">username</label>
              <input type="text" class="form-control" value="" placeholder="username" id="username" />
              
            </div>
            <div class="form-group">
              <label class="label" for="login-name">password</label>
              <input type="password" class="form-control" value="" placeholder="password" id="password" />
              
            </div>
              
            <div class="submit"><button class="btn" type="submit" id="log">Login</button>                  
                
             
            </div>
            
           
          </div>
        </div>
      </div>
    <!-- /.container -->

    </body>
    
<script type="text/javascript">
 $(document).ready(function()
        {
            $("#log").click(function()
            {
                var username=$("#username").val();
                var password=$("#password").val();
                if(username=="" || password=="")
                    alert("Please input all information!");
                else
                {
                    $.post(
                            
                    "./Login",
                    {"username":username,"password":password},
                     function(data){  
                        // alert(data);
                         if(data==0)
                        {
                           window.location.href="browse.jsp";
                          
                         }else{
                             alert("Username or Password wrong! Please check your enter");
                         }    
                            $("#login-pass").val("");
                     },
                    "text" );
                }
            });
                    
            
        });
</script>
</html>
