<%-- 
    Document   : listarProdutos
    Created on : 15/10/2020, 20:59:28
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
        <h1>Lista de Produtos</h1>
        <table class="table table-md table-bordered">
            <thead>
                <tr>
                    <th>Nome do produto</th>
                    <th>Preço</th>
                    <th>Quantidade disponivel</th>
                    <th>Categoria</th>
                    <th>Descricao</th>
                    <th>Disponivel?</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${listaProdutos}" var="produto">
                <tr>
                    <td>${produto.nomeProduto}</td>
                    <td>${produto.precoProduto}</td>
                    <td>${produto.quantidade}</td>
                    <td>${produto.categoria}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.disponivel}</td>
                    <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="ReporEstoque?${produto.nomeProduto}">ReporEstoque</a></td>
                    <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="ExcluirProduto?${produto.nomeProduto}">ReporEstoque</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
