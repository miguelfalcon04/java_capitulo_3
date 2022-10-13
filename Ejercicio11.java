import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los kb para convertir: ");
        double kb = sc.nextDouble();
        System.out.println(kb + " son " + (kb/1000) + " mb");
        sc.close();
    }
}
