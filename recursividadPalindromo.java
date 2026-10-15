package Unidad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class recursividadPalindromo {
   
    public static boolean esPalindromo(String palabra){
        
         //convertir a minusculas y quitar espacios
        String limpia = palabra.replace(" ", "").toLowerCase();
        
        //el primer caracter es 0
        return comprobar(limpia, 0, limpia.length() -1);
    }
    
    private static boolean comprobar(String palabra, int inicio, int fin){
        
        //si el inicio es mayor o igual a fin pues quiere decir que se llego al centro de la palabra
        // y va a retornar que la palabra si es palindromo
        if(inicio>= fin)
            return true;
    
    //si la pareja de letras son distintas no es palindromo
         if(palabra.charAt(inicio)!=palabra.charAt(fin)){
            return false;
         }
           //si la pareja de letras sigue coincidiendo se sigue avanzando y retrocediendo 
         return comprobar (palabra, inicio +1, fin -1);
    }
}




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*ESTE ES EL EJEMPLO DE SUMATORIA QUE SE VIO EN CLASE
    public class recursividadSumatoria {
    
    public static int sumatoria(int x){
        //caso base x==0
        if(x==0){
            return 0;
        }
        //caso recursivo la llamada a sumatoria
        System.out.println("Apilado "+x);
        x=x+sumatoria(x-1);
        System.out.println("desapilado"+x);
        return x;
    }
}*/
    

