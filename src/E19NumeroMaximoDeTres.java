import java.util.Scanner;

public class E19NumeroMaximoDeTres {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("\nIngrese tres numeros para determinar cual de los tres es el mas grande.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\n Ingrese el primer numero: ");
        num1 = tec.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tec.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = tec.nextInt();
        maximoNumero(num1, num2, num3);

        System.out.println("\nFIN DEL PROGRAMA.");

    }
    public static void maximoNumero(int numero1, int numero2, int numero3){
        if(numero1 >= numero2 && numero1 >= numero3){
            System.out.println("El numero maximo es: "+ numero1);
        }
        else if(numero2 >= numero1 && numero2 >= numero3){
            System.out.println("El numero maximo es: "+ numero2);
        }
        else if(numero3 >= numero1 && numero3 >= numero2){
            System.out.println("El numero maximo es: "+ numero3);
        }
    }

}
