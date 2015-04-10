<%-- 
    Document   : changestate
    Created on : 2015-2-21, 22:09:56
    Author     : Kehao Xu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js" type="text/javascript"></script>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" rel="stylesheet" href="./media/css/manager.css" type="text/css" > 
        <title>Change State</title>
    </head>
    <body>
    <div class="form-group">
    <label class="label" >Site_Number</label>
     <input type="text" class="form-control" value="" placeholder="Site Number" id="Site_Number" />
     </div>        
     <div class="form-group">
     <label class="label" >State</label>
    <select class="select1" id="State">
        <option value="0">Close</option>
        <option value="1">Open</option>
    </select>
     </div>
     <div class="submit"><button class="btn" type="submit" id="store">Change</button></div>
    </body>
    <script type="text/javascript">
       $(document).ready(function()
        {
            $("#store").click(function()
            {
                var State=$("#State").val();
                var Site_Num=$("#Site_Number").val();
                    $.post(
                    "./changeState",
                    {"state":State,"site_num":Site_Num},
                     function(data){                    
                        alert(data);                       
                     },
                    "text" );
            }
        );
        });
    </script>

</html>
