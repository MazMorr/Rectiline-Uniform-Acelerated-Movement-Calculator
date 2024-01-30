import java.util.Scanner;

public class MRUA{
    public static void main(String[]args){
        Scanner MRUA = new Scanner (System.in);
        System.out.println("Bienvenido al algoritmo para calcular un MRUA");
        System.out.println("Introduzca la velocidad inicial: ");
        double VI= MRUA.nextDouble();
        System.out.println("Introduzca la Aceleración: ");
        double A = MRUA.nextDouble();
        System.out.println("Introduzca el tiempo: ");
        double T= MRUA.nextDouble();
        double VF= VI+A*T;
        System.out.println(VF);
    }
}


