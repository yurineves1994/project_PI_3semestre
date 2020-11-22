package br.senac.br.servelet;

import br.senac.br.entidades.Vendedor;
import br.senac.sp.dao.FuncionarioDAO;
import br.senac.sp.dao.ProdutoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yurin
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        Vendedor usuario = FuncionarioDAO.obterVendedor(login, senha);
        if (usuario == null) {
            
        
        } else {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuario", usuario);
            response.sendRedirect(request.getContextPath() + "/protegido/index.jsp");
        }

    }

}
