import java.util.Scanner;
public class E5NombreDeNumero {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero entero, del 1 al 99, para mostrar su nombre por pantalla: ");
        num = tec.nextInt();

        if(num >= 1 && num <= 99){
            if(num <= 9){
                unidad(num);
            }
            else{
                decima(num);
            }
        }
        else{
            System.out.println("El numero que has ingresado no se encuentra dentro del margen establecido.");
        }

        System.out.println("FIN DEL PROGRAMA.");

    }
    public static void unidad(int n){
        switch(n){
            case 1:
                System.out.println(n + " = " + "UNO");
            break;
            case 2:
                System.out.println(n + " = " + "DOS");
                break;
            case 3:
                System.out.println(n + " = " + "TRES");
                break;
            case 4:
                System.out.println(n + " = " + "CUATRO");
                break;
            case 5:
                System.out.println(n + " = " + "CINCO");
                break;
            case 6:
                System.out.println(n + " = " + "SEIS");
                break;
            case 7:
                System.out.println(n + " = " + "SIETE");
                break;
            case 8:
                System.out.println(n + " = " + "OCHO");
                break;
            case 9:
                System.out.println(n + " = " + "NUEVE");
                break;
        }
    }

    public static void decima(int n){
        if(n <= 19){
            switch(n){
                case 10:
                    System.out.println(n + " = " + "DIES");
                    break;
                case 11:
                    System.out.println(n + " = " + "ONCE");
                    break;
                case 12:
                    System.out.println(n + " = " + "DOCE");
                    break;
                case 13:
                    System.out.println(n + " = " + "TRECE");
                    break;
                case 14:
                    System.out.println(n + " = " + "CATORCE");
                    break;
                case 15:
                    System.out.println(n + " = " + "QUINCE");
                    break;
                case 16:
                    System.out.println(n + " = " + "DIECISEIS");
                    break;
                case 17:
                    System.out.println(n + " = " + "DIECISIETE");
                    break;
                case 18:
                    System.out.println(n + " = " + "DIECIOCHO");
                    break;
                case 19:
                    System.out.println(n + " = " + "DIECINUEVE");
            }
        }
        if(n <= 29){
            switch(n){
                case 20:
                    System.out.println(n + " = " + "VEINTE");
                    break;
                case 21:
                    System.out.println(n + " = " + "VEINTIUNO");
                    break;
                case 22:
                    System.out.println(n + " = " + "VEINTIDOS");
                    break;
                case 23:
                    System.out.println(n + " = " + "VEINTITRES");
                    break;
                case 24:
                    System.out.println(n + " = " + "VEINTICUATRO");
                    break;
                case 25:
                    System.out.println(n + " = " + "VEINTICINCO");
                    break;
                case 26:
                    System.out.println(n + " = " + "VEINTISEIS");
                    break;
                case 27:
                    System.out.println(n + " = " + "VEINTISIETE");
                    break;
                case 28:
                    System.out.println(n + " = " + "VEINTIOCHO");
                    break;
                case 29:
                    System.out.println(n + " = " + "VEINTINUEVE");
            }
        }
        if(n <= 39){
            switch(n){
                case 30:
                    System.out.println(n + " = " + "TREINTA");
                    break;
                case 31:
                    System.out.println(n + " = " + "TREINTA Y UNO");
                    break;
                case 32:
                    System.out.println(n + " = " + "TREINTA Y DOS");
                    break;
                case 33:
                    System.out.println(n + " = " + "TREINTA Y TRES");
                    break;
                case 34:
                    System.out.println(n + " = " + "TREINTA Y CUATRO");
                    break;
                case 35:
                    System.out.println(n + " = " + "TREINTA Y CINCO");
                    break;
                case 36:
                    System.out.println(n + " = " + "TREINTA Y SEIS");
                    break;
                case 37:
                    System.out.println(n + " = " + "TREINTA Y SIETE");
                    break;
                case 38:
                    System.out.println(n + " = " + "TREINTA Y OCHO");
                    break;
                case 39:
                    System.out.println(n + " = " + "TREINTA Y NUEVE");
            }
        }
        if(n <= 49){
            switch(n){
                case 40:
                    System.out.println(n + " = " + "CUARENTA");
                    break;
                case 41:
                    System.out.println(n + " = " + "CUARENTA Y UNO");
                    break;
                case 42:
                    System.out.println(n + " = " + "CUARENTA Y DOS");
                    break;
                case 43:
                    System.out.println(n + " = " + "CUARENTA Y TRES");
                    break;
                case 44:
                    System.out.println(n + " = " + "CUARENTA Y CUATRO");
                    break;
                case 45:
                    System.out.println(n + " = " + "CUARENTA Y CINCO");
                    break;
                case 46:
                    System.out.println(n + " = " + "CUARENTA Y SEIS");
                    break;
                case 47:
                    System.out.println(n + " = " + "CUARENTA Y SIETE");
                    break;
                case 48:
                    System.out.println(n + " = " + "CUARENTA Y OCHO");
                    break;
                case 49:
                    System.out.println(n + " = " + "CUARENTA Y NUEVE");
            }
        }
        if(n <= 59){
            switch(n){
                case 50:
                    System.out.println(n + " = " + "CINCUENTA");
                    break;
                case 51:
                    System.out.println(n + " = " + "CINCUENTA Y UNO");
                    break;
                case 52:
                    System.out.println(n + " = " + "CINCUENTA Y DOS");
                    break;
                case 53:
                    System.out.println(n + " = " + "CINCUENTA Y TRES");
                    break;
                case 54:
                    System.out.println(n + " = " + "CINCUENTA Y CUATRO");
                    break;
                case 55:
                    System.out.println(n + " = " + "CINCUENTA Y CINCO");
                    break;
                case 56:
                    System.out.println(n + " = " + "CINCUENTA Y SEIS");
                    break;
                case 57:
                    System.out.println(n + " = " + "CINCUENTA Y SIETE");
                    break;
                case 58:
                    System.out.println(n + " = " + "CINCUENTA Y OCHO");
                    break;
                case 59:
                    System.out.println(n + " = " + "CINCUENTA Y NUEVE");
            }
        }
        if(n <= 69){
            switch(n){
                case 60:
                    System.out.println(n + " = " + "SESENTA");
                    break;
                case 61:
                    System.out.println(n + " = " + "SESENTA Y UNO");
                    break;
                case 62:
                    System.out.println(n + " = " + "SESENTA Y DOS");
                    break;
                case 63:
                    System.out.println(n + " = " + "SESENTA Y TRES");
                    break;
                case 64:
                    System.out.println(n + " = " + "SESENTA Y CUATRO");
                    break;
                case 65:
                    System.out.println(n + " = " + "SESENTA Y CINCO");
                    break;
                case 66:
                    System.out.println(n + " = " + "SESENTA Y SEIS");
                    break;
                case 67:
                    System.out.println(n + " = " + "SESENTA Y SIETE");
                    break;
                case 68:
                    System.out.println(n + " = " + "SESENTA Y OCHO");
                    break;
                case 69:
                    System.out.println(n + " = " + "SESENTA Y NUEVE");
            }
        }
        if(n <= 79){
            switch(n){
                case 70:
                    System.out.println(n + " = " + "SETENTA");
                    break;
                case 71:
                    System.out.println(n + " = " + "SESENTA Y UNO");
                    break;
                case 72:
                    System.out.println(n + " = " + "SESENTA Y DOS");
                    break;
                case 13:
                    System.out.println(n + " = " + "SESENTA Y TRES");
                    break;
                case 14:
                    System.out.println(n + " = " + "SESENTA Y CUATRO");
                    break;
                case 15:
                    System.out.println(n + " = " + "SESENTA Y CINCO");
                    break;
                case 16:
                    System.out.println(n + " = " + "SESENTA Y SEIS");
                    break;
                case 17:
                    System.out.println(n + " = " + "SESENTA Y SIETE");
                    break;
                case 18:
                    System.out.println(n + " = " + "SESENTA Y OCHO");
                    break;
                case 19:
                    System.out.println(n + " = " + "SESENTA Y NUEVE");
            }
        }
        if(n <= 89){
            switch(n){
                case 80:
                    System.out.println(n + " = " + "OCHENTA");
                    break;
                case 81:
                    System.out.println(n + " = " + "OCHENTA Y UNO");
                    break;
                case 82:
                    System.out.println(n + " = " + "OCHENTA Y DOS");
                    break;
                case 83:
                    System.out.println(n + " = " + "OCHENTA Y TRES");
                    break;
                case 84:
                    System.out.println(n + " = " + "OCHENTA Y CUATRO");
                    break;
                case 85:
                    System.out.println(n + " = " + "OCHENTA Y CINCO");
                    break;
                case 86:
                    System.out.println(n + " = " + "OCHENTA Y SEIS");
                    break;
                case 87:
                    System.out.println(n + " = " + "OCHENTA Y SIETE");
                    break;
                case 88:
                    System.out.println(n + " = " + "OCHENTA Y OCHO");
                    break;
                case 89:
                    System.out.println(n + " = " + "OCHENTA Y NUEVE");
            }
        }
        if(n <= 99){
            switch(n){
                case 90:
                    System.out.println(n + " = " + "NOVENTA");
                    break;
                case 91:
                    System.out.println(n + " = " + "NOVENTA Y UNO");
                    break;
                case 92:
                    System.out.println(n + " = " + "NOVENTA Y DOS");
                    break;
                case 93:
                    System.out.println(n + " = " + "NOVENTA Y TRES");
                    break;
                case 94:
                    System.out.println(n + " = " + "NOVENTA Y CUATRO");
                    break;
                case 95:
                    System.out.println(n + " = " + "NOVENTA Y CINCO");
                    break;
                case 96:
                    System.out.println(n + " = " + "NOVENTA Y SEIS");
                    break;
                case 97:
                    System.out.println(n + " = " + "NOVENTA Y SIETE");
                    break;
                case 98:
                    System.out.println(n + " = " + "NOVENTA Y OCHO");
                    break;
                case 99:
                    System.out.println(n + " = " + "NOVENTA Y NUEVE");
            }
        }
    }
}