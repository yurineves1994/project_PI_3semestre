<%-- 
    Document   : relatorio_categoria_produto
    Created on : 28/10/2020, 18:23:16
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
            <div class="col-6 mt-4">
                <h1 class=" display-5 font-weight-bolder">RELATORIO DE VENDA/CATEGORIA</h1>
            </div>

        </div>
        <div class="table-reponsive container-fluid mt-3">
            <table class="table table-bordered mt-3 table-hover">
                <thead class="thead-dark">
                    <tr>
                        <th>CATEGORIA</th>
                        <th>CLIENTE</th>
                        <th>VENDEDOR</th>                      
                        <th>QUANTIDADE</th>
                        <th>DATA</th>
                    </tr>
                </thead>
                <tbody>
                    
                    <c:forEach items="${relatorioPorProduto}" var="relatorio">
                        <tr>
                            <td>${relatorio.categoria_produto}</td>
                            <td>${relatorio.cliente}</td>
                            <td>${relatorio.vendedor}</td>
                            <td>${relatorio.qtdVenda}</td>
                            <td>${relatorio.data_venda}</td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>

        </div>
    </body>
</html>
