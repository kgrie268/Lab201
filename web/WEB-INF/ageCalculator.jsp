<%-- 
    Document   : index
    Created on : 17-Sep-2017, 9:18:01 AM
    Author     : Kayla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
          
       <div style="border:3px; border-style:solid; border-color:black;">
        <form name= "ageCal" method="get">
            <h1>Age next birthday</h1>
            Enter your current age:   
            <input type ="text" name="age" >     
            <button id="val" class="val" name="button">Age next birthday</button>
            <br><br>
        ${errorMessage}
       
                
        </form> 
        ${errorMessage}
        ${yourAge}
       </div>
    </body>
</html>
