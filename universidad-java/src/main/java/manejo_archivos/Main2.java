package manejo_archivos;


public class Main2 {

    public static void main(String[] args) {
        ArchivosConFileWriterReader.createFile("fileWriter.txt");
        ArchivosConFileWriterReader.write("fileWriter.txt", "segunda linea papa...");
        System.out.println("\n------------Leyendo\n");
        ArchivosConFileWriterReader.read("fileWriter.txt");
    }
    
}
