/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_condicionals;

import java.util.Scanner;

/**
 *
 * @author nlo7503
 */
public class ex9corregido {
    public static void main(String[] args) {
        //Crear variables
        int hora_act, min_act, seg_act, hora_aña, min_aña, seg_aña;
        Scanner entrada = new Scanner(System.in);
        //Inicio del programa
        System.out.print("Dime la hora actual: ");
        hora_act = entrada.nextInt();
        System.out.print("Dime los minutos actuales: ");
        min_act = entrada.nextInt();
        System.out.print("Dime los segundos actuales: ");
        seg_act = entrada.nextInt();
        System.out.print("Dime el tiempo que quieres añadir en segundos: ");
        seg_aña = entrada.nextInt();
        //Condicion y fin
        if (seg_aña<60) {
            
        } else {
            min_aña = seg_aña/60;
            seg_aña = seg_aña&60;
            if (min_aña>=60) {
                hora_aña = min_aña/60;
                min_aña = min_aña%60;
            }
            else{
                
            }
        }
    }
}

    
