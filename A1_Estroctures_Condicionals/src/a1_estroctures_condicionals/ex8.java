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
public class ex8 {
    public static void main(String[] args) {
<<<<<<< HEAD
         double num1;
         Scanner entrada = new Scanner(System.in);
         System.out.print("introdueix el valor del  numero1: ");
         num1 = entrada.nextDouble();
    if(0<=num1&&num1<3) {
        System.out.print(" Molt dificil "+num1);
     } else {
            if(3<=num1&&num1<5){  
            System.out.print(" Insuficient "+num1);
            }
            else{
                  if(5<=num1&&num1<6){
                  System.out.print(" Suficient "+num1);  
                    }
                   else{
                         if(6<=num1&&num1<7){
                         System.out.print(" Be "+num1);  
                          }
                          else{
                                if(7<=num1&&num1<9){
                                System.out.print(" Notable "+num1);
                                }
                                else{
                                System.out.print(" Extelent "+num1);
                                }
                    }
                    }
                 }
            }
        }       
    }
    

=======
        // Declarar la variable
        double num1,num2,num3;
        Scanner entrada = new Scanner(System.in);
        System.out.print("introdueix el valor del  numero1: ");
        num1 = entrada.nextDouble();
        System.out.print("introdueix el valor del  numero2: ");
        num2 = entrada.nextDouble();
        System.out.print("introdueix el valor del  numero3: ");
        num3 = entrada.nextDouble();
        if (num1==num2&& num1==num3) {
            System.out.print(" son iguals ");
        } else {
            if (num1>num2){
                if (num1>num3){
                    System.out.print(num1+" es mes gran ");
                }else{ 
                    System.out.print(num3+" es mes gran ");
                }
            }else{ 
                if (num2>num3){
                    System.out.print(num2+" es mes gran ");
                }else{ 
                    System.out.print(num3+" es mes gran ");
                }
            }
        }
    }
}
>>>>>>> c4c00cb92a065b26fad2b7312cad7107c5ce6e38
