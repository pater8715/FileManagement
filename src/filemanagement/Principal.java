
package filemanagement;
import Model.FileManagement;
import java.io.IOException;
/**
 *
 * @author A59-1-1022-015
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       FileManagement file_1 = new FileManagement();
        System.out.println(file_1.create_file("Ejemplo.txt"));
        file_1.append_to_file("\n Hola Clase Insertando segunda entrada de datos");
    }
    
}
