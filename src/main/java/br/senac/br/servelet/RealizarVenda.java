package br.senac.br.servelet;

import br.senac.br.entidades.Vendas;
import br.senac.sp.dao.VendasDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizarVenda extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_cliente = request.getParameter("id_cliente");
        Integer id_vendedor = Integer.parseInt(request.getParameter("id_vendedor"));
        String id_produto = request.getParameter("id_produto");
        String qtdVenda = request.getParameter("qtdVenda");       
              
        Vendas venda = new Vendas();
        
        venda.getCliente().setId_cliente(Integer.parseInt(request.getParameter("id_cliente")));
        venda.getVendedor().setId_vendedor(Integer.parseInt(request.getParameter("id_vendedor")));
        venda.getProduto().setId_produto(Integer.parseInt(request.getParameter("id_produto")));
        venda.setQtdVenda(Integer.parseInt(request.getParameter("qtdVenda")));
        java.util.Date data = new Date();
        venda.setData_venda(data);
        try {
            VendasDAO.addVenda(venda);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
            response.sendRedirect("tela_falha.jsp");
        }
    }
}


