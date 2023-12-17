
import com.cac.controller.GetAllOratorsController;
import com.cac.dao.OratorDAO;
import com.cac.pojo.Orator;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Tomas
 */
public class QueryTester {

    public static void main(String[] args) {

        OratorDAO dao = new OratorDAO();
        System.out.println("*** CREE AL DAO ***");

        // get orators from database
        List<Orator> orators = null;
        System.out.println("*** CREE A UNA LISTA DE ORADORES NULa ***");
        try {
            orators = dao.getAllOrators();
            System.out.println("*** TRAJE LOS ORADORES DEL DAO ***");
            int size = orators.size();
            System.out.println("*** TAMANIO DE LISTADO ***");
            for (Orator orator : orators) {
                System.out.println(orator.getId());
            }
        } catch (SQLException | NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(GetAllOratorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
