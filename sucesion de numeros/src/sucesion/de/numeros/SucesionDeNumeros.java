/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sucesion.de.numeros;

/**
 *
 * @author Player
 */
public class SucesionDeNumeros {
int a = 5, b=32;
public void proceso(){
    for (int i = 1; i <= 10; i++) {
        System.out.println(a);
        System.out.println(b);
a += 2;
b += 20;
    }
}

    public static void main(String[] args) {
SerieNumeros fc = newSerieNumeros();
fc.proceso();

    }
    
}
