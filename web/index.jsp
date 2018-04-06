<%-- 
    Document   : index
    Created on : Feb 25, 2018, 11:22:59 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="">
       
       
        <form name="frm1" id="frm1" action="Android" method="POST">
<!--            <input type="hidden" id="onay" name="onay" value="okkkkkk"/>
            <input type="submit" onclick="show();"/>-->
    </form>
        
        
        <p id='html'></p>
        <script>
            
              var obj = { name:"John", age:30, city:"New York"};
var myJSON = JSON.stringify(obj);
window.document.write(myJSON);


        
            </script>
    </body>
</html>
