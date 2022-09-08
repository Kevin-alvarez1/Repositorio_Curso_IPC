/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casino;

import java.util.Scanner;


public class Casino {


    public static void main(String[] args) {
Scanner ra = new Scanner(System.in);
        System.out.println("Escriba arrojar para lanzar los dados ");
       String lanzar = ra.next();        
int dado1;
int dado2;
int dado3;
dado1 = (int)(Math.random()*6)+1;
dado2 = (int)(Math.random()*6)+1;
dado3 = (int)(Math.random()*6)+1;
        System.out.println("Dado 1: " +dado1);
                System.out.println("Dado 2: " +dado2);
                        System.out.println("Dado 3: " +dado3);
if ((dado1 == 6) && (dado2 == 6) && (dado3 == 6)) {
    System.out.println("Excelente");
}
else if ((dado1 < 6) && (dado2 == 6) && (dado3 == 6)){
    System.out.println("Muy bien ");    
}
else if ((dado1 == 6) && (dado2 < 6) && (dado3 == 6)){
       System.out.println("Muy bien "); 
}
else if ((dado1 == 6) && (dado2 == 6) && (dado3 < 6)){
    System.out.println("Muy bien ");    
}
else if ((dado1 < 6) && (dado2 < 6) && (dado3 == 6)){
    System.out.println("Regular ");    
} 
else if ((dado1 < 6) && (dado2 == 6) && (dado3 < 6)){
    System.out.println("regular ");    
} 
else if ((dado1 == 6) && (dado2 < 6) && (dado3 < 6)){
    System.out.println("regular ");    
}
 else if ((dado1 < 6) && (dado2 < 6) && (dado3 < 6)){
    System.out.println("Pesimo ");       
}
}
}