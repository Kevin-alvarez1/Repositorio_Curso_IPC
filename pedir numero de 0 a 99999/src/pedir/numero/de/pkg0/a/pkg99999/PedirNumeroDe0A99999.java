/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedir.numero.de.pkg0.a.pkg99999;
import javax.swing.JOptionPane;

public class PedirNumeroDe0A99999 {
    
    public static void main(String[] args) {
    Double num;
num = Double.parseDouble(JOptionPane.showInputDialog( "Ingrese un numero a partir de 0 a 9999 " ));
if ( num > 0 && num < 10 ) {
    JOptionPane.showMessageDialog(null, " el numero "  +num+ " es de una cifra " ) ;
}
else if ( (num >= 10) && (num < 100) ) {
    JOptionPane.showMessageDialog(null, " el numero " +num+ " es de dos cifras " ) ;
}
else if ( (num >= 100) && (num < 1000) ) {
    JOptionPane.showMessageDialog(null, " el numero " +num+ " es de tres cifras " ) ;
}
 if ( (num >= 1000) && (num < 10000) ) {
    JOptionPane.showMessageDialog(null, " el numero " +num+ " es de cuatro cifras " );
 }
  if ( (num >= 10000) && (num <= 99999) ) {
    JOptionPane.showMessageDialog(null, " el numero " +num+ " es de cuatro cifras " ) ;
    }
    }
}    