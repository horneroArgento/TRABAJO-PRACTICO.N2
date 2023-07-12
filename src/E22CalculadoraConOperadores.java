import java.util.Objects;
import java.util.Scanner;
public class E22CalculadoraConOperadores {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2;
        String operador;

        System.out.println("\nIngrese dos numeros, y el tipo de operacion que deseas realizar.");
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("\nAhora ingrese el tipo de operacion que desee realizar, (SUMA, RESTA, MULTIPLICACION o DIVISION): ");
        operador = tec.nextLine();

        System.out.println("\nIngrese el primer numero: ");
        num1 = tec.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tec.nextInt();

        calculadora(num1, num2, operador);

        System.out.println("\nFIN DEL PROGRAMA.");

    }
    public static void calculadora(int numero1, int numero2, String operacion){
        int resultado = 0;

        if(Objects.equals(operacion, "SUMA") || Objects.equals(operacion, "suma") ){
            resultado = numero1 + numero2;
            System.out.println("\nEl resultado es: "+resultado );
        }
        else if(Objects.equals(operacion, "RESTA") || Objects.equals(operacion, "resta")){
            resultado = numero1 - numero2;
            System.out.println("\nEl resultado es: "+resultado );
        }
        else if(Objects.equals(operacion, "MULTIPLICACION") || Objects.equals(operacion, "multiplicacion")){
            resultado = numero1 * numero2;
            System.out.println("\nEl resultado es: "+resultado );
        }
        else if(Objects.equals(operacion, "DIVISION") || Objects.equals(operacion, "division")){
            resultado = numero1 / numero2;
            System.out.println("\nEl resultado es: "+resultado );
        }
        else{
            System.out.println("\nEl resultado es: "+resultado);
        }

    }
}
