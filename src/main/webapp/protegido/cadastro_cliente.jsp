<%-- 
    Document   : cadastro_cliente
    Created on : 08/10/2020, 18:56:53
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
                <a href="index.jsp"><img class="" src="../img/logo.PNG" alt=""> </a>
            </div>
            <div class="col-6 mt-4">
                <h1 class=" display-4 font-weight-bolder">CADASTRAR CLIENTE</h1>
            </div>
        </div>
        <form class="container-fluid mt-5" action="<c:url value="/CadastrarCliente"/>" method="POST">
            <div class="form-group row justify-content-center">
                <label class="col-1 align-self-center font-weight-bolder h4">NOME</label>
                <input name="nome" class="form-control-lg col-10" type="text" required="true">
            </div>
            <div class="form-group row justify-content-center">
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">CPF</label>
                    <input name="cpf" class="form-control-lg col-9" type="number" required="true">
                </div>
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">RG</label>
                    <input name="rg" class="form-control-lg col-10" type="number" required="true">
                </div>
            </div>
            <div class="form-group row justify-content-center">
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">E-MAIL</label>
                    <input name="email" class="form-control-lg col-9" type="email" required="true">
                </div>
                <div class="row col-6 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">TEL.</label>
                    <input name="telefone" class="form-control-lg col-10" type="tel" required="true">
                </div>
            </div>
            
            <div class="form-group row justify-content-between">
                <div class="row col-6 justify-content-around">
                    <label class="col-2 align-self-center font-weight-bolder h4">ENDEREÇO</label>
                    <input name="endereco" class="form-control-lg col-9 ml-5" type="text" required="true">
                </div>
                <div class="row col-2 justify-content-between">
                    <label class="col-1 align-self-center font-weight-bolder h4">N°</label>
                    <input name="numero" class="form-control-lg col-9" type="number" required="true">
                </div>
                <div class="row col-3 justify-content-around">
                    <label class="col-1 align-self-center font-weight-bolder h4">ESTADO</label>
                    <select class="form-control-lg col-4" name="estado">
                        <option value="AC">AC</option>
                        <option value="AL">AL</option>
                        <option value="AP">AP</option>
                        <option value="AM">AM</option>
                        <option value="BA">BA</option>
                        <option value="CE">CE</option>
                        <option value="DF">DF</option>
                        <option value="ES">ES</option>
                        <option value="GO">GO</option>
                        <option value="MA">MA</option>
                        <option value="MT">MT</option>
                        <option value="MS">MS</option>
                        <option value="MG">MG</option>
                        <option value="PA">PA</option>
                        <option value="PB">PB</option>
                        <option value="PR">PR</option>
                        <option value="PE">PE</option>
                        <option value="PI">PI</option>
                        <option value="RJ">RJ</option>
                        <option value="RN">RN</option>
                        <option value="RS">RS</option>
                        <option value="RO">RO</option>
                        <option value="RR">RR</option>
                        <option value="SC">SC</option>
                        <option value="SP">SP</option>
                        <option value="SE">SE</option>
                        <option value="TO">TO</option>
                    </select>
                </div>
            </div>

            <div class="container-fluid">
                <div class="row mt-5 justify-content-around">
                    <button class="btn btn-lg btn-danger col-5 font-weight-bolder h4 pb-2 pt-2" 
                            type="submit">CADASTRAR CLIENTE</button>

                    <a class="btn btn-lg btn-danger col-5 font-weight-bolder h4 pb-2 pt-2" 
                       href="index.jsp">CANCELAR</a>
                </div>
            </div>
        </form>
    </body>
</html>
