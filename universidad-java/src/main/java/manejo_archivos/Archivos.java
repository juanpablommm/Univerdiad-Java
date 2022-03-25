package manejo_archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {

    public static void createText(String nombre) {
        // para trabajar conarchivos necesitamos utilizar la clase
        // File del package java.io (in -out)
        File file = new File(nombre);
        try {
            /*la clase printWriter nos permite imprimir representaciones formateadas
             * de objetos en un archivo de texto
             * Primero creamos un obejto de esta clase, podemos pasarle por parametro
             * directamente el nombre del Arhivo o pasarle un obejto
             * File que apunte a nuestro archivo
             * de ahy en mas para pra hacer una representacion de un objeto dado 
             * su flujo de salido utilizamos tres metodos, print que nos imprimira
             * en el arhivo de texto una representacion de nuestro objeto, ya sea
             * un string, integer, variablesObjectos, como si utilizaramos la consola
             * pero no obtendremos un salto de linea una ves escritoS.
             * 
             * *tambien podemos usar el metodo println para hacer lo mismo pero 
             * con un salto de liena 
             * 
             * o podemos usar printf que imprimira dado el formato que especifiquemos
             * pero no tendra salto de linea*/
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.close();
            System.out.println("Se ha cread el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void write(String nombreArchivo, String line) {
        File file = new File(nombreArchivo);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(line);
            printWriter.close();
            System.out.println("se ha escrito: " + line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void addInformation(String nombreArchivo, String line) {
        File file = new File(nombreArchivo);
        try {
            /*otra forma de escribir archivos es con la clase FileWriter, y leerlos
             * con FileReader, como vamos a escribir en un archivo ya existente 
             * al crear el objeto FileWriter le pasamos como segundo parametro 
             * un boolean con el valor de tru, indicando que vamos a escribir
             * texto en un fiel que ya exite, 
             * en este caso como escribimos representaciones de objetos con
             * la clase PrintWriter, la seguimos usando solo que al crear un obejto
             * de esta clase le pasamos como parametro un FileWriter y en el
             * pasamos el File que venga por parametro mas el valor de true
             * para indicar que camos a escribir mas texto, de los contrario
             * borraria todo el texto que contenga el archivo y solo lo sobreescribirira*/
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println(line);
            printWriter.close();
            System.out.println("se ha escrito: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
