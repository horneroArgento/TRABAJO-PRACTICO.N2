import java.util.Scanner;
public class E9DetectorDeNumeroPar {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numInicial = 1;
        int numFinal = 1;
        int contador = 0;

        System.out.println("\nIngrese dos numeros enteros para mostrar la cantidad de numeros pares que hay entre ellos.");
        System.out.println("El programa finalizara cuando ingreses un numero inferior a 0.");
        System.out.println("------------------------------------------------------------------------------------------");

        while (numInicial >= 1 && numFinal >= 1) {
            numInicial = 0;
            numFinal = 0;
            contador = 0;
            System.out.println("Ingrese el numero inicial: ");
            numInicial = tec.nextInt();
            System.out.println("Ingrese el numero final: ");
            numFinal = tec.nextInt();

            if (numInicial >= 1 && numFinal >= 1) {

                while (numInicial < numFinal) {
                    if (numInicial % 2 == 0) {
                        contador++;
                    }
                    numInicial++;
                }
                System.out.println("La cantidad de numeros pares es: " + contador);
            }

        }
        System.out.println("FIN DEL PROGRAMA.");
    }
}
