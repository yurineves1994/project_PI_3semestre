package br.senac.br.servelet;

import br.senac.br.entidades.Produto;
import br.senac.sp.dao.ProdutoDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yurin
 */
public class CadastrarProduto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomeProduto = request.getParameter("nomeProduto");
        Long precoProduto = Long.parseLong(request.getParameter("precoProduto"));
        Long quantidade = Long.parseLong(request.getParameter("quantidade"));
        String categoria = request.getParameter("categoria");
        String descricao = request.getParameter("descricao");

        Produto produtos = new Produto(nomeProduto, precoProduto, quantidade, categoria, descricao);
        try {
            ProdutoDAO.addProduto(produtos);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            response.sendRedirect("tela_falha.jsp");
        }
    }
}
