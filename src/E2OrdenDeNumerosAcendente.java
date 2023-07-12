import java.util.Scanner;
public class E2OrdenDeNumerosAcendente {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Ingrese dos numeros para ordenarlos de forma acendente:");
        num1 = tec.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = tec.nextInt();
        System.out.println("Ingrese otro numero: ");
        num3 = tec.nextInt();

        ordenar(num1, num2, num3);
        System.out.println("\nFIN DEL PROGRAMA");
    }

    public static void ordenar(int n1, int n2, int n3){
        if(n1 <= n2 && n1 <= n3){
            if(n2 <= n3){
                System.out.println("El orden es: " + n1 + ", " + n2 + ", " + n3);
            }
            else{
                System.out.println("El orden es: " + n1 + ", " + n3 + ", " + n2);
            }
        }
        else if(n2 <= n1 && n2 <= n3){
            if(n1 <= n3){
                System.out.println("El orden es: " + n2+ ", " + n1 + ", " + n3);
            }
            else{
                System.out.println("El orden es: " + n2 + ", " + n3 + ", " + n1);
            }
        }
        else if(n3 <= n1 && n3 <= n2){
            if(n1 <= n2){
                System.out.println("El orden es: " + n3+ ", " + n1 + ", " + n2);
            }
            else{
                System.out.println("El orden es: " + n3 + ", " + n2 + ", " + n1);
            }
        }
    }
}
