import java.util.Scanner;
public class E18NumeroMaximo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2;

        System.out.println("\nIngrese dos numeros para determinar cual de los dos es el mas grande.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\n Ingrese el primer numero: ");
        num1 = tec.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tec.nextInt();
        maximoNumero(num1, num2);

        System.out.println("\nFIN DEL PROGRAMA.");

    }
    public static void maximoNumero(int numero1, int numero2){
        if(numero1 > numero2){
            System.out.println("El numero maximo es: "+ numero1);
        }
        else if(numero1 < numero2){
            System.out.println("El numero maximo es: "+ numero2);
        }
        else{
            System.out.println("Los numeros ingresados son iguales.");
        }
    }
}
