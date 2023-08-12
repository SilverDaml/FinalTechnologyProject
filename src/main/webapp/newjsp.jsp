<%-- 
    Document   : newjsp
    Created on : Jun 13, 2023, 9:00:21 PM
    Author     : Francisco
--%>
<%@page import="SQL.DBConnection" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SQL workbench connection </title>
    </head>
    <body>
        <h1>Connection</h1>
        
        <%
          try {
           
            DBConnection con = new DBConnection();
            out.write("Successfull conection");
          
          }catch (Exception e) {
            
            out.write("An error has ocurred" + e.getMessage());
          }  
            
        %>
    </body>
</html>
