

package com.mycompany.cclowhile;

import java.util.Scanner;


public class Whileasd {

    public static void main(String[] args) {
      Scanner v = new Scanner(System.in);
        int x;
        do{
            System.out.println("Que piso desea ir? [0 para salir] ");
            x = v.nextInt();
            switch(x){
                case 1:
                    System.out.println("Primer piso");
                    System.out.println("Piso de juego");
                    break;
                case 2:
                    System.out.println("Segundo piso");
                    System.out.println("Piso de comidas");
                    break;
                case 3:
                    System.out.println("Tercer piso");
                    System.out.println("Piso Spa");
                    break;
                default:
                    System.out.println("Solo hay 3 pisos");       
            }
        }while(x!=0);
        System.out.println("Gracias Vuelva Pronto");

    }
}
