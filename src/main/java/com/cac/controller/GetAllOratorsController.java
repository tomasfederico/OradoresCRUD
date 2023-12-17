package com.cac.controller;

import com.cac.pojo.Orator;
import com.cac.dao.OratorDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/index.html"})
public class GetAllOratorsController extends HttpServlet {
    private static final Logger logger = Logger.getLogger(GetAllOratorsController.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // instantiate DAO.
        OratorDAO dao = new OratorDAO();
        logger.info("*** ENTRE AL DAO ***");

        // get orators from database
        List<Orator> orators = null;
        try {
            orators = dao.getAllOrators();
            int size = orators.size();
            System.out.println("*** Nro de oradores recibido: {}");
        } catch (SQLException | NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(GetAllOratorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // save orators list in request to expose it to the website.
        req.setAttribute("orators", orators);

        // go to next page.
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
