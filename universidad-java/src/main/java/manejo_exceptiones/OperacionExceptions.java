package manejo_exceptiones;

/*
 * para que la jdk reconosca nuestra clase como una
exceptions debemos indicarle que hereda de alguna
de las clases de exptions de la API de JAVA, 
si heredamos de expetions entonces nuestra eception
sera de tipo checked, en tiempo de compilacion, pero
si heredamos de RunTimeException nuestra exception
seria de tipo unchecked en timpo de ejecucion*/
public class OperacionExceptions extends Exception{

//    creamos nuestro contructor de acorde a como vamos a manejar
//    la exetions, para saber que parametros le pasaremos a la clase
//    padre (Exception), en este caso solo enviaremos un mensaje de error
//    al constructor de la clase padre, este tiene 4 constructores que podemos
//    utilizar para crear nuestras exceptions, uno con un parametro de tipp String
//    otro en el que podemos pasar la cuasa que origino la extiopm, con un paramtro
//    Throwable , otro con el mensaje y la causa y uno vacio
    public OperacionExceptions(String message) {
        super(message);
    }
    
}
