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
        Integer id_produto = Integer.parseInt(request.getParameter("id_produto"));
        Produto produto = ProdutoDAO.obterProduto(id_produto);

        request.setAttribute("produto", produto);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/protegido/alterarProduto.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id_produto = Integer.parseInt(request.getParameter("id_produto"));
        String nomeProduto = request.getParameter("nomeProduto");
        Long precoProduto = Long.parseLong(request.getParameter("precoProduto"));
        String categoria = request.getParameter("categoria");
        String descricao = request.getParameter("descricao");
               
        Produto produto = ProdutoDAO.obterProduto(id_produto);
        produto.setNomeProduto(nomeProduto);
        produto.setPrecoProduto(precoProduto);
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
