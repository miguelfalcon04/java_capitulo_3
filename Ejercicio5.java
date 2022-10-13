import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura del rectángulo (cm): ");
        double h = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca la base del rectángulo (cm): ");
        double b = Double.parseDouble(System.console().readLine());
        System.out.println("El área del rectangulo es: " + (b*h) + "cm^2");
        sc.close();
    }
}