package clases_abstractas;

public class Rectangulo extends FiguraGeometica{

    public Rectangulo(String figura) {
        super(figura);
    }

    @Override
    public void dibujar() {
        System.out.println("dibujando un " + this.getClass().getSimpleName());
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Rectangulo ");
        builder.append(super.toString());
        return builder.toString();
    }
}
