import java.util.Scanner;
public class E12NumerosPrimos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num = 1;
        boolean llave = false;

        System.out.println("\nIngrese un numero para determinar si se trata de un numero primo o no.");
        System.out.println("El programa finalizara al ingresar un numero inferior a 0.");
        System.out.println("----------------------------------------------------------------------");

        while(llave == false) {
            System.out.println("\nIngrese un numero para detectar si se trata de un numero primo: ");
            num = tec.nextInt();

            if(num > 0){
                detector(num);
            }
            else{
                llave = true;
            }

        }

        System.out.println("\nFIN DEL PROGRAMA.");
    }
    public static void detector(int n){
        int contador = 0;

        for(int i = 2; i<= 20; i++){
            if(n != i && n%i == 0){
                contador++;
            }
        }

        if(contador == 0){
            System.out.println("El numero ES primo.");

        }
        else{
            System.out.println("El numero NO es primo:");
        }

    }
}
