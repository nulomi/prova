/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1_estroctures_bucles;

/**
 *
 * @author nlo7503
 */
public class ex5_1 {
    public static void main(String[] args) {
    //Crear variable
        int N;
        boolean negativo = false;
        Scanner entrada = new Scanner(System.in);
        //Inicio del programa
        for (int i = 1; i < 101; i++) {
            System.out.print("Dime un número: ");
            N = entrada.nextInt();
            if (N<0) {
                negativo = true;
            }
            if (N==0){
                 System.out.println("Has introducido un número nulo (0), vuelve a ingresar otro número");
                 i--;
            }
        }
        if (negativo=false) {
            System.out.println("No se ha introducido números negativos");
        }
        else{
            System.out.println("Si se ha introducido algún número negativo");
        }

    }
}
