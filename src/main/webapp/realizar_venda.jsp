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
                <a href="index.jsp"><img class="" src="img/logo.PNG" alt=""> </a>
            </div>
            <div class="col-5 mt-4">
                <h1 class=" display-4 font-weight-bolder">REALIZAR VENDA</h1>
            </div>
        </div>
        <form class="container-fluid mt-5" action="RealizarVenda" method="POST">
            <div class="form-group row justify-content-center">
                <label class="col-4 align-self-center font-weight-bolder h3 text-danger mr-n5">ID CLIENTE</label>

                <select name="id_cliente" class="form-control-lg col-8 ml-n5" type="text">
                    <c:forEach items="${listaClientes}" var="cliente">
                        <option value="${cliente.id_cliente}">${cliente.nome_cliente}</option>
                    </c:forEach>
                </select> 

            </div>
            <div class="form-group row justify-content-center">
                <label class="col-4 align-self-center font-weight-bolder h3 text-danger mr-n5">NOME VENDEDOR</label>
                <select class="form-control-lg col-8 ml-n5" name="id_vendedor" >
                    <option value="1">Ian Procopio</option>
                    <option value="2">João Finasterido</option>
                    <option value="3">Pedro</option>
                    
                </select>
            </div>

            <div class="form-group row justify-content-around">
                <div class="row col-8 justify-content-center">

                    <label class="col-5 align-self-center font-weight-bolder h3 text-danger" >NOME DO PRODUTO</label>

                    <select class="form-control-lg col-6" name="id_produto">
                        <c:forEach items="${listaProdutos}" var="produto">
                            <option value="${produto.id_produto}">${produto.nomeProduto}</option>
                        </c:forEach>
                    </select>

                </div>
                <div class="row col-4 justify-content-center">
                    <label class="col-6 align-self-center font-weight-bolder h3 text-danger">QUANTIDADE</label>
                    <input name="qtdVenda" class="form-control-lg col-4" type="number">
                </div>               
            </div>
            &nbsp;   
            <div class="container-fluid">
                <div class="row mt-5 justify-content-around">
                    <input class="btn btn-lg btn-danger col-5 font-weight-bolder h3 pb-2 pt-2" type="submit"
                           value="REALIZAR VENDA">
                    <a href="index.jsp" class="btn btn-lg btn-danger col-5  font-weight-bolder h3 pb-2 pt-2"
                       >CANCELAR</a>
                </div>
            </div>
        </form>

    </body>
</html>
