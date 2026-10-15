/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author adria
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("escribe palabra: ");
        String palabra = teclado.nextLine();
        
        
        
        if (recursividadPalindromo.esPalindromo(palabra)) {
            System.out.println("si es palindromo");
        } else {
            System.out.println("no es palindromo");
        }
    }
}
    
    /*public static void main(String[] args){
        int valor=recursividadSumatoria.sumatoria(5);
        
        System.out.println("La sumatoria de 5 es: "+ valor);
    }
    
}*/
