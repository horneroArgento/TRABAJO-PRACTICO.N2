import java.util.Scanner;
public class E15Eco {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int eco;

        System.out.println("Ingrese el numero de veces que desee que se imprima por pantalla la palabra ECO");
        eco = tec.nextInt();

        for(int i = 1; i <= eco; i++){
            System.out.println("Eco...");
        }

        System.out.println("\nFIN DEL PROGRAMA.");
    }
}
