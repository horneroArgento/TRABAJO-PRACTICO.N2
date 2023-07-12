import java.util.Objects;
import java.util.Scanner;
public class E20DetectorDeVocales {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String car;
        boolean llave = false;

        System.out.println("\nAl ingresar un caracter se determinara si es vocal o no.");
        System.out.println("Si se trata de una vocal se devolvera el valor(TRUE), de lo contrario se devolvera (FALSE).");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("\nIngrese un caracter para determiar si es una vocal: ");
        car = tec.nextLine();
        llave = detector(car);

        System.out.println("\nResultado: ");
        System.out.println("* " +llave);

        System.out.println("\nFIN DEL PROGRAMA.");

    }
    public static boolean detector(String caracter){
        boolean llave = false;

        if(Objects.equals(caracter, "a") || Objects.equals(caracter, "e") || Objects.equals(caracter, "i") || Objects.equals(caracter, "o") || Objects.equals(caracter, "u")){
            llave = true;
        }
        else if(Objects.equals(caracter, "A") || Objects.equals(caracter, "E") || Objects.equals(caracter, "I") || Objects.equals(caracter, "O") || Objects.equals(caracter, "U")){
            llave = true;
        }

        return llave;
    }
}
