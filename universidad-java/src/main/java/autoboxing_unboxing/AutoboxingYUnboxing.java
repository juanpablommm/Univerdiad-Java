package autoboxing_unboxing;

public class AutoboxingYUnboxing {

    public static void main(String[] args) {

//		AUTOBOXING Y UNBOXING

//		El autoboxing es el proceso de comvertir un tipo de dato primitivo
//		a su equivalente en Objecto (Integer, Float, Charater, Double, etc):
        Integer integer = 12;
        Float floatt = 13.909f;
        System.out.println("Integer: " + integer);
        System.out.println("Float: " + floatt);

//		El unboxin es el proceso contrario de convertir un Objeto a su equivalente
//		en tipo primitivo
        int primitivoInt = integer;
        float primitivoFloat = floatt;
        System.out.println("Tipo primitivo int" + primitivoFloat);
        System.out.println("Tipo primitivo float" + primitivoInt);
    }

}
