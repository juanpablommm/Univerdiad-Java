package manejo_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosConBufferWriter {

    /*Al igual que FileWriter la clase BufferWriter nos permite escribir
     * archivos de una manera mas optimizada*/
    
    public static void write(String pathName, String texto) {
        File file = new File(pathName);
        if(file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file, true);//agregar texto 
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                         ){
                bufferedWriter.write(texto);
                bufferedWriter.newLine();// nos permite dar el salto de linea para volver a escribir
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("no existe el archivo: " + pathName);
        }
    }
}
