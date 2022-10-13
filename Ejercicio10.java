import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los mb para convertir: ");
        double mb = sc.nextDouble();
        System.out.println(mb + " son " + (mb*1000) + " kb");
        sc.close();
    }
}
