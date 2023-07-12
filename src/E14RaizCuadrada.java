import java.util.Scanner;
public class E14RaizCuadrada {
    public static void main(String[] args) {
            validacion();

    }

    public static void validacion() {
        Scanner tec = new Scanner(System.in);
        double n = 1;
        double r = 0;
        boolean llave = true;

        while(llave == true){
            System.out.println("Ingrese un numero del 0 al 32,1: ");
            n = tec.nextDouble();

            if(n > 32.1){
                System.out.println("El numero que has ingresado no es valido. Vuelva a ingresar un numero.");
            }
            else{
                llave = operaciones(n, r);
            }
        }
        System.out.println("\nGracias por usar este progrma. Hasta luego!! :D");
        System.out.println("\nFIN DEL PROGRAMA.");
    }
    public static boolean operaciones(double num, double raiz){
        Scanner tec = new Scanner(System.in);
        boolean salida = true;
        double resultado;
        double acumulador = 0;
        int contador = 0;
        double promedio;
        
        while(salida == true){
            if(num < 0){
                System.out.println("El resultado de la suma de las raices cuadraticas obtenidas es: " + acumulador);
                promedio = acumulador / contador;
                System.out.println("El promedio de las ecuaciones es; " + promedio);
                salida = false;
            }
            else{
                resultado = num * num;
                acumulador = acumulador + resultado;
                contador++;
                System.out.println("Vuelva a ingresar un numero del 0 al 32,1: ");
                num = tec.nextDouble();

            }
        }

        return false;
    }
}