<%-- 
    Document   : wrong
    Created on : 2015-2-21, 23:42:00
    Author     : zhengkaiming
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session.getAttribute("username")==null){
%>
<script type="text/javascript">
    alert("You should log in");
    window.location.href="login.jsp";
</script>
<%
    }
%>