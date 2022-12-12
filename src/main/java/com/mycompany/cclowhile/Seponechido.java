

package com.mycompany.cclowhile;

// Nicolas utilizando IF ELSE Y LENGTH

import java.util.Scanner;


public class Seponechido {

    public static void main(String[] args) {
      
       Scanner v = new Scanner (System.in);
        System.out.println("Ingrese una cadena de caracteres");
        String cadena = v.next();
        System.out.println("Ingrese un numero");
        int num1 = v.nextInt();
        int largo = cadena.length();
        System.out.println(largo);
        if(num1==cadena.length()){
            System.out.println("La cadena es igual al numero");
            
        }else{
            System.out.println("La cadena no es igual al numero ingresado");
        }
        
    }
}
