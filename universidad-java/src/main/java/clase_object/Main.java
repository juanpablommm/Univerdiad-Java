package clase_object;

public class Main {

    public static void main(String[] args) {
     
        //equals y hasCode
        Empleado  empleado1 = new Empleado("juan", "pablo", 34);
        Empleado  empleado2 = new Empleado("juan", "pablo", 34);
        
        
//        cuando utilizamos == comparamos las referencias
//          en memrias de ambos objetos, diferente a nombreClase@1213
        if(empleado1 == empleado2) {
            System.out.println("tienen la misma referencia en memroia");
        }else {
            System.out.println("Tienen disitnta referencia en memeroia");
        }
        
        if(empleado1.equals(empleado2)) {
            System.out.println("los objectos son iguales en contenido");
        }else {
            System.out.println("los objetos son diferentes en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("tiene el mismo hascode");
            System.out.println(empleado1.hashCode() + " " + empleado2.hashCode());
        }
    }
}
