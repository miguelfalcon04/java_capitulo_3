import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas esta semana: ");
        double htrabajdas = sc.nextDouble();
        System.out.println("Su salario semanal es de: " + (12*htrabajdas) + " euros");
        sc.close();
    }
}
