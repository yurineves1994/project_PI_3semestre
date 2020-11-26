/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class RelatorioPorFilial extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Relatorios> relatorioPorFilial = RelatoriosDAO.RelatorioPorFilial();

        request.setAttribute("relatorioPorFilial", relatorioPorFilial);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/protegido/admin/relatorio_filial.jsp");
        requestDispatcher.forward(request, response);
    }
}
