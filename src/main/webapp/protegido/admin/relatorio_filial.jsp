<%-- 
    Document   : relatorios
    Created on : 08/10/2020, 18:57:56
    Author     : yurin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mangá Store</title>
    </head>
    <body>
        <div class="container-fluid row mt-5 justify-content-around">
            <div class="col-5 ">
                <a href="<c:url value="/protegido/index.jsp"/>"/><img class="" src="<c:url value="/img/logo.PNG"/>"> </a>
            </div>
            <div class="col-6 mt-4">
                <h1 class=" display-5 font-weight-bolder">RELATORIO DE VENDA/FILIAL</h1>
            </div>
        </div>
        <div class="table-reponsive container-fluid mt-3">
            <table class="table table-bordered mt-3 table-hover">
                <thead>

                    <tr>
                        <th class="font-weight-bolder text-danger text-center h5">FILIAL</th>                       
                        <th class="font-weight-bolder text-danger text-center h5">VENDEDOR</th>
                        <th class="font-weight-bolder text-danger text-center h5">PRODUTO</th>
                        <th class="font-weight-bolder text-danger text-center h5">QUANTIDADE</th>
                        <th class="font-weight-bolder text-danger text-center h5">DATA</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${relatorioPorFilial}" var="relatorio">
                        <tr>
                            <td>${relatorio.filial}</td>
                            <td>${relatorio.vendedor}</td>
                            <td>${relatorio.produto}</td>
                            <td>${relatorio.qtdVenda}</td>
                            <td>${relatorio.data_venda}</td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>

        </div>
    </body>
</html>
