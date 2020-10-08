<%-- 
    Document   : cadastro_cliente
    Created on : 08/10/2020, 18:56:53
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
   <div class="container-fluid row mt-5 justify-content-around">
        <div class="col-5 ">
            <img class="" src="img/logo.PNG" alt="">
        </div>
        <div class="col-6 mt-4">
            <h1 class=" display-4 font-weight-bolder">CADASTRAR CLIENTE</h1>
        </div>
    </div>
    <div class="container-fluid mt-5">
        <div class="form-group row justify-content-center">
            <label class="col-1 align-self-center font-weight-bolder h3" for="email-usuario">NOME</label>
            <input class="form-control-lg col-10" type="text" id="email-usuario" placeholder="Digite seu nome">
        </div>
        <div class="form-group row justify-content-center">
            <div class="row col-6 justify-content-around">
                <label class="col-1 align-self-center font-weight-bolder h3" for="senha-usuario">CPF</label>
                <input class="form-control-lg col-9" type="email" id="senha-usuario" placeholder="Digite seu CPF">
            </div>
            <div class="row col-6 justify-content-around">
                <label class="col-1 align-self-center font-weight-bolder h3" for="senha-usuario">RG</label>
                <input class="form-control-lg col-9" type="email" id="senha-usuario" placeholder="Digite seu RG">
            </div>
        </div>
        <div class="form-group row justify-content-center">
            <div class="row col-6 justify-content-around">
                <label class="col-2 align-self-center ite font-weight-bolder h3" for="senha-usuario">SEXO</label>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" id="inlineCheckbox1" value="masculino">
                    <label class="form-check-label align-self-center font-weight-bolder h4"
                        for="inlineCheckbox1">MASCULINO</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" id="inlineCheckbox2" value="feminino">
                    <label class="form-check-label align-self-center font-weight-bolder h4"
                        for="inlineCheckbox2">FEMININO</label>
                </div>
            </div>
            <div class="row col-6 justify-content-around">
                <label class="col-1 align-self-center font-weight-bolder h3" for="senha-usuario">TEL.</label>
                <input class="form-control-lg col-9" type="email" id="telefone" placeholder="Digite seu telefone">
            </div>
        </div>
        <div class="form-group row justify-content-center">
            <label class="col-1 align-self-center font-weight-bolder h3" for="email-usuario">E-MAIL</label>
            <input class="form-control-lg col-10" type="text" id="email-usuario" placeholder="Digite seu email">
        </div>
        <div class="form-group row justify-content-start ml-2">
            <label class="col-4 align-self-center font-weight-bolder h3" for="email-usuario">DATA DE NASCIMENTO</label>
            <input class="form-control-lg col-3 " type="date" id="data">
        </div>
        <div class="form-group row justify-content-around">
            <div class="row col-6 justify-content-between">
                <label class="col-1 align-self-center font-weight-bolder h3" for="senha-usuario">ENDEREÇO</label>
                <input class="form-control-lg col-9" type="email" id="senha-usuario" placeholder="Digite seu endereço">
            </div>
            <div class="row col-2 justify-content-between">
                <label class="col-1 align-self-center font-weight-bolder h3" for="senha-usuario">N°</label>
                <input class="form-control-lg col-9" type="email" id="senha-usuario" placeholder="Digite seu numero">
            </div>
            <div class="row col-3 justify-content-around">
                <label class="col-4 align-self-center font-weight-bolder h3" for="senha-usuario">ESTADO</label>
                <input class="form-control-lg col-6" type="email" id="senha-usuario" placeholder="Digite seu estado">
            </div>
        </div>

        <div class="container-fluid">
            <div class="row mt-5 justify-content-around">
                <input class="btn btn-lg btn-danger col-5  font-weight-bolder h3 pb-2 pt-2" type="submit"
                    value="ENTRAR">
                <input class="btn btn-lg btn-danger col-5  font-weight-bolder h3 pb-2 pt-2" type="submit"
                    value="CANCELAR">
            </div>
        </div>
    </div>


    </body>
</html>
