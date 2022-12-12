

package com.mycompany.cclowhile;

//Nicolas laconga

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
     Scanner v = new Scanner(System.in);
        System.out.println("Operario :");
        String nombre  = v.next();
        
        System.out.println("Ingrese el pago por hora");
        float PagoHora = v.nextFloat();
        
        System.out.println("Ingrese la cantidad de horas trabajadas");
        int cantHoras = v.nextInt();
        
        System.out.println("Ingrese el legajos del operario");
        int legajo = v.nextInt();
        
        float sueldoPagar = PagoHora * cantHoras;
        
        System.out.println("Empleado:"+nombre);
        System.out.println("Legajo:"+legajo);
        System.out.println("Sueldo a cobrar:"+sueldoPagar);
        
      
              
        
     
     
    }
}
