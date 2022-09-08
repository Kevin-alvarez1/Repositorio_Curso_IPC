/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package categorizacionmatricula;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Categorizacionmatricula {


    public static void main(String[] args) {
  Scanner teclado = new Scanner (System.in);
    String nombre;
    System.out.print("Ingrese el nombre del postulante: ");
          nombre = teclado.next();
     System.out.println("Facultades disponibles"); 
          System.out.println("1: ingSistemas || importe de matricula es: 350 || mensualidad: 650 ");
                    System.out.println("2: Derecho || importe de matricula es: 300 || mensualidad: 550 ");
          System.out.println("3: IngNaviera || importe de matricula es: 300 || mensualidad: 500 ");
          System.out.println("4: ingpesquera || importe de matricula es: 310 || mensualidad: 460 ");
          System.out.println("5: Contabilidad || importe de matricula es: 280 || mensualidad: 490 ");
          System.out.println("6: Administacion || importe de matricula es : 360 || mensualidad: 520 ");  

   Scanner facultad = new Scanner (System.in);
    int numerofacu;
      System.out.print("Ingrese el nombre de la facultad que desea ingresar: ");
      numerofacu = facultad.nextInt();
      switch(numerofacu){
          case 1: JOptionPane.showMessageDialog(null, "su igv es de 180 || su Monto total es: 1180 ");
          break;
          case 2: JOptionPane.showMessageDialog(null, "su igv es de 153 || su Monto total es: 1003 ");
          break; 
       case 3: JOptionPane.showMessageDialog(null, "su igv es de 144 || su Monto total es: 944 ");
          break;
           case 4: JOptionPane.showMessageDialog(null, "su igv es de 138,6 || su Monto total es: 908,6 ");
          break;
           case 5: JOptionPane.showMessageDialog(null, "su igv es de 138,6 || su Monto total es: 908,6 ");
          break;
           case 6: JOptionPane.showMessageDialog(null, "su igv es de 158,4 || su Monto total es: 1038,4 ");
          break;
          default: JOptionPane.showMessageDialog(null, "La facultad que esta ingresando no existe cheque la lista de opciones");
      } 
    }
    }
