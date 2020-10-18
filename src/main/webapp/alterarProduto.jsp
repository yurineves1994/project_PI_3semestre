<%-- 
    Document   : alterarProduto
    Created on : 17/10/2020, 21:04:08
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
            <div class="col-4 ">
                <img class="" src="img/logo.PNG" alt="">
            </div>
            <div class="col-7 mt-4">
                <h1 class=" display-5 font-weight-bolder">ALTERAR PRODUTO:${produto.nomeProduto}</h1>
            </div>
        </div>
        <form class="container-fluid mt-5" action="CadastrarProduto" method="POST">
            <div class="form-group row justify-content-center">
                <label class="col-3 align-self-center font-weight-bolder h3">NOME DO PRODUTO</label>
                <input name="nomeProduto" value="${produto.nomeProduto}" class="form-control-lg col-8" type="text">
            </div>
            <div class="form-group row justify-content-center">
                <div class="row col-6 justify-content-around">
                    <label class="col-3 align-self-center font-weight-bolder h3">PREÇO</label>
                    <input name="precoProduto" value="${produto.precoProduto}" class="form-control-lg col-4" type="email">
                </div>
                <div class="row col-6 justify-content-start">
                    <label class="col-4 align-self-center font-weight-bolder h3">CATEGORIA</label>
                    <input name="categoria" value="${produto.categoria}" class="form-control-lg col-7" type="email">
                </div>
            </div>
            <div class="form-group row justify-content-start">
                <div class="row col-12 justify-content-center">
                    <label class="col-3 align-self-start font-weight-bolder h3">DESCRIÇÃO</label>
                    <textarea name="descricao" value="${produto.descricao}" class="col-8" rows="9"></textarea>
                </div>

            </div>

            <div class="container-fluid">
                <div class="row mt-5 justify-content-around">
                    <div class="row col-12 mt-5 justify-content-around">
                        <a class="btn btn-lg btn-danger col-5  font-weight-bolder h4 pb-2 pt-2" 
                           href="AlterarProduto">ALTERAR PRODUTO</a>
                        
                        <a class="btn btn-lg btn-danger col-5  font-weight-bolder h4 pb-2 pt-2"  
                           href="index.jsp">CANCELAR</a>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>