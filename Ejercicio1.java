import java.util.Scanner;
public class Ejercicio1{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        sc.close();
    }

}