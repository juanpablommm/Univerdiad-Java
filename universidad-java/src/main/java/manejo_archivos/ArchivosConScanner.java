package manejo_archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArchivosConScanner {

    /*otra manera que tenemos para leer archivos es con la
     * la clase Scanner, para esto solamente tenemos 
     * que psar al contructor el objeto file que apunta asia
     * el archivo
     * 
     * tambien al igual que un iterator nos valemos del metodo hasNext
     * para saber si el objeto scaner tiene datos para leer, de no haber
     * mas lineas del archivo nos devolvera false
     * 
     * con el metodo next tambien como un iterator podemos obtener cada 
     * palabra del texto, pero no estariamos leyendo liena por liena
     * para ello nos apoyariamos del metodo nextLine, al igual
     * que leer por consola*/
    
    public static void read(String pathName) {
        File file = new File(pathName);
        if(file.exists()) {
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
//                    System.out.println(scanner.next());
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("no existe el archivo: " + pathName);
        }
    }
    
}
