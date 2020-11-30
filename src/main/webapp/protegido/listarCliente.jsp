<%-- 
Document   : listarCliente
Created on : 15/10/2020, 20:18:13
Author     : yurin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <div class="col-5 ">
                <a href="<c:url value="/index.jsp"/>" <img class="" src="<c:url value="/img/logo.PNG"/>" alt=""> </a>
            </div>
            <div class="col-6 mt-4">
                <h1 class=" display-4 font-weight-bolder">LISTAR CLIENTE</h1>
            </div>
        </div>
        <table class="table table-bordered mt-3 table-hover">
            <thead class="thead-dark">
                <tr>
                    <th>ID CLIENTE</th>
                    <th>NOME</th>
                    <th>CPF</th>
                    <th>RG</th>
                    <th>TELEFONE</th>
                    <th>EMAIL</th>
                    <th>ENDEREÇO</th>
                    <th>NUMERO</th>
                    <th>ESTADO</th>
                        <c:if test="${sessionScope.usuario.admin}">
                        <th style="text-align: center" colspan="2">BOTOÕES</th>
                        </c:if>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaClientes}" var="cliente">
                    <tr>
                        <td>${cliente.id_cliente}</td>
                        <td>${cliente.nome_cliente}</td>
                        <td>${cliente.cpf}</td>
                        <td>${cliente.rg}</td>
                        <td>${cliente.telefone}</td>
                        <td>${cliente.email}</td>
                        <td>${cliente.endereco}</td>
                        <td>${cliente.numero}</td>
                        <td>${cliente.estado}</td>
                        <c:if test="${sessionScope.usuario.admin}">
                            <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="<c:url value="/AlterarCliente?cpf=${cliente.cpf}"/>">Alterar</a></td>
                            <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="<c:url value="/DeletarCliente?cpf=${cliente.cpf}"/>">Excluir</a></td>
                        </c:if>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
