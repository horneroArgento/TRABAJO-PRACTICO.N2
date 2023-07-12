import java.util.Scanner;

public class E21DetectorDeNumeroPrimo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num = 1;
        boolean llave = false;

        System.out.println("\nIngrese un numero para detectar si se trata de un numero primo: ");
        num = tec.nextInt();

        llave = detector(num);
        System.out.println("El resultado de la operacion es: ");
        System.out.println("* "+llave);

        System.out.println("\nFIN DEL PROGRAMA.");
    }
    public static boolean detector(int n){
        int contador = 0;
        boolean llave = false;

        for(int i = 2; i<= 20; i++){
            if(n != i && n%i == 0){
                contador++;
            }
        }

        if(contador == 0){
            llave = true;

        }

        return llave;
    }

}