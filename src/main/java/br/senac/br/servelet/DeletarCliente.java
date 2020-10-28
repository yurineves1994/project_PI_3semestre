/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.br.servelet;

import br.senac.sp.dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
public class DeletarCliente extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long cpf = Long.parseLong(request.getParameter("cpf"));
       try {
           ClienteDAO.deleteCliente(cpf);
           response.sendRedirect("sucesso.jsp");
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(DeletarCliente.class.getName()).log(Level.SEVERE, null, ex);
           response.sendRedirect("tela_falha.jsp");
       } 
        
    }
}
