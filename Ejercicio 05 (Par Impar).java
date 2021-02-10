import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
    public static void main(String[] args) {
        parImpar();
    }    

/**
 * Método a modificar. Debe incluir las condiciones 
 * necesarias para que muestre "PAR" o "IMPAR", según el número
 * leído sea par o impar
 */
    public static void parImpar () {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame un número entero: ");
        int num = input.nextInt();

        if (num%2 == 0){
            System.out.print("PAR");
        } else {
            System.out.print("IMPAR");
        }
    }
}
