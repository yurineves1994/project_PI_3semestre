<%-- 
    Document   : alterarCliente
    Created on : 17/10/2020, 20:40:18
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
            <div class="col-4 ">
                <img class="" src="img/logo.PNG" alt="">
            </div>
            <div class="col-7 mt-4">
                <h1 class=" display-5 font-weight-bolder">ALTERAR CLIENTE: ${cliente.nome_cliente}</h1>
            </div>
        </div>
        <form class="container-fluid mt-5" action="AlterarCliente" method="POST">
            <div class="form-group row justify-content-center">
                <label class="col-1 align-self-center font-weight-bolder h4">NOME</label>
                <input name="nome" value="${cliente.nome_cliente}" class="form-control-lg col-10" type="text" required="true">
            </div>
            <div class="form-group row justify-content-center">
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">CPF</label>
                    <input name="cpf" value="${cliente.cpf}" class="form-control-lg col-9" type="number" required="true">
                </div>
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">RG</label>
                    <input name="rg" value="${cliente.rg}" class="form-control-lg col-10" type="number" required="true">
                </div>
            </div>
            <div class="form-group row justify-content-center">
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">E-MAIL</label>
                    <input name="email" value="${cliente.email}" class="form-control-lg col-9" type="email" required="true">
                </div>
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">TEL.</label>
                    <input name="telefone" value="${cliente.telefone}" class="form-control-lg col-10" type="tel" required="true">
                </div>
            </div>
            <div class="form-group row justify-content-center">

            </div>
            <div class="form-group row justify-content-start ml-2">
                <label class="col-3 align-self-center font-weight-bolder h4 mr-n4">DATA DE NASCIMENTO</label>
                <input name="dataNascimento" value="${cliente.dataNascimento}" class="form-control-lg col-3 " type="date" value="dd/mm/aaaa" required="true">
            </div>
            <div class="form-group row justify-content-around">
                <div class="row col-6 justify-content-between">
                    <label class="col-1 align-self-center font-weight-bolder h4">ENDEREÇO</label>
                    <input name="endereco" value="${cliente.endereco}" class="form-control-lg col-9" type="text" required="true">
                </div>
                <div class="row col-2 justify-content-between">
                    <label class="col-1 align-self-center font-weight-bolder h4">N°</label>
                    <input name="numero" value="${cliente.numero}" class="form-control-lg col-9" type="number" required="true">
                </div>
                <div class="row col-3 justify-content-around">
                    <label class="col-4 align-self-center font-weight-bolder h4">ESTADO</label>
                    <input name="estado" value="${cliente.estado}" class="form-control-lg col-7" type="text" required="true">
                </div>
            </div>

            <div class="container-fluid">
                <div class="row mt-5 justify-content-around">
                    <button class="btn btn-lg btn-danger col-5 font-weight-bolder h4 pb-2 pt-2" 
                            type="submit">ALTERAR CLIENTE</button>

                        <a class="btn btn-lg btn-danger col-5 font-weight-bolder h4 pb-2 pt-2" 
                           href="index.jsp">CANCELAR</a>
                </div>
            </div>
        </form>
    </body>
</html>
