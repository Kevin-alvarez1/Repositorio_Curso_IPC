/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial.de.un.numero;

import java.util.*;

public class FactorialDeUnNumero {
      int fact, num=0;
      public void factorial(){

Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        num = entrada.nextInt();
        fact = num;
 for (int i=1; i<num; i++)
 {
     fact=fact*i;
 }
     System.out.println("El factorial del numero " +num+" es igual a "+fact);
 }
     
      public static void main(String[] args) {
FactorialDeUnNumero f = new FactorialDeUnNumero ();
f.factorial();
    }
    
}
