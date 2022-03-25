package manejo_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchivosConBufferReader {

    /*al igual que FileReader la clase 
     * BufferReader nos perite realizar la lectura de un archivo de texto
     * de una manera mas comoda, al implementar el metodo readLine nos merite
     * leer linea por linea del archivo y sin tener que hacer un castin como
     * sucedia con FileReader.
     * 
     * Pero tenemos que haccer uso de ambas clase pra poder lograr
     * esto
     * *
     */
    
    public static void read(String pathName) {
        File file = new File(pathName);
        if(file.exists()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)
                         ){
                String linea = bufferedReader.readLine();/*este metodo nos devuelve cada
                linea del docuemnto, cuando ya no exite mas para leeer devuelver null*/
                int contadorLinea = 1;
                while(linea != null) {
                    System.out.println(contadorLinea + ". " + linea);
                    linea = bufferedReader.readLine();
                    contadorLinea++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("no existe el archivo: " + pathName);
        }
    }
}
