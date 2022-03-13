package clases_abstractas;

//apesar de que una clase no tenga un metodo abstracto eso se hace para
//evitar que se creen objetos de esta clase, sino que se utilicen directamente las clases
//hijas para esto
////*una clase abstracta se utiiliza pra la herencia, pero con la diferencia de que en ella
//podemos crear metodos que no sabes que implemntacion llevaran, esta implemtacion se las dan
//sus clases hijas, mientras que la clase padre solamente se encarga de crearlo
public abstract class FiguraGeometica {

    protected String figura;

    public FiguraGeometica(String figura) {
        this.figura = figura;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

//    si creamos un metodo abstracto, la clase por obligacion tiene que ser abstracta,
//    un metodo abtracto es la creacion de un metodo pero sin su implementacion, puesto
//    que la implementacion se las daran sus clases hijas dependiendo de como lo necesiten
    public abstract void dibujar();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FiguraGeometica [figura=");
        builder.append(figura);
        builder.append("]");
        return builder.toString();
    }
}
