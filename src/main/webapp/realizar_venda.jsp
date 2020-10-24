<%-- 
    Document   : realizar_venda
    Created on : 08/10/2020, 18:57:27
    Author     : yurin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mangá Store</title>
    </head>

    <body>
        <div class="container-fluid row mt-5 justify-content-around">
            <div class="col-5 ">
                <img class="" src="img/logo.PNG" alt="">
            </div>
            <div class="col-5 mt-4">
                <h1 class=" display-4 font-weight-bolder">REALIZAR VENDA</h1>
            </div>
        </div>
        <form class="container-fluid mt-5" action="RealizarVenda" method="POST">
            <div class="form-group row justify-content-center">
                <label class="col-4 align-self-center font-weight-bolder h3 text-danger mr-n5">NOME DO CLIENTE</label>
                <input name="nome_cliente" class="form-control-lg col-8 ml-n5" type="text">
            </div>
            <div class="form-group row justify-content-center">
                <label class="col-4 align-self-center font-weight-bolder h3 text-danger mr-n5">NOME DO VENDEDOR</label>
                <select class="form-control-lg col-8 ml-n5" name="nome_vendedor">
                    <option value="Ian Procopio">Ian Procopio</option>
                    <option value="João Finasterido">João Finasterido</option>
                    <option value="Pedro">Pedro</option>
                    <option value="Fabricio Buarque">Fabricio Buarque</option>
                    <option value="Fernando Fuande">Fernando Fuande</option>
                    <option value="Luiza Gueder">Luiza Gueder</option>
                    <option value="Tomaz Admiltom">Tomaz Admiltom</option>
                </select>
            </div>

            <div class="form-group row justify-content-around">
                <div class="row col-7 justify-content-around">

                    <label class="col-6 align-self-center font-weight-bolder h3 text-danger" >NOME DO PRODUTO</label>

                    <select class="form-control-lg col-6" name="nomeProduto">
                        <c:forEach items="${listaProdutos}" var="produto">
                            <option>${produto.nomeProduto}</option>
                        </c:forEach>
                    </select>

                </div>
                <div class="row col-3 justify-content-around">
                    <label class="col-8 align-self-center font-weight-bolder h3 text-danger">QUANTIDADE</label>
                    <input name="qtdVenda" class="form-control-lg col-3" type="number">
                </div>
                <div class="row col-2 justify-content-center">
                    <a href="#" class="btn btn-lg btn-danger col-12 AdicionarACompra?nome_cliente=${nome_cliente}" font-weight-bolder h2 pb-2 pt-2 ml-n5">ADICIONAR</a>
                </div>
            </div>

            <div class="form-group row justify-content-end">

                <div class="row col-2 justify-content-start mr-4 ml-2">
                    <a href="#" class="btn btn-lg btn-danger col-12 font-weight-bolder h3 ">REMOVER</a>
                </div>
            </div>
            &nbsp;
            <div class="form-group row justify-content-end">
                <span class="col-2 align-self-center font-weight-bolder h3 text-danger">VALOR TOTAL:</span>
                <span class="form-control-lg col-2 mr-3"></span>
            </div>

            <div class="container-fluid">
                <div class="row mt-5 justify-content-around">
                    <input class="btn btn-lg btn-danger col-5  font-weight-bolder h3 pb-2 pt-2" type="submit"
                           value="REALIZAR VENDA">
                    <a href="index.jsp" class="btn btn-lg btn-danger col-5  font-weight-bolder h3 pb-2 pt-2"
                       >CANCELAR</a>
                </div>
            </div>
        </form>

    </body>
</html>
