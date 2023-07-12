import java.util.Scanner;
public class E8Multiplos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numInicial = 1;
        int numFinal = 1;
        int multiplo = 3;
        int contador = 0;

        while(numInicial >= 1 && numFinal >= 1){
            contador = 0;
            System.out.println("Ingrese el numero inicial: ");
            numInicial = tec.nextInt();
            System.out.println("Ingrese el numero final: ");
            numFinal = tec.nextInt();

            if(numInicial >= 1 && numFinal >= 1){
                float cociente;

                while(numInicial < numFinal){
                    cociente = multiplo/numInicial;
                    if(numInicial%multiplo == 0 && cociente/1 == 0){
                        contador++;
                    }

                    numInicial++;
                }
                System.out.println("La cantidad de multiplos es: " + contador);
            }

        }
        System.out.println("FIN DEL PROGRAMA.");
    }
}
