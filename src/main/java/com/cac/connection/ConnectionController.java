/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.connection;

/**
 *
 * @author Tomas
 */
import com.cac.dao.OratorDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionController {

    static Logger logger = LoggerFactory.getLogger(OratorDAO.class);
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/integrador_cac";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "tf.mysql.root";

    public static Connection getConnection() {

        String driverName = "com.mysql.cj.jdbc.Driver";
        /*
		String url = System.getenv("DATASOURCE_URL");
		String user = System.getenv("DATASOURCE_USERNAME");
		String password = System.getenv("DATASOURCE_PASSWORD");
		String driverName = System.getenv("DATASOURCE_DRIVER");
         */
        //control errores
        Connection con = null;
        try {
            Class.forName(driverName);//carga en memoria el Driver
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            logger.info("se crea la conexion");
        } catch (Exception e) {
            e.printStackTrace();//muestra la excepción y el error
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = ConnectionController.getConnection();//f5

        if (con != null) {
            System.out.println("Conexion ok");
        } else {
            System.err.println("Conexion fail");
        }
    }
}
