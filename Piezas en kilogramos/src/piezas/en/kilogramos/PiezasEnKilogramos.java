/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piezas.en.kilogramos;

import java.util.Scanner;

import java.util.Arrays;

public class PiezasEnKilogramos {

    public static void main(String[] args) 
    {
double peso = 0 , cpiesas = 0;
        Scanner ra = new Scanner(System.in);
do {
        System.out.println("Escriba el peso por pieza en kilogramos: ");
        peso = ra.nextDouble(); 
       cpiesas = cpiesas + peso;        
}while (peso!=0); 
           System.out.println("El peso total es: "+cpiesas);
Scanner rar = new Scanner(System.in);
        System.out.println("Escriba la cantidad de veces que el peso era de 9.8 ");
       int cveces1 = rar.nextInt();
 Scanner raro = new Scanner(System.in);
        System.out.println("Escriba la cantidad de veces que el peso era de 9.9 ");
       int cveces2 = raro.nextInt();
       Scanner rara = new Scanner(System.in);
        System.out.println("Escriba la cantidad de veces que el peso era de 10 ");
       int cveces3 = rara.nextInt();
       Scanner raros = new Scanner(System.in);
        System.out.println("Escriba la cantidad de veces que el peso era de 10.1 ");
       int cveces4 = raros.nextInt();
       Scanner raras = new Scanner(System.in);
        System.out.println("Escriba la cantidad de veces que el peso era de 10.2 ");
       int cveces5 = raras.nextInt();
           Scanner sonmas = new Scanner(System.in);
        System.out.println("Escriba la cantidad de veces que el peso era mayor a 10.2 ");
       int cveces6 = sonmas.nextInt();
              Scanner sonmenos = new Scanner(System.in);
        System.out.println("Escriba la cantidad de veces que el peso era menor a 9.8 ");
       int cveces7 = sonmenos.nextInt();
      int suma = cveces1+cveces2+cveces3+cveces4+cveces5+cveces6+cveces7;
        System.out.println("La cantidad total de piesas procesadas"+suma);
    }
}

