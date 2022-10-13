import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base del triángulo (cm): ");
        double b = sc.nextDouble();
        System.out.print("Introduzca la altura del triángulo (cm): ");
        double h = sc.nextDouble();
        System.out.println("El área del triángulo es: " + ((b*h)/2) + " cm²");
        sc.close();
    }
}
