<%-- 
    Document   : delete
    Created on : 2015-2-21, 21:46:32
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
        <title>DeleteSite</title>
    </head>
    
    
    <body>

      <div class="container">
        <br/>
        <div class="l">
        <div class="log">
           
              
             <div class="form-group-delete">
              <label class="label" for="login-name">Site_Number</label>
              <input type="text" class="form-control" value="" placeholder="Site Number" id="Site_Number" />
              
            </div>
              
            <div class="submit"><button class="btn" type="submit" onclick="deleteItem()">Delete</button>                  
                
             
            </div>
            
           
          </div>
        </div>
      </div>
    <!-- /.container -->

    </body>
    
    <script type="text/javascript">
               function deleteItem()
                {
                   var siteNumber=$("#Site_Number").val() ;
                  

                    $.post(
                            "./deleteSite",
                            {"siteNumber":siteNumber},
                             function(data){
                                 if(data==0){
                                     alert("sucess");
                                 }else if(data==1){
                                     alert("this site is not exist");
                                 }else{alert(data);}
                                 
                                 

                             },
                            "text" );
                     
                };
     </script>
</html>

