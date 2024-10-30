public class Act11 {

    public int restar(int valor1, int valor2){
        return valor1 - valor2;
    }

    public int restar(int valor1, int valor2, int valor3){
        return valor1 - valor2 - valor3;
    }

    public double restar(double valor1, double valor2){
        return valor1 - valor2;
    }

    public double restar(double valor1, double valor2, double valor3){
        return valor1 - valor2 - valor3;
    }

    public static void main(String[] args) {
        Act11 resta = new Act11();
        System.out.println("Resta de dos int: " + resta.restar(5, 3));
        System.out.println("Resta de tres int: " + resta.restar(6, 3, 1));
        System.out.println("Resta de dos double: " + resta.restar(5.6, 2.4));
        System.out.println("Resta de tres double: " + resta.restar(7.5, 2.5, 4.3));
    }
}