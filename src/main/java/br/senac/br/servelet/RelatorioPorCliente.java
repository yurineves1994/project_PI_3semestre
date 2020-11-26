package br.senac.br.servelet;

import br.senac.br.entidades.Relatorios;
import br.senac.sp.dao.RelatoriosDAO;
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
public class RelatorioPorCliente extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Relatorios> relatorioPorClientes = RelatoriosDAO.RelatorioPorCliente();

        request.setAttribute("relatorioPorClientes", relatorioPorClientes);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/protegido/admin/relatorio_cliente.jsp");
        requestDispatcher.forward(request, response);
    }
}
