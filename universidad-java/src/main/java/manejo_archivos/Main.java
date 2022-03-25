package manejo_archivos;

import static manejo_archivos.Archivos.*;

public class Main {

    public static void main(String[] args) {
        var nombre = "createFileUJava";
        createText(nombre);
        
        write(nombre, "Hi, this is my firts file");
        addInformation(nombre, "bey");
        addInformation(nombre, "see you late");
        
        
        Archivos2.createText("archivo con file.txt");
        Archivos2.createFolder("carpetaPreuba");
        System.out.println("\n-------------\nFile information");
        Archivos2.getInformation("carpetaPreuba/J Alvarez - La Pregunta (Official Video).mp3");
        System.out.println("\n-------------\nFolder Information");
        Archivos2.getInformation("carpetaPreuba");
    }
    
}
