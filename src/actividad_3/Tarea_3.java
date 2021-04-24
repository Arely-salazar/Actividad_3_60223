/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_3;
import java.util.Scanner;
/**
 *
 * @author Jairo
 */
public class Tarea_3 {
    int suma;
    int factorial;
    int fac;
    int media;
    int numeros;
    int dias;
    int modelo;
//suma del 0 al 10//
    public static void suma(){
    int suma = 0;
    int i;
    for ( i = 1; i <= 10; i++) {
    suma = i + suma ;}
    System.out.println("La suma de los numeros del 1 hasta el 10 es de: " + suma);}
    
// factorial del 1 al 0     
    public static void factorial(){
         int factorial = 1;
         for (int i = 10; i >= 1; i--) {
         factorial *= i;
    }
          System.out.println("El factorial de  10 es de: " + factorial);}
 
//factorial de un número introducido por el usuario
    public static void fac(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introducir un número para calcular su factorial: ") ;
        int num = entrada.nextInt();
      int factorial = 1;
         for (int i = num ; i >= 1; i--) {
         factorial *= i;
    }
         System.out.println("El factorial de " + num +  " es: " + factorial);}
    
 
//calcular la media de una suma del 0 hasta el número introducido por el usuario
    public static void media(){
        int n = 0;
        
       
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros que le gustaria sacar su media: ");
        n = (int) sc.nextDouble();  
        
        double numeros[]= new double[n];
         for(int i = 0; i < n ; i++)
         {
             System.out.println("ingrese el numero : ") ;
             numeros[i]= sc.nextDouble();
         }
             //calcular la media
         double media;
         double suma = 0;
         for (double i: numeros){
         suma = suma+i;
             }
         media = suma / n;
         System.out.println(" la media es: " + media);}
 
// Pedir un número y leer n veces números, realizar la suma de los números, 
//sacar el promedi y determinar cuál número introducido es el mayor y cuál
//el menor, y la distancia numérica entre ellos
    public static void numeros(){
     int num = 0;
        int numeros;
        int suma = 0;
        
        //suma
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de números que desea sumar: ");
        numeros = sc.nextInt();
        System.out.println("ingrese los números: ");
         for (int i = 0; i < numeros; i++) {
            num= sc.nextInt();
            suma = num + suma;}
            System.out.println("La suma de los números es: " + suma);
        //promedio    
        double promedio;
        promedio = (double)suma / (double)numeros;
         System.out.println("El promedio de los números es: " + promedio);
        
        // número mayor y menor
        int mayor = 0, menor= 1 ;
        for (int i = 0; i < numeros; i++) {
            
            if(numeros > mayor){
                mayor = num;}
                
            else if(numeros < menor)
                menor = num;}
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
       
        //diferencia entre el número mayor y menor
        int diferencia;
        diferencia = mayor- menor;
        System.out.println("La diferecnia entre el número mayor y menor es: " + diferencia);
    }
// areglo con los días de la semana
    public static void dias(){
     String dia[]= new String [7];
        dia [0] = "Lunes ";
        dia [1] = "Martes ";
        dia [2] = "Miercoles ";
        dia [3] = "Juevese ";
        dia [4] = "Viernes ";
        dia [5] = "Sabado ";
        dia [6] = "Domingo ";
        
        for (String dias: dia) {
        System.out.print( dias);}
    }
 // modelo del juego gato
    public static void modelo(){
        String modelo[][] = new String[3][3];
        
        for(String vertical[]: modelo){
            for(String horizontal: vertical){
                System.out.print("_" + " ");
            }
            System.out.println("");
            
        }
}  
    }

    
    
    
    

   
    
    
    

