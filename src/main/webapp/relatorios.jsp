<%-- 
    Document   : relatorios
    Created on : 08/10/2020, 18:57:56
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
        <div class="col-5 ">
            <img class="" src="img/logo.PNG" alt="">
        </div>
        <div class="col-6 mt-4">
            <h1 class=" display-5 font-weight-bolder">GERAR RELATORIO DE VENDA</h1>
        </div>
    </div>
    <div class="container-fluid mt-5">
        <div class="row justify-content-center">
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" value="venda_produto">
                <label class="form-check-label align-self-center font-weight-bolder h5">VENDA POR
                    PRODUTO</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" value="venda_vendedor">
                <label class="form-check-label align-self-center font-weight-bolder h5">VENDA POR
                    VENDEDOR</label>
            </div>
        </div>
    </div>
    <div class="table-reponsive container-fluid mt-3">
        <table class="table table-md table-bordered">
            <thead>
                <tr>
                    <th class="font-weight-bolder text-danger text-center h5">ID</th>
                    <th class="font-weight-bolder text-danger text-center h5">NOME</th>
                    <th class="font-weight-bolder text-danger text-center h5">QUANTIDADE</th>
                    <th class="font-weight-bolder text-danger text-center h5">VALOR TOTAL</th>
                </tr>
            </thead>

        </table>

    </div>
    </body>
</html>
