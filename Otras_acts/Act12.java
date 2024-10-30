public class Act12 {
    private String titulo;
    private String autor;
    private String palabrasClave;
    private String nombrePublicacion;
    private int anio;
    private String resumen;

    public Act12(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Act12(String titulo, String autor, String palabrasClave, String nombrePublicacion, int anio) {
        this(titulo, autor);
        this.palabrasClave = palabrasClave;
        this.nombrePublicacion = nombrePublicacion;
        this.anio = anio;
    }

    public Act12(String titulo, String autor, String palabrasClave, String nombrePublicacion, int anio,
            String resumen) {
        this(titulo, autor, palabrasClave, nombrePublicacion, anio);
        this.resumen = resumen;
    }

    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras clave: " + palabrasClave);
        System.out.println("Nombre publicacion: " + nombrePublicacion);
        System.out.println("Anio de publicacion: " + anio);
        System.out.println("Resumen: " + resumen);
    }

    public static void main(String[] args) {
        Act12 articulo = new Act12(
                "Lamine yamal lesionado",
                "Manuel Vega",
                "Deporte, Futbol, Barcelona",
                "Revista Todofutbol",
                2024,
                "Lamine Yamal se lesiona durante el clasico, Vinicius Jr le da una zancadilla a Lamine haciendo que este caiga al suelo y lesionandose el femoral derecho");

        articulo.imprimir();
    }
}
