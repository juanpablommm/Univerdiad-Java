package com.java.universidad.modificador.deafult;

public class H {

    public static void main(String args[]){
        numero(15);

    }
    public static void numero(int n) {
      
        for (int i = 1; i <= n; i++) {
            boolean multiplo3 = false, multiplo5 = false;
            for (int k = 1; k <= i; k++) {
                if((k * 3) == i) {
                    multiplo3 = true;
                }else if((k * 5) == i) {
                    multiplo5 = true;
                }
            }
            if (multiplo3 && multiplo5) {
                System.out.println("multiplo de 3 y 5");
            } else if (multiplo3 && !multiplo5) {
                System.out.println("multiplo de 3");
            }else if (multiplo5 && !multiplo3) {
                System.out.println("multiplo de 5");
            }else if(!multiplo3 && !multiplo5){
                System.out.println(i);
            }
        }
    }

}
