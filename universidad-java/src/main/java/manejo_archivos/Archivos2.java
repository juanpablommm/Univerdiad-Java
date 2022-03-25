package manejo_archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos2 {

    public static void createText(String nombre) {
        // para trabajar conarchivos necesitamos utilizar la clase
        // File del package java.io (in -out)
        /*otra forma de crear el archivo es con la misma clase File 
         * donde creo mi objeto de tipo faile pasandole la la ruta+nombre
         * y comrpuebo si exite el archivo o directorio, en el caso de que no
         * exite creo un archivo con el metodo createNewFile() el cual me devuelve
         * true o false si se creo el archivo*/
        File file = new File(nombre);
        if(!file.exists()) {
            try {
                System.out.println((file.createNewFile())? "archivo creado" : "no se puedo crear el archivo");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("El archivo ya existe");
        }
    }

    /*a traves del metodo mkdir podemos crear una carptea */
    public static void createFolder(String pathName) {
        File file = new File(pathName);
        if (!file.exists()) {
            System.out.println((file.mkdir()) ? "la carpeta ha sido creada" : "no se puedo crear la carpeta");
        }else {
            System.out.println("la carpeta ya existe");
        }
    }

    public static void getInformation(String pathName) {
        File file = new File(pathName);
        if (file.exists()) {
            System.out.println("nombre: " + file.getName());//obtenemos el nombre del archivo o carpeta
            System.out.println("Path: " + file.getAbsolutePath());//obtenemos la ruta 
            System.out.println("tamaño: " + file.length() + " bytes");//obtenemos el tamaño devuelve cero si no existe y un valor indeterminado para un folder
        }else {
            System.out.println("el archivo no existe");
        }
    }
}
