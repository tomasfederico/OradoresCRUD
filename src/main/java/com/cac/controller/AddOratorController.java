/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.controller;

/**
 *
 * @author Tomas
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cac.dao.OratorDAO;
import com.cac.pojo.Orator;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;

public class AddOratorController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String topic = req.getParameter("topic");

        // Preparing Orator and DAO  
        Orator orator = new Orator(firstname, lastname, email, topic);
        OratorDAO dao = new OratorDAO();
        // DAO adds new Orator
        try {
            dao.addOrator(orator);
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | NullPointerException | SQLException e)  {
        }
        resp.sendRedirect(req.getContextPath() + "api/ListadoController");
    }

}
