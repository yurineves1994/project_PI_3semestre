
package br.senac.br.servelet;

import br.senac.sp.dao.ProdutoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yurin
 */
public class DeletarProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id_produto = Integer.parseInt(request.getParameter("id_produto"));
       try {
           ProdutoDAO.deleteProduto(id_produto);
           response.sendRedirect("sucesso.jsp");
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(DeletarCliente.class.getName()).log(Level.SEVERE, null, ex);
           response.sendRedirect("tela_falha.jsp");
       } 
        
    }
}
