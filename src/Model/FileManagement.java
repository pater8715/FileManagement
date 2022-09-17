
package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileManagement {
    
    
    private File file;
    private FileWriter write_file;
    private String name_file;

    public FileManagement() {
        this.name_file = "";
        this.file = null;
        this.write_file = null;
        
    }

    public String getName_file() {
        return name_file;
    }

    public void setName_file(String name_file) {
        this.name_file = name_file;
    }
    
    public String create_file(String name_file){
        setName_file(name_file);
        String message = "";
        this.file = new File(getName_file());
        if(!this.file.exists()){
            try {
                this.file.createNewFile();
                message = "Archivo creado";
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else{
            message="El archivo ya existe";
        }
        return message;
    }
    public void FielDelet(String name_file) {
        String message ="";
    }
    
    
    
}
