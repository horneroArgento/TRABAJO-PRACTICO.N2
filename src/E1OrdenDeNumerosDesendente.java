import java.util.Scanner;
public class E1OrdenDeNumerosDesendente {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese dos numeros para ordenarlos de forma decendente:");
        num1 = tec.nextInt();
        num2 = tec.nextInt();

        ordenar(num1, num2);
        System.out.println("\nFIN DEL PROGRAMA");

    }
    public static void ordenar(int n1, int n2){
        if(n1 == n2){
            System.out.println("El orden es: " + n1 + ", " + n2);
        }
        else if(n1 < n2){
            System.out.println("El orden es: " + n2 + ", " + n1);
        }
        else{
            System.out.println("El orden es: " + n1 + ", " + n2);
        }
    }
}