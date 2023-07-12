import java.util.Scanner;
public class E13TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero para imprimir un triangulo rectangulo por pantalla: ");
        num = tec.nextInt();
        imprimirTriangulo(num);

        System.out.println("FIN DEL PROGRAMA.");

    }
    public static void imprimirTriangulo(int n){
        int loop = n;

        for(int l = 1; l <= loop; l ++){
            String imprimir = "";
            for(int i = 1; i <= n; i++){
                imprimir = imprimir + "*";
                imprimir = imprimir + " ";

            }
            System.out.println(imprimir);
            n = n - 1;
        }

    }
}
