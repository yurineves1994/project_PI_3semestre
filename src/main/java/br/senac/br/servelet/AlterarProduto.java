package br.senac.br.servelet;

import br.senac.br.entidades.Produto;
import br.senac.sp.dao.ProdutoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlterarProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomeProduto = request.getParameter("nomeProduto");
        Produto produto = ProdutoDAO.obterProduto(nomeProduto);

        request.setAttribute("produto", produto);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/alterarProduto.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomeProduto = request.getParameter("nomeProduto");
        Long precoProduto = Long.parseLong(request.getParameter("precoProduto"));
        Long quantidade = Long.parseLong(request.getParameter("quantidade"));
        String categoria = request.getParameter("categoria");
        String descricao = request.getParameter("descricao");

        Produto produto = ProdutoDAO.obterProduto(nomeProduto);

        produto.setPrecoProduto(precoProduto);
        produto.setQuantidade(quantidade);
        produto.setCategoria(categoria);
        produto.setDescricao(descricao);

        try {
            ProdutoDAO.updateProduto(produto);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
            response.sendRedirect("tela_falha.jsp");
        }
    }
}
