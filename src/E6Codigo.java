import java.util.Scanner;
public class E6Codigo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero de ocho digitos: ");
        num = tec.nextInt();

        if(num > 9999999 && num < 99999999) {
            generarCodigo(num);
        }
        else{
            System.out.println("El numero ingresado no es valido");
        }
        System.out.println("FIN DEL PROGRAMA.");
    }
    public static void generarCodigo(int n){
        int resto = 0;

        resto = n % 23;
        

        switch(resto){
            case 0:
                System.out.println(n + "A");
            break;
            case 1:
                System.out.println(n + "Q");
                break;
            case 2:
                System.out.println(n + "Z");
                break;
            case 3:
                System.out.println(n + "S");
                break;
            case 4:
                System.out.println(n + "X");
                break;
            case 5:
                System.out.println(n + "W");
                break;
            case 6:
                System.out.println(n + "D");
                break;
            case 7:
                System.out.println(n + "C");
                break;
            case 8:
                System.out.println(n + "E");
                break;
            case 9:
                System.out.println(n + "F");
                break;
            case 10:
                System.out.println(n + "V");
                break;
            case 11:
                System.out.println(n + "R");
                break;
            case 12:
                System.out.println(n + "G");
                break;
            case 13:
                System.out.println(n + "T");
                break;
            case 14:
                System.out.println(n + "B");
                break;
            case 15:
                System.out.println(n + "H");
                break;
            case 16:
                System.out.println(n + "Y");
                break;
            case 17:
                System.out.println(n + "N");
                break;
            case 18:
                System.out.println(n + "U");
                break;
            case 19:
                System.out.println(n + "M");
                break;
            case 20:
                System.out.println(n + "I");
                break;
            case 21:
                System.out.println(n + "L");
                break;
            case 22:
                System.out.println(n + "O");
                break;
        }

    }
}
