import java.util.Scanner;
public class E4Capicua {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero entero, entre 0 y 9999, para averiguar si es capicua: ");
        num = tec.nextInt();

        if(num < 0 || num > 9999){
            System.out.println("El numero ingresado no es valido, vuelva a ingresarlo");
        }
        else {
            int numOriginal;
            int respaldo= 0;
            int divisor = 1000;
            int multiplicador = 1;
            int cociente= 0;

            numOriginal = num;

            if(num <= 9) {
                divisor = 1;
                while (num != 0) {
                    cociente = num / divisor;
                    num = num % divisor;
                    divisor = divisor / 10;
                    cociente = cociente * multiplicador;
                    multiplicador = multiplicador * 10;
                    respaldo = respaldo + cociente;

                }

                if(respaldo == numOriginal){
                    System.out.println("El numero es Capicuba");
                }
                else{
                    System.out.println("El numero no es Capicuba");
                }
            }
            else if(num <= 99){
                divisor = 10;
                while(num != 0) {
                    cociente = num / divisor;
                    num = num % divisor;
                    divisor = divisor / 10;
                    cociente = cociente * multiplicador;
                    multiplicador = multiplicador * 10;
                    respaldo = respaldo + cociente;

                }

                if(respaldo == numOriginal){
                    System.out.println("El numero es Capicuba");
                }
                else{
                    System.out.println("El numero no es Capicuba");
                }

            }
            else if(num <= 999){
                divisor = 100;
                while(num != 0) {
                    cociente = num / divisor;
                    num = num % divisor;
                    divisor = divisor / 10;
                    cociente = cociente * multiplicador;
                    multiplicador = multiplicador * 10;
                    respaldo = respaldo + cociente;

                }

                if(respaldo == numOriginal){
                    System.out.println("El numero es Capicuba");
                }
                else{
                    System.out.println("El numero no es Capicuba");
                }

            }
            else if(num <= 9999)
                while(num != 0) {
                    cociente = num / divisor;
                    num = num % divisor;
                    divisor = divisor / 10;
                    cociente = cociente * multiplicador;
                    multiplicador = multiplicador * 10;
                    respaldo = respaldo + cociente;

                }

            if(respaldo == numOriginal){
                System.out.println("El numero es Capicuba");
            }
            else{
                System.out.println("El numero no es Capicuba");
            }
            }


        }

    }


