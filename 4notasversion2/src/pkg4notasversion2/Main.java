/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4notasversion2;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
Scanner ra = new Scanner(System.in);
        System.out.println("Ingresa la primera nota");
       float n1 = (float) (ra.nextFloat() * 0.20);
Scanner rar = new Scanner(System.in);
       System.out.println("su nota 1 es: "+n1);
        System.out.println("Ingresa la segunda nota");
       float n2 = (float) (rar.nextFloat() * 0.20);
              System.out.println("su nota 2 es: "+n2);
       Scanner raro = new Scanner(System.in);
        System.out.println("Ingresa la tercera nota");
    float n3 = (float) (raro.nextFloat() * 0.30);
    System.out.println("su nota 3 es: "+n3);
Scanner raros = new Scanner(System.in);     
System.out.println("Ingresa la cuarta nota");
    float n4 = (float) (raros.nextFloat()*0.30);
  System.out.println("su nota 4 es: "+n4);
 float promedio = n1+n2+n3+n4;
       System.out.println("su promedio es: "+promedio);
if (promedio < 60){
    System.out.println("Perdiste");
} 
else if(promedio < 70 ){
    System.out.println("decente");    
}
else if (promedio < 80){
    System.out.println("regular");
}
else if (promedio < 100){
    System.out.println("excelente");
   }
}
}        



