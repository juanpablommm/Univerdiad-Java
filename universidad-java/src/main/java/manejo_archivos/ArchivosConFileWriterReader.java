package manejo_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosConFileWriterReader {

    /*las clase fileWriter tambien nos permite escribir fiecheros de tezto y
     * leerlos, para ello tenemos que crear un objeto de la calse FileWriter
     * psandole como parametro un File o directamente el String con la ruta y el nombre
     * 
     * si el pathName que le pasemos no exite automaticamente el obejto FileWriter
     * lo creara en el sistema
     * 
     * para escribir utilizamos el metodo write de la calse Filwriter, este 
     * nos permitira escribir lo que le pasemos como parametro en
     * un string o un numero que correspondera a su equivalente en la tabla ASCCI*/
    public static void createFile(String pathName) {
        try {
            FileWriter fileWriter = new FileWriter(pathName);
            fileWriter.write("Archivo creado con exito por yolo");
            fileWriter.close();//tendremos que cerrarlo
            System.out.println("Archivo creado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*para escribir en un fichero de texto ya exitente, simeplemente
     * al crear el objeto FileWriter tenemos que psarle por el contructor
     * un paremtr mas de tipo boolean el cual si le especificamos que es true
     * su valor, le estaremo diciendo que agregaremos texto al archivo, pero si es
     * false o no se lo pasamos simplemente reescirbira el archivo*/
    public static void write(String pathName, String texto) {
        File file = new File(pathName);
        if(file.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(texto);
                fileWriter.close();
                System.out.println("se ha escrito correctamente: " + texto);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("no exiete ningun archivo \"" + pathName + "\"");
        }
    }
    
    /*la clase FileReader nos permitira leer un fichero de texto,
     *al crear un objeto de esta, debemos pasar por parametro ya sea 
     *un objeto de tipo file o por un string la ruta+nombre del archivo
     *
     *si el file no exite lanzara un IOException
     *
     *para leer un fichero de texto con FileReader utilizamos el metodo reader
     *el cual no recibe ningun parametro y nos devolvera un int que tendremos
     *que castear a tipos char y segun la tabla ASCCII tendremo la letra correspondiente
     *de esta manera es que podremos ir leyendo el archivo.
     *Este metodo tambien nos devolvera un -1 cuando ya no ahy mas caracteres para leer
     *de esta forma sabremos que hemos terminado de leer*/
    
    public static void read(String pathName) {
        try {
            FileReader fileReader = new FileReader(pathName);
            int letra = fileReader.read();//obetemos la primer letra
            while (letra != -1) {
                System.out.print((char) letra);
                letra = fileReader.read();/*cuando leemos la primera letra
                el punto se mueve automaticamente por lo que no es necesario hacer 
                nada mas*/
            }
            System.out.println("\nArchivo leido con exito");
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
