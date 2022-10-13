import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de euros a convertir: ");
        float euros = sc.nextFloat();
        float pesetas = 166.368f;
        System.out.println(euros + " euros son " + (int)(euros*pesetas) + " pesetas");
        sc.close();
    }
}
