<%-- 
    Document   : listarCliente
    Created on : 15/10/2020, 20:18:13
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
        <h1>Lista de Clientes</h1>
        <table class="table table-md table-bordered">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>RG</th>
                    <th>Sexo</th>
                    <th>Telefone</th>
                    <th>Email</th>
                    <th>Data de Nascimento</th>
                    <th>Endereço</th>
                    <th>Numero</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaClientes}" var="cliente">
                    <tr>
                        <td>${cliente.nome}</td>
                        <td>${cliente.cpf}</td>
                        <td>${cliente.rg}</td>
                        <td>${cliente.sexo}</td>
                        <td>${cliente.telefone}</td>
                        <td>${cliente.email}</td>
                        <td>${cliente.datanascimento}</td>
                        <td>${cliente.endereco}</td>
                        <td>${cliente.numero}</td>
                        <td>${cliente.estado}</td>
                        <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="AlterarCliente?${cliente.cpf}">Alterar</a></td>
                        <td><a class="btn btn-lg btn-danger font-weight-bolder h4 pb-2 pt-2" href="ExcluirCliente?${cliente.cpf}">Excluir</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
