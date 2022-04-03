

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       
        
        <jsp:useBean id="perso" scope="request" class="com.emergentes.Persona" />
        <h1>Los datos de salida son</h1>
        
        <p>su Producto es : <jsp:getProperty name="perso" property="producto" /></p>
        <p>su Categoria es : <jsp:getProperty name="perso" property="categoria" /></p>
        <p>su Existencia es : <jsp:getProperty name="perso" property="existencia" /></p>
        <p>su Precio es : <jsp:getProperty name="perso" property="precio" /></p>
        <a href="index.jsp">volver al inicio</a>
    </body>
</html>

