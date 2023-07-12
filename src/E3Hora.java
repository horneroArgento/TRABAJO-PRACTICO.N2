import java.util.Scanner;
public class E3Hora {
    public static void main(String[] args) {
        ingreseHora();
    }
    public static void ingreseHora(){
        Scanner tec = new Scanner(System.in);
        int hora, minutos, segundos;

        System.out.println("Ingrese la hora: ");
        hora = tec.nextInt();
        System.out.println("Ingrese los minutos: ");
        minutos = tec.nextInt();
        System.out.println("Ingrsese los segundos: ");
        segundos = tec.nextInt();

        determinarHora(hora, minutos, segundos);
    }

    public static void determinarHora(int hor, int min, int seg){
        if(seg > 59){
            System.out.println("Los segundos no pueden sobrepasar el valor de: 59. Vuelva a ingresar la hora: ");
            ingreseHora();
        }
        else if(min > 59){
            System.out.println("Los minutos no pueden sobrepasar el valor de: 59. Vuelva a ingresar la hora: ");
            ingreseHora();
        }
        else if(hor > 23){
            System.out.println("Las horas no pueden sobrepasar el valor de: 23. Vuelva a ingresar la hora: ");
            ingreseHora();
        }

        mostrarHora(hor, min, seg);
    }

    public static void mostrarHora(int horas, int minutos, int segundos){
        mostrarOriginal(horas, minutos, segundos);
        segundos = segundos + 1;

        if(segundos == 60){
            segundos = 00;
            minutos = minutos + 1;
        }

        if(minutos == 60){
            minutos = 00;
            horas = horas + 1;
        }

        if(horas == 24){
            horas = 00;
        }



        if(horas < 10){
            if(minutos < 10){
                if(segundos < 10){
                    System.out.println("La hora Ingresada fue: " + "0" + horas + ":" + "0" + minutos  + ":" + "0" + segundos);

                }
            }
            else if(segundos < 10){
                System.out.println("La hora Ingresada fue: " + "0" + horas + ":" + minutos  + ":" + "0" + segundos);

            }
            else{
                System.out.println("La hora Ingresada fue: " + "0" + horas + ":" + minutos  + ":" + segundos);
            }
        }
        else if(segundos < 10){
            if(minutos < 10){
                System.out.println("La hora Ingresada fue: " + horas + ":" + "0" + minutos  + ":" + "0" + segundos);
            }

        }
        else if(minutos < 10){
            System.out.println("La hora Ingresada fue: " + horas + ":" + "0" + minutos  + ":" + segundos);
        }
        else{
            System.out.println("La hora un segundo mas tarde es: " + horas + ":" + minutos  + ":" + segundos);
        }

    }
    public static void mostrarOriginal(int hor, int min, int seg){
        if(seg == 60){
            seg = 00;
            min = min + 1;
        }

        if(min == 60){
            min = 00;
            hor = hor + 1;
        }

        if(hor == 24){
            hor = 00;
        }



        if(hor < 10){
            if(min < 10){
                if(seg < 10){
                    System.out.println("La hora Ingresada fue: " + "0" + hor + ":" + "0" + min  + ":" + "0" + seg);

                }
            }
            else if(seg < 10){
                System.out.println("La hora Ingresada fue: " + "0" + hor + ":" + min  + ":" + "0" + seg);

            }
            else{
                System.out.println("La hora Ingresada fue: " + "0" + hor + ":" + min  + ":" + seg);
            }
        }
        else if(seg < 10){
            if(min < 10){
                System.out.println("La hora Ingresada fue: " + hor + ":" + "0" + min  + ":" + "0" + seg);
            }
            System.out.println("La hora Ingresada fue: " + hor + ":" + min  + ":" + "0" + seg);
        }
        else if(min < 10){
            System.out.println("La hora Ingresada fue: " + hor + ":" + "0" + min  + ":" + seg);
        }
        else{
            System.out.println("La hora un segundo mas tarde es: " + hor + ":" + min  + ":" + seg);
        }
    }

}
