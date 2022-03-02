package com.java.universidad.modificador.protecte;

public class LLamados {

    public static void main(String[] args) {
        
//      PROTECTED
        Persona persona = new Persona("esperanza", "Gomez", 43); //ahora ya podemos acceder a un constructor protecte
//      dado que estamos en una clase que se encuentra en el mismo package

      Persona persona2 = new Persona("juancho");//modificador de acceso publico
      System.out.println(persona2.nombre);
 //tamnien ya es posible acceder a un atributos o metodo con modificador
//      de acceso protected dado que nos encontramos en el mismo package
      
      //se crea una objeto alumno el cual estiende de persona
      Alumno alumno = new Alumno("juan", "juninho", 23, 8120912, "ingenieria");
      System.out.println(alumno.nombre); //ahora ya se pude usar
//      este atributo dado que es protecte, y seguimos en el mismo package
      System.out.println(alumno);
      
    }
}
