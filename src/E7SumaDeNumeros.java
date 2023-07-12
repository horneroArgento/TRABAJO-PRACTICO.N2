import java.util.Scanner;
public class E7SumaDeNumeros {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        int resultado = 0;
        int contador = 1;

        System.out.println("Ingrese un numero para sumarlo: ");
        num = tec.nextInt();

        while(contador <= num){
            if(contador == num){
                System.out.print(contador);
            }
            else{
                System.out.print(contador + " + ");
            }
            resultado = resultado + contador;
            contador++;

        }
        System.out.print(" = " + resultado);
        System.out.println("\nFIN DEL PROGRAMA.");
    }
}
