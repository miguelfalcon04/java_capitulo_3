import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de pesetas a convertir: ");
        int pesetas = sc.nextInt();
        double euros = 166.368f;
        System.out.println(pesetas + " pesetas son " + Math.ceil(pesetas/euros) + " euros");
        sc.close();
    }
}
