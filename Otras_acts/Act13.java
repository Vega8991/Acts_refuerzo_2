public class Act13 {
    private int idAtleta;
    private String nombreAtleta;
    private double tiempoAtleta;

    private static int contadorAtletas = 0;
    private static String seleccion = "Francia";
    private static double tiempoEquipo = 0;

    public Act13(String nombreAtleta, double tiempoAtleta) {
        this.nombreAtleta = nombreAtleta;
        this.tiempoAtleta = tiempoAtleta;
        this.idAtleta = ++contadorAtletas;
        correr100Metros();
    }

    public void correr100Metros() {
        tiempoEquipo += tiempoAtleta;
    }

    public static void seleccionEquipo() {
        System.out.println("Seleccion de atletismo: " + seleccion);
    }

    public static void tiempoTotalEquipo(){
        System.out.println("Tiempo total del equipo: " + tiempoEquipo);
    }
    public void infoAtleta(){
        System.out.println("ID del atleta: " + idAtleta);
        System.out.println("Nombre: " + nombreAtleta);
        System.out.println("Tiempo del atleta: " + tiempoAtleta);

    }

    public static void main(String[] args) {
        Act13 atleta1 = new Act13("Francisco", 11.7);
        Act13 atleta2 = new Act13("Juan", 12.2);
        Act13 atleta3 = new Act13("Manuel", 11.8);
        Act13 atleta4 = new Act13("Adrian", 12.5);
        
        System.out.println("--------------------------------");
        seleccionEquipo();
        System.out.println("--------------------------------");
        atleta1.infoAtleta();
        System.out.println("--------------------------");
        atleta2.infoAtleta();
        System.out.println("--------------------------");
        atleta3.infoAtleta();
        System.out.println("--------------------------");
        atleta4.infoAtleta();
        System.out.println("------------------------------");
        tiempoTotalEquipo();
        System.out.println("------------------------------");
    }
}
