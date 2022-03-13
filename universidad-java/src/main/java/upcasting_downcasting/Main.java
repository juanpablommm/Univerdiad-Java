package upcasting_downcasting;

public class Main {

    public static void main(String[] args) {


        //UPCASTING,  al crear una varible objeto,
//        del tipo de la clase padre, pero instanciado una clase hija,
//        se produce automaticamente el casting, es decir se castea
//        una subclase a la superclase
        Empleado empleado = new Escritor("jhony", "el bravo", 34, TipoEscritura.CLASICA);
        System.out.println(empleado);
        System.out.println(empleado.descripcion());//y solo podremos aceder a los atributos 
//        o metodos del tipo de variable objeto que se declaro, en este caso de la super clase
//        y al aceder a un metodo de la super clase se ejecutara la implemtacion que tenga la
//        instancia, en este caso la clase hija, siempre y cuando halla sobreescrito ese metodo
//        de la clase padre. Pero no podemos aceder algun metodo en partidular de la instancia
//        dado que el tipo de variable objeto es la del padre
        
        empleado = new Gerente("juancho", "roiz", 32, "devlopers");
        System.out.println(empleado);
        System.out.println(empleado.descripcion());
        
        
        //DOWNCASTING
//        ahora bien si queremos acedder a los atributos dede un objeto de una subclase
//        que ha sido declado como tipo de la clase padre tendria que, convirter el tipo
//        de ese objeto al de la misma clase hoja con la que se crea la instancia, 
//        tendriamos que realizar el casting asi esa subclase en especial, pero al ser de
//        tipo mas alto en la jerarquia de clases asia una clase en especifica, tenmos
//        que hacer el casting de manera manual, al igual que sucede con los tipos pritivos
//        que son de mas bytes a unos con menos
        
        Empleado empleado2 = new Escritor("jhony", "el bravo", 34, TipoEscritura.CLASICA);
        System.out.println(empleado2);
        Escritor escritor = (Escritor) empleado2;
        System.out.println(escritor.getTipoEscritura());
        
        
    }

    
}
