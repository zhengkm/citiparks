<%-- 
    Document   : test
    Created on : 2015-2-21, 14:39:29
    Author     : Kehao Xu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <input id="siteName">
        <button id="test">test !</button>
        <button id="test2">test2 !</button>
        <button id="test3">test3 !</button>
        <input id="result">
    </body>
        <script type="text/javascript">
        $(document).ready(function()
        {
            $("#test").click(function()
            {
                var siteName=$("#siteName").val();
              
                    $.post(
                    "/citipark/getMenu",
                    {"siteName":siteName},
                     function(data){                    
                        alert(data);
                     },
                    "JSON" );
                
            });
                    
            
        });
    </script>
            <script type="text/javascript">
        $(document).ready(function()
        {
            $("#test2").click(function()
            {
                var siteName=$("#siteName").val();
              
                    $.post(
                    "/citipark/getSiteInfo",
                    {"siteName":siteName},
                     function(data){                    
                        $("#result").val(data.days);
                     },
                    "JSON" );
                
            });
                    
            
        });
    </script>
    </script>
            <script type="text/javascript">
        $(document).ready(function()
        {
            $("#test3").click(function()
            {
                var siteName=$("#siteName").val();
              
                    $.post(
                    "/citipark/getGeolocation",
                    {"siteName":siteName},
                     function(data){  
                        for(var d in data)
                             $("#result").val(data[d].site_name);                       
                     },
                    "JSON" );
                
            });
                    
            
        });
    </script>
</html>
