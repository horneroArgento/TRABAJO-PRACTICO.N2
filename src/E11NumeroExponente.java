import java.util.Objects;
import java.util.Scanner;
public class E11NumeroExponente {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean respuesta = true;

        while(respuesta == true){
            boolean opcionRepetir;
            opcionRepetir = definirNumeros();

            if(opcionRepetir == false){
                respuesta = false;
            }
        }

        System.out.println("FIN DEL PROGRAMA.");
    }
    public static boolean definirNumeros(){
        Scanner tec = new Scanner(System.in);
        int numBase;
        int exponente;
        boolean rep;

        System.out.println("Ingrese el numero base: ");
        numBase = tec.nextInt();
        System.out.println("Ingrese el exponente para realizar la operacion: ");
        exponente = tec.nextInt();
        rep = operacion(numBase, exponente);
        return rep;
    }

    public static boolean operacion(int base, int exp){
        double resultado;
        String opc;
        boolean repetir;
        Scanner tec = new Scanner(System.in);

        resultado = Math.pow(base, exp);
        System.out.println("El resultado es: " + resultado);

        System.out.println("Desea repetir la operacion? <s/n> ");
        opc = tec.nextLine();
        if(Objects.equals(opc, "n")){
            repetir = false;
        }
        else{
            repetir = true;
        }

        return repetir;
    }

}
