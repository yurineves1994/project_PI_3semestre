/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.br.servelet;

import br.senac.br.entidades.Vendas;
import br.senac.sp.dao.VendasDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizarVenda extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idCliente = request.getParameter("nome_cliente");
        String nomeProduto = request.getParameter("nomeProduto");
        String idVenda = request.getParameter("idVenda");
        Integer id_vendedor = Integer.parseInt(request.getParameter("id_vendedor"));
        String nome_produto = request.getParameter("nome_produto");
        String qtdVenda = request.getParameter("qtdVenda");  
       
        Vendas venda = new Vendas();
        
        venda.getCliente().setNome_cliente(request.getParameter("nome_cliente"));
        venda.getVendedor().setId_vendedor(Integer.parseInt(request.getParameter("id_vendedor")));
        venda.getProduto().setNomeProduto(request.getParameter("nomeProduto"));
        venda.setQtdVenda(Integer.parseInt(request.getParameter("qtdVenda")));
        java.util.Date data = new Date();
        venda.setData_venda(data);
        try {
            VendasDAO.addVenda(venda);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            response.sendRedirect("tela_falha.jsp");
        }
    }
}


