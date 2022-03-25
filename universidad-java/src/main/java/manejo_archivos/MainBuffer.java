package manejo_archivos;


public class MainBuffer {

    public static void main(String[] args) {
        ArchivosConBufferWriter.write("fileWriter.txt", "agregando texto con bufferWrite papa..");
        ArchivosConBufferReader.read("fileWriter.txt");
    }
}
