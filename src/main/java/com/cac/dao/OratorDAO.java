/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.dao;

/**
 *
 * @author Tomas
 */
import com.cac.connection.ConnectionController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.cac.pojo.Orator;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OratorDAO {

    static Logger logger = LoggerFactory.getLogger(OratorDAO.class);

    private static final String SQL_SELECT_ALL = "SELECT * FROM oradores";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM oradores WHERE id = ?";
    private static final String SQL_INSERT = "INSERT INTO oradores(firstname, lastname, email, topic) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE oradores SET firstname = ?, lastname = ?, email = ?, topic = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM oradores WHERE id = ?";

    public Orator getOratorById(int id) {

        //Connection
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;
        Orator orator = null;

        //Statement
        try {
            conn = ConnectionController.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            //VIENE UN SOLO REGISTRO!!!
            if (rs.next()) {
                id = rs.getInt(1);
                String firstname = rs.getString(2);
                String lastname = rs.getString(3);
                String email = rs.getString(4);
                String topic = rs.getString(5);

                //campos crear un objeto????
                orator = new Orator(id, firstname, lastname, email, topic);
            }
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }
        return orator;
    }

    public List<Orator> getAllOrators() throws SQLException, NullPointerException, ClassNotFoundException,
            InstantiationException, IllegalAccessException {

        // Preparing Connection and auxiliary variables.
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Orator> oradores = new ArrayList();
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        System.out.println("DAO: Previo a entrar al try de conexion");
        try {
            conn = ConnectionController.getConnection();
            stmt = conn.createStatement();
            System.out.println("DAO: Creada la conexion");
            rs = stmt.executeQuery(SQL_SELECT_ALL);
            System.out.println("DAO: Se EJECUTO la query");
            while (rs.next()) {

                int idOrador = rs.getInt(1);
                String firstname = rs.getString(2);
                String lastname = rs.getString(3);
                String email = rs.getString(4);
                String topic = rs.getString(5);
                Orator orator = new Orator(idOrador, firstname, lastname, email, topic);
                oradores.add(orator);
            }
            System.out.println("DAO: Se almacenaron los valores de la query en un listado de oradores");

        } catch (SQLException | NullPointerException ex) {
            ex.printStackTrace(System.out);
            ex.getMessage();
            System.out.println("DAO: FALLO LA CONEXION");
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return oradores;
    }

    public int addOrator(Orator orator) throws SQLException, NullPointerException, ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try {
            conn = ConnectionController.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, orator.getFirstName());
            stmt.setString(2, orator.getLastname());
            stmt.setString(3, orator.getEmail());
            stmt.setString(4, orator.getTopic());

            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return registros;
    }

    public int updateOrator(Orator orator) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = ConnectionController.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, orator.getFirstName());
            stmt.setString(2, orator.getLastname());
            stmt.setString(3, orator.getEmail());
            stmt.setString(4, orator.getTopic());
            stmt.setInt(5, orator.getId());
            registros = stmt.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException | NullPointerException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int deleteOrator(int i) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = ConnectionController.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, i);
            registros = stmt.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException | NullPointerException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
