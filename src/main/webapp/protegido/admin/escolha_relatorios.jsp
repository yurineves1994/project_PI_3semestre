<%-- 
    Document   : escolha_relatorios
    Created on : 28/10/2020, 01:30:41
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
        <div class="container row justify-content-between">
            <div class="row justify-content-between col-7 mb-5 mt-5 offset-4">
                <a href="index.jsp"><img class=" col-12" src="../img/logo.PNG" alt=""> </a>
            </div>
            <div class="row col-10 offset-2 justify-content-between mb-5 mt-5">
                <a href="<c:url value="/RelatorioPorFilial"/>" class="btn btn-lg btn-danger col-12 font-weight-bolder h1 pb-3 pt-3">RELATORIO POR FILIAL</a>
                <a href="<c:url value="/RelatorioPorCliente"/>" class="btn btn-lg btn-danger col-12 font-weight-bolder h1 pb-3 pt-3">RELATORIO POR CLIENTE</a>
                <a href="<c:url value="/RelatorioCategoriaProduto"/>" class="btn btn-lg btn-danger col-12 font-weight-bolder h1 pb-3 pt-3">RELATORIO POR CATEGORIA DE PRODUTO</a>
                <a href="/protegido/index.jsp" class="btn btn-lg btn-danger col-12 font-weight-bolder h1 pb-3 pt-3">VOLTAR</a>
                
            </div>

        </div>
    </body>
</html>
