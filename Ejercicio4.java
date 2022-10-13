import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        double n1 = sc.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        double n2 = sc.nextDouble();
        System.out.printf ("x = %.1f\n",n1 );
        System.out.printf ("y = %.1f\n",n2);
        System.out.printf ("x + y = %.1f\n", (n1 + n2));
        System.out.printf ("x - y = %.1f\n", (n1 - n2));
        System.out.printf ("x * y = %.1f\n", (n1 * n2));
        System.out.printf ("x / y = %.1f\n", (n1 / n2));
        sc.close();
    }
}
