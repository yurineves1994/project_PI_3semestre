
package br.senac.br.servelet;

import br.senac.br.entidades.Clientes;
import br.senac.sp.dao.ClienteDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarCliente extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        Long cpf = Long.parseLong(request.getParameter("cpf"));
        Long rg = Long.parseLong(request.getParameter("rg"));
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String dataNascimento = request.getParameter("dataNascimento");
        String endereco = request.getParameter("endereco");
        Integer numero = Integer.parseInt(request.getParameter("numero"));
        String estado = request.getParameter("estado");
        
        Clientes cliente = new Clientes(nome, cpf, rg,telefone,email,dataNascimento,endereco,numero,estado);
        try {
            ClienteDAO.addCliente(cliente);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            response.sendRedirect("tela_falha.jsp");
        }
    }

}
