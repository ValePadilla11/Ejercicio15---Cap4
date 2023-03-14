/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15.cap4;

import java.util.Scanner;

public class Ejercicio15Cap4 {

    public static void main(String[] args) {
        double PESOA, PESOB, PESOC,PESOD;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Peso de esfera A: ");
        PESOA = entrada.nextDouble();
        System.out.print("Peso de esfera B: ");
        PESOB = entrada.nextDouble();
        System.out.print("Peso de esfera C: ");
        PESOC = entrada.nextDouble();
        System.out.print("Peso de esfera D: ");
        PESOD = entrada.nextDouble();
        
        if (PESOA==PESOB && PESOA==PESOC){
            if (PESOD > PESOA){
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            }else
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
            
        } else if (PESOA == PESOB && PESOA == PESOD){
            if (PESOC > PESOA){
                System.out.println("LA ESFERA C ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else
                System.out.println("LA ESFERA C ES LA DIFERENTE Y ES DE MENOR PESO");    
        } else if (PESOA == PESOC && PESOA == PESOD){
            if (PESOB > PESOD){
                System.out.println("LA ESFERA B ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else
                System.out.println("LA ESFERA B ES LA DIFERENTE Y ES DE MENOR PESO");
        } else
            if (PESOA > PESOB){
                System.out.println("LA ESFERA A ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else
                System.out.println("LA ESFERA A ES LA DIFERENTE Y ES DE MENOR PESO");
        

    }
    
}
