

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Servlet" method="post">
        <h1>Registro De Productos</h1>
        <label>Producto</label>
        <input type="text" name="producto" value="">
        <br>
        <label>Categoria</label>
        <select name="categoria" >
            <option>Categoria1</option>
            <option>Categoria2</option>
            <option>Categoria3</option>
            <option>Categoria4</option>
            <option>Categoria5</option>
        </select>
        <br>
        <br>
        
        
        <br>
        <br>
        <label>Existencia</label>
        <input type="text" name="existencia" value="">
        <br>
        <br>
        <label>Precio</label>
        <input type="number" name="precio" value="">
        <br>
        <br>
         <input type="submit" value="procesar">
        
        </form>
    </body>
</html>
