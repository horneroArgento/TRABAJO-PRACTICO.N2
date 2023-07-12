import java.util.Scanner;

public class E16EcoConArgumentos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numero;
        String mj = "Eco...";

        System.out.println("Ingrese el numero de veces que desee que se imprima por pantalla la palabra ECO");
        numero = tec.nextInt();
        mostrarEco(numero, mj);


        System.out.println("\nFIN DEL PROGRAMA.");
    }
    public static void mostrarEco(int eco, String mensaje){
        for (int i = 1; i <= eco; i++) {
            System.out.println(mensaje);
        }
    }
}
