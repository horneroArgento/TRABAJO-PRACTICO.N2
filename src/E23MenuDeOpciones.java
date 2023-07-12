import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class E23MenuDeOpciones {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcion;
        boolean llave = false;

        System.out.println("\nSeleccione la funcion que desee realizar a continuacion: ");
        System.out.println("------------------------------------------------------------");

        while(llave != true){
            System.out.println("\nMENU DE OPCIONES: ");
            System.out.println("1 - DETECTOR DE CANTIDAD DE NUMEROS PARES.");
            System.out.println("2 - DETECTOR DE NUMEROS PRIMOS.");
            System.out.println("3 - DETECTOR DE VOCALES.");
            System.out.println("4 - DETECTOR DE NUMERO MAXIMO.");
            System.out.println("5 - SALIR.");
            opcion = tec.nextInt();

            if(opcion == 1){
                detectorDeNumerosPares();
            }
            else if(opcion == 2){
                detectorDeNumerosPrimos();
            }
            else if(opcion == 3){
                detectorDeVocales();
            }
            else if(opcion == 4){
                numeroMaximo();
            }
            else if(opcion == 5){
                llave = true;
            }
            else{
                System.out.println("La opcion que has ingresado no es valida. Vuelve a intentarlo.");
            }
        }

        System.out.println("\nFIN DEL PROGRAMA.");

    }
    public static void detectorDeNumerosPares(){
        Scanner tec = new Scanner(System.in);
        int numInicial = 1;
        int numFinal = 1;
        int contador = 0;

        System.out.println("\nIngrese dos numeros enteros para mostrar la cantidad de numeros pares que hay entre ellos.");
        System.out.println("El programa finalizara cuando ingreses un numero inferior a 0.");
        System.out.println("------------------------------------------------------------------------------------------");

        while (numInicial >= 1 && numFinal >= 1) {
            numInicial = 0;
            numFinal = 0;
            contador = 0;
            System.out.println("Ingrese el numero inicial: ");
            numInicial = tec.nextInt();
            System.out.println("Ingrese el numero final: ");
            numFinal = tec.nextInt();

            if (numInicial >= 1 && numFinal >= 1) {

                while (numInicial < numFinal) {
                    if (numInicial % 2 == 0) {
                        contador++;
                    }
                    numInicial++;
                }
                System.out.println("La cantidad de numeros pares es: " + contador);
            }

        }
        System.out.println("\nFIN DE LA FUNCION.");
    }
    public static void detectorDeNumerosPrimos(){
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
                detectorDePrimos(num);
            }
            else{
                llave = true;
            }

        }

        System.out.println("\nFIN DE LA FUNCION.");
    }
    public static void detectorDePrimos(int n){
        int contador = 0;

        for(int i = 2; i<= 20; i++){
            if(n != i && n%i == 0){
                contador++;
            }
        }

        if(contador == 0){
            System.out.println("\nEl numero ES primo.");

        }
        else{
            System.out.println("\nEl numero NO es primo:");
        }

    }
    public static void detectorDeVocales(){
        Scanner tec = new Scanner(System.in);
        String car;
        boolean llave = false;

        System.out.println("\nAl ingresar un caracter se determinara si es vocal o no.");
        System.out.println("Si se trata de una vocal se devolvera el valor(TRUE), de lo contrario se devolvera (FALSE).");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("\nIngrese un caracter para determiar si es una vocal: ");
        car = tec.nextLine();
        llave = determinarVocales(car);

        System.out.println("\nResultado: ");
        System.out.println("* " +llave);

        System.out.println("\nFIN DE LA FUNCION.");
    }
    public static boolean determinarVocales(String caracter){
        boolean llave = false;

        if(Objects.equals(caracter, "a") || Objects.equals(caracter, "e") || Objects.equals(caracter, "i") || Objects.equals(caracter, "o") || Objects.equals(caracter, "u")){
            llave = true;
        }
        else if(Objects.equals(caracter, "A") || Objects.equals(caracter, "E") || Objects.equals(caracter, "I") || Objects.equals(caracter, "O") || Objects.equals(caracter, "U")){
            llave = true;
        }

        return llave;
    }
    public static void numeroMaximo(){
        Scanner tec = new Scanner(System.in);
        int num1, num2;

        System.out.println("\nIngrese dos numeros para determinar cual de los dos es el mas grande.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\n Ingrese el primer numero: ");
        num1 = tec.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = tec.nextInt();
        determinarMaximoNumero(num1, num2);

        System.out.println("\nFIN DE LA FUNCION.");
    }
    public static void determinarMaximoNumero(int numero1, int numero2){
        if(numero1 > numero2){
            System.out.println("El numero maximo es: "+ numero1);
        }
        else if(numero1 < numero2){
            System.out.println("El numero maximo es: "+ numero2);
        }
        else{
            System.out.println("Los numeros ingresados son iguales.");
        }
    }

}
