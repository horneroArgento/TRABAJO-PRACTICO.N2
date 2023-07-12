import java.util.Scanner;
public class E17EntrenNumeros {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2;

        System.out.println("\nIngrese dos numeros para mostrar por pantallas los numeros que hay entre ellos.");
        System.out.println("Ingrese el primer numero: ");
        num1 = tec.nextInt();
        System.out.println("Ingrese elsegundo numero: ");
        num2 = tec.nextInt();
        mostrarNumeros(num1, num2);
        System.out.println("FIN DEL PROGRAMA.");
    }
    public static void mostrarNumeros(int numero1, int numero2){

        if(numero1 < numero2){
            System.out.println("\n--- "+numero1+" ---");
            for(numero1 = numero1 + 1; numero1 < numero2 ;numero1++ ){
                System.out.println("    "+numero1+"   ");
            }
            System.out.println("--- "+numero2+" ---");
        }
        else if(numero1 > numero2){
            System.out.println("\n--- "+numero1+" ---");
            for(numero1 = numero1 - 1; numero1 > numero2 ;numero1-- ){
                System.out.println("    "+numero1+"   ");
            }
            System.out.println("" +
                    "--- "+numero2+" ---");
        }
    }
}
