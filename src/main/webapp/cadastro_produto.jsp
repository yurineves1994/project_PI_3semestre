<%-- 
    Document   : cadastro_produto
    Created on : 08/10/2020, 18:57:07
    Author     : yurin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid row mt-5 justify-content-around">
            <div class="col-5 ">
                <img class="" src="img/logo.PNG" alt="">
            </div>
            <div class="col-6 mt-4">
                <h1 class=" display-4 font-weight-bolder">CADASTRAR PRODUTO</h1>
            </div>
        </div>
        <form class="container-fluid mt-5" action="CadastrarProduto" method="POST">
            <div class="form-group row justify-content-center">
                <label class="col-3 align-self-center font-weight-bolder h3">NOME DO PRODUTO</label>
                <input class="form-control-lg col-8" type="text">
            </div>
            <div class="form-group row justify-content-center">
                <div class="row col-6 justify-content-around">
                    <label class="col-3 align-self-center font-weight-bolder h3">PREÇO</label>
                    <input class="form-control-lg col-4" type="email">
                </div>
                <div class="row col-6 justify-content-start">
                    <label class="col-4 align-self-center font-weight-bolder h3">CATEGORIA</label>
                    <input class="form-control-lg col-7" type="email">
                </div>
            </div>
            <div class="form-group row justify-content-start">
                <div class="row col-12 justify-content-center">
                    <label class="col-3 align-self-start font-weight-bolder h3">DESCRIÇÃO</label>
                    <textarea class="col-8" rows="9"></textarea>
                </div>

            </div>

            <div class="container-fluid">
                <div class="row mt-5 justify-content-around">
                    <input class="btn btn-lg btn-danger col-5  font-weight-bolder h3 pb-2 pt-2" type="submit"
                           value="CADASTRAR PRODUTO">
                    <a href="index.jsp" class="btn btn-lg btn-danger col-5  font-weight-bolder h3 pb-2 pt-2" type="submit"
                       >CANCELAR</a>
                </div>
            </div>
        </form>
    </body>
</html>
