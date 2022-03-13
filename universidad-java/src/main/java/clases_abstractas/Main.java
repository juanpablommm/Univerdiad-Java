package clases_abstractas;

public class Main {

    public static void main(String[] args) {
//        FiguraGeometica retangulo = new FiguraGeometica("Retangulo");
//        cabe recordar que cuando utilizamos clases abtractas no se puede realizar
//        una instancea de estas, por ende pueden aber casos en que se definan clases
//        abstractas si ningun metodo abtractto, solamente se crean asi pra que no se creen
//        obtetos de la clase padre
        
        FiguraGeometica rectangulo = new Rectangulo("rectangulo");
        rectangulo.dibujar();
    }
}
