/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.controller;

import com.cac.pojo.Orator;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cac.dao.OratorDAO;

/**
 *
 * @author Tomas
 */
@WebServlet("/DeleteOratorController")
public class DeleteOratorController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
       
        OratorDAO dao = new OratorDAO();

        dao.deleteOrator(id);

        resp.sendRedirect(req.getContextPath());

    }
}
