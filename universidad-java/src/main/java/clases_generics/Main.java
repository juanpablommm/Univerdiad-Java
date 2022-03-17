package clases_generics;

public class Main {

    public static void main(String[] args) {
        //llamos al mi clase generic
        ClaseGenerica<Integer> claseGenerica = new ClaseGenerica<Integer>(12);
        claseGenerica.llamar();
    }
}
