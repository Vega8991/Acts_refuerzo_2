import java.util.Scanner;

public class Act10 {

    //Creamos los metodos de conversion

    public static double metrosAcentimetros(double metros) {
        return metros * 100;
    }

    public static double metrosAmilimetros(double metros) {
        return metros * 1000;
    }

    public static double metrosApulgadas(double metros) {
        return metros * 39.3701;
    }

    public static double metrosApies(double metros) {
        return metros * 3.28084;
    }

    public static double metrosAyardas(double metros) {
        return metros * 1.09361;
    }

    //Hacemos el main de la clase
    public static void main(String[] args) {
    
        //Hacemos el Scanner para meter los parametros que necesitemos desde la terminal
        Scanner sc = new Scanner(System.in);

        //Hacemos un syso y seguidamente la variable metros donde meteremos el scanner
        System.out.println("-----------------------------------");
        System.out.println("Introduzca su parametro en metros: ");
        double metros = sc.nextDouble();

        //Imprimimos por pantalla las conversiones del valor dado en la terminal
        System.out.println("-----------------------------------");
        System.out.println(metros + " Metros equivalen a:");
        System.out.println(metrosAcentimetros(metros) + " Centimetros");
        System.out.println(metrosAmilimetros(metros) + " Milimetros");
        System.out.println(metrosApulgadas(metros) + " Pulgadas");
        System.out.println(metrosApies(metros) + " Pies");
        System.out.println(metrosAyardas(metros) + " Yardas");
        System.out.println("-----------------------------------");
    }
}
