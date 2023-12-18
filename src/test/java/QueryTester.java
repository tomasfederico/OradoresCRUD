
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

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ClassNotFoundException, InstantiationException, InstantiationException, IllegalAccessException, InstantiationException, InstantiationException, IllegalAccessException, InstantiationException, IllegalAccessException {

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
        // pruebas de actualizacion de parametros
        /*try {
            Orator orator = dao.getOratorById(7);
            System.out.println(orator.getId());
            System.out.println(orator.getFirstName());
            System.out.println(orator.getLastname());
            System.out.println(orator.getEmail());
            System.out.println(orator.getTopic());
            System.out.println("Ahora a modificarlo...!");
            System.out.println("Creando orator auxiliar...asigno el id=7");
            Orator editedOrator = new Orator(7,"JUAN", "PEREZ", "JPEREZ@GMAIL.COM", "FULLSTACK PYTHON 1");
            System.out.println("Actualizando orator ...");
            dao.updateOrator(editedOrator);
            System.out.println("Actualizado!");
            
            System.out.println("Ahora vuelvo a leer el valor!");
            orator = dao.getOratorById(7);
            System.out.println(orator.getId());
            System.out.println(orator.getFirstName());
            System.out.println(orator.getLastname());
            System.out.println(orator.getEmail());
            System.out.println(orator.getTopic());

        } catch (NullPointerException ex) {
            Logger.getLogger(GetAllOratorsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                // pruebas de agregar orador
        try {
            Orator orator = new Orator("MICAELA","IBANEZ","MI@GMAIL.COM","INTRODUCCION A PYTHON");
            dao.addOrator(orator);            
            System.out.println("Ahora PASO a leer el valor!");
            orator = dao.getOratorById(12);
            System.out.println(orator.getId());
            System.out.println(orator.getFirstName());
            System.out.println(orator.getLastname());
            System.out.println(orator.getEmail());
            System.out.println(orator.getTopic());

        } catch (NullPointerException ex) {
            Logger.getLogger(GetAllOratorsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(QueryTester.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }

}
