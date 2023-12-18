/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.controller;

import com.cac.dao.OratorDAO;
import com.cac.pojo.Orator;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tomas
 */
@WebServlet("/UpdateOratorController")
public class UpdateOratorController extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Retrieve parameters from the form
        int id = Integer.parseInt(req.getParameter("staticId"));
        String firstname = req.getParameter("inputFirstname");
        String lastname = req.getParameter("inputLastname");
        String email = req.getParameter("inputEmail");
        String topic = req.getParameter("inputTopic");

        // Crear OratorDAO
        OratorDAO dao = new OratorDAO();
        // Crear Orator
        Orator orator = new Orator(7,firstname,lastname,email,topic);

        //invocar actualizarProducto(params)
        dao.updateOrator(orator);

        //ir a la siguiente pagina
        resp.sendRedirect(req.getContextPath());
    }
}
