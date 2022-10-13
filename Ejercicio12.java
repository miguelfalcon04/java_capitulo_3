import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la nota de su primer exámen: ");
    double nota = sc.nextDouble();
    System.out.print("Introduzca la nota que desea obtener: ");
    double nota2 = sc.nextDouble();
    System.out.println("Necesita sacar un " + (((nota2*100)-(nota*40))/60)  + " en el segundo examen para obtener un " + nota2);
    sc.close();
    }
}
