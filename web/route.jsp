<%-- 
    Document   : route
    Created on : Apr 5, 2018, 10:34:49 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="new.js"></script>
        
        
         <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCXacNxNEMAREbql4V1o5Rkh4VerZjztoE&callback=initialize"
  type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body onload="initialize();calculateAndDisplayRoute(directionsService);">
<!--//      <button type="button" onclick="initialize();calculateAndDisplayRoute(directionsService);">Click me </button>-->
      <form id='vehicles' action="FindRoute" method="POST">
          <input type="hidden" id='name' name='name' value="">
          
      </form>

<!--        <p id='demo'></p>-->
    </body>
</html>
