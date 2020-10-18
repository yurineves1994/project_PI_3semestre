package br.senac.br.servelet;

import br.senac.br.entidades.Produto;
import br.senac.sp.dao.ProdutoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yurin
 */
public class ListarProdutos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Produto> listaProdutos = ProdutoDAO.listarProdutos();

        request.setAttribute("listaProdutos", listaProdutos);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/listarProdutos.jsp");
        requestDispatcher.forward(request, response);
    }

}
