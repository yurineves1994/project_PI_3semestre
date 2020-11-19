<%-- 
    Document   : login
    Created on : 08/10/2020, 20:18:07
    Author     : yurin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mangá Store</title>
    </head>
    <body>
        <div class="container">
            <div class="row justify-content-between mb-5 mt-5">
                <img class="col-6  offset-3" src="img/logo.PNG" alt="">
            </div>
        </div>
        <form class="container" action="Login" method="POST">
            <div class="form-group row justify-content-around">
                <label class="col-2 align-self-center text-danger font-weight-bolder h1">USUARIO</label>
                <input class="form-control-lg col-8 border-danger" type="text">
            </div>
            <div class="form-group row justify-content-around">
                <label class="col-2 align-self-center text-danger font-weight-bolder h1">SENHA</label>
                <input class="form-control-lg col-8 border-danger " type="password">
            </div>
            <div class="row text-center mt-5 justify-content-between">
                <input class="btn btn-lg btn-danger col-5 offset-1 font-weight-bolder h3 pb-2 pt-2" type="submit"
                       value="ENTRAR">
                <a class="btn btn-lg btn-danger col-5 offset-1 font-weight-bolder h3 pb-2 pt-2">CANCELAR</a>
            </div>
        </form>
    </body>
</html>
