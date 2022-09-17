
package filemanagement;
import Model.FileManagement;
/**
 *
 * @author A59-1-1022-015
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FileManagement file_1 = new FileManagement();
        System.out.println(file_1.create_file("Ejemplo.txt"));
    }
    
}
