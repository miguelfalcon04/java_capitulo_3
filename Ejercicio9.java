import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura (cm): ");
        double altura = sc.nextDouble();
        System.out.print("Introduzca el radio de la base (cm): ");
        double radio = sc.nextDouble();
        System.out.println("El volumen del cono es de: " + ((1.0/3.0)*Math.PI*radio*radio*altura));
        sc.close();
    }
}
