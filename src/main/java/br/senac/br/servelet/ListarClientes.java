package br.senac.br.servelet;

import br.senac.br.entidades.Clientes;
import br.senac.sp.dao.ClienteDAO;
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
public class ListarClientes extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Clientes> listaClientes = ClienteDAO.listarClientes();

        request.setAttribute("listaClientes", listaClientes);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/listarCliente.jsp");
        requestDispatcher.forward(request, response);
    }

}
