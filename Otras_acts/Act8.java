public class Act8 {
    private String titulo;
    private String autor;
    private int num_actores;

    public Act8(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Act8(){
        this.titulo = "";
        this.autor = "";
    }
    
	public int getNum_actores() {
		return num_actores;
	}
	public void setNum_actores(int num_actores) {
		this.num_actores = num_actores;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public static void main(String[] args) {
		Act8 serie = new Act8("Mr.Robot", "Sam Esmail");
		System.out.println("Nombre de la serie: " + serie.getTitulo());
		System.out.println("Autor de la serie: " + serie.getAutor());
		serie.setNum_actores(240);
		System.out.println("Numero de actores de la serie: " + serie.getNum_actores());
	}
}
