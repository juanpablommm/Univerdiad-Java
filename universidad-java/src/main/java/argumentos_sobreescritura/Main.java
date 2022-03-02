package argumentos_sobreescritura;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("jhony", "el bravo", 34);
        System.out.println(empleado.descripcion());
        Gerente gerente = new Gerente("juancho", "roiz", 32, "devlopers");
        System.out.println(gerente.descripcion());
    }
}
