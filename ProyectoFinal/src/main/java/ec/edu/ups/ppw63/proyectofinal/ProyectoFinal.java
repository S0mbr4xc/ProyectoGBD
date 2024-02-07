package ec.edu.ups.ppw63.proyectofinal;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
/**
 *
 * @author Esteban Córdova
 */
public class ProyectoFinal {

     private static final String URI = "mongodb://localhost:27017"; // URI de conexión a MongoDB

    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create(URI)) {
            MongoDatabase database = mongoClient.getDatabase("mydatabase"); // Nombre de la base de datos
            System.out.println("Conexión exitosa a la base de datos: " + database.getName());
        } catch (Exception e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
