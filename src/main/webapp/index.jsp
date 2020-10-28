<%-- 
    Document   : index
    Created on : 08/10/2020, 18:47:32
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
        <div class="container row justify-content-between">
            <div class="row justify-content-between col-7 mb-5 mt-5 offset-4">
                <img class=" col-12" src="img/logo.PNG" alt="">
            </div>
            <div class="row col-9 offset-3 justify-content-between mb-5 mt-5">
                <a href="cadastro_cliente.jsp" class="btn btn-lg btn-danger col-5 font-weight-bolder h1 pb-3 pt-3">CADASTRAR CLIENTE</a>
                <a href="cadastro_produto.jsp" class="btn btn-lg btn-danger col-5 font-weight-bolder h1 pb-3 pt-3">CADASTRAR PRODUTO</a>
                <a href="ListarProdutos" class="btn btn-lg btn-danger col-5 font-weight-bolder h1 pb-3 pt-3">LISTAR PRODUTO</a>
                <a href="ListarClientes" class="btn btn-lg btn-danger col-5 font-weight-bolder h1 pb-3 pt-3">LISTAR CLIENTE</a>
                <a href="ListaDeCliente" class="btn btn-lg btn-danger col-5 font-weight-bolder h1 pb-3 pt-3">REALIZAR VENDA</a>
                <a href="relatorios.jsp" class="btn btn-lg btn-danger col-5 font-weight-bolder h1 pb-3 pt-3">GERAR RELATORIOS</a>
            </div>

        </div>
    </body>
</html>
