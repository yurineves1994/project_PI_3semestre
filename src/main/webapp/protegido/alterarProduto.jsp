<%-- 
    Document   : alterarProduto
    Created on : 17/10/2020, 21:04:08
    Author     : yurin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mangá Store</title>
    </head>
    <body>
        <div class="container-fluid row mt-5 justify-content-around">
            <div class="col-4 ">
                <a href="index.jsp"><img class="" src="img/logo.PNG" alt=""> </a>
            </div>
            <div class="col-7 mt-4">
                <h1 class=" display-5 font-weight-bolder">ALTERAR PRODUTO:${produto.id_produto}</h1>
            </div>
        </div>
        <form class="container-fluid mt-5" action="AlterarProduto" method="POST">
            <div class=" form-group row justify-content-center">
                <div class=" row col-7 justify-content-around">
                    <label class="col-3 align-self-center font-weight-bolder h3">NOME DO PRODUTO</label>
                    <input name="nomeProduto" value="${produto.nomeProduto}" class="form-control-lg col-8" type="text">
                </div>
                <div class="row col-3 justify-content-center">
                    <label class="col-8 align-self-center font-weight-bolder h3">ID PRODUTO</label>
                    <input name="id_produto" value="${produto.id_produto}" class="form-control-lg col-3" readonly=“true”>
                </div>
            </div>
            <div class="form-group row justify-content-center">
                <div class="row col-6 justify-content-around">
                    <label class="col-3 align-self-center font-weight-bolder h3">PREÇO</label>
                    <input name="precoProduto" value="${produto.precoProduto}" class="form-control-lg col-4" type="number">
                </div>
                <div class="row col-6 justify-content-start">

                    <label class="col-4 align-self-center font-weight-bolder h3">CATEGORIA</label>
                    <select class="form-control-lg col-4" name="categoria" value="${produto.categoria}">
                        <option value="Manga">Mangá</option>
                        <option value="Colecionaveis">Colecionaveis</option>
                        <option value="Camisetas">Camisetas</option>

                    </select>
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
                        <button class="btn btn-lg btn-danger col-5 font-weight-bolder h4 pb-2 pt-2" 
                                type="submit">ALTERAR PRODUTO</button>

                        <a class="btn btn-lg btn-danger col-5 font-weight-bolder h4 pb-2 pt-2" 
                           href="index.jsp">CANCELAR</a>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>