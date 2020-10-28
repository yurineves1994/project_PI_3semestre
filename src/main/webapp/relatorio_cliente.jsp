<%-- 
    Document   : relatorio_cliente
    Created on : 28/10/2020, 18:23:33
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
        <div class="container-fluid row mt-5 justify-content-around">
            <div class="col-5 ">
                <a href="index.jsp"><img class="" src="img/logo.PNG" alt=""> </a>
            </div>
            <div class="col-6 mt-4">
                <h1 class=" display-5 font-weight-bolder">RELATORIO DE VENDA/CLIENTE</h1>
            </div>
        </div>
        <div class="table-reponsive container-fluid mt-3">
            <table class="table table-bordered mt-3 table-hover">
                <thead>
                    <tr>
                        <th class="font-weight-bolder text-danger text-center h5">ID</th>
                        <th class="font-weight-bolder text-danger text-center h5">NOME</th>
                        <th class="font-weight-bolder text-danger text-center h5">QUANTIDADE</th>
                        <th class="font-weight-bolder text-danger text-center h5">VALOR TOTAL</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${listaClientes}" var="cliente">
                    <tr>
                        <td></td>
                        <td></td
                        <td></td>
                        <td></td>
                    </tr>
                </c:forEach>
                </tbody>

            </table>

        </div>
    </body>
</html>
