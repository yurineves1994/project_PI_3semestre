<%-- 
    Document   : listarProdutos
    Created on : 15/10/2020, 20:59:28
    Author     : yurin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <h1 class=" display-4 font-weight-bolder">LISTAR PRODUTO</h1>
            </div>
        </div>
        <table class="table table-bordered mt-3 table-hover">
            <thead class="thead-dark">
                <tr>
                    <th>ID PRODUTO</th>
                    <th>NOME DO PRODUTO</th>
                    <th>PREÇO</th>
                    <th>QUANTIDADE</th>
                    <th>CATEGORIA</th>
                    <th>DESCRIÇÃO</th>
                    <th colspan="2" style="text-align: center">BOTÕES</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${listaProdutos}" var="produto">
                <tr>
                    <td>${produto.id_produto}</td>
                    <td>${produto.nomeProduto}</td>
                    <td>${produto.precoProduto}</td>
                    <td>${produto.quantidade}</td>
                    <td>${produto.categoria}</td>
                    <td>${produto.descricao}</td>

                    <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="AlterarProduto?id_produto=${produto.id_produto}">ATUALIZAR</a></td>
                    <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="DeletarProduto?id_produto=${produto.id_produto}">EXCLUIR</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
