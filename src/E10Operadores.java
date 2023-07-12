import java.util.Objects;
import java.util.Scanner;
public class E10Operadores {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String operador = null;
        int operador1 = 1;
        int operador2;
        int resultado;

        while (operador1 != 0) {
            System.out.println("Ingrese el primer numero para realizar la operacion: ");
            operador1 = tec.nextInt();

            operador = definirOperador();

            System.out.println("Ingrese el segundo numero para realizar la operacion: ");
            operador2 = tec.nextInt();

            if(operador1 != 0){
                if(Objects.equals(operador, "+")){
                    resultado = operador1 + operador2;
                    System.out.println("El resultado es: " + resultado);
                }
                else if(Objects.equals(operador, "-")){
                    resultado = operador1 - operador2;
                    System.out.println("El resultado es: " + resultado);
                }
                else if(Objects.equals(operador, "*")){
                    resultado = operador1 + operador2;
                    System.out.println("El resultado es: " + resultado);
                }
                else if(Objects.equals(operador, "/")){
                    resultado = operador1 + operador2;
                    System.out.println("El resultado es: " + resultado);
                }
                else{
                    System.out.println("El operador que has ingresado no coincide con los operadores esperados.");
                }
            }



        }
        System.out.println("FIN DEL PROGRAMA.");

    }
    public static String definirOperador (){
        String variable;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el operador logico (+, - ,* y /), en base a la operacion que desee realizar: ");
        variable = tec.nextLine();

        return variable;

    }

}
