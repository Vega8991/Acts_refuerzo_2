public class Act1 {
	private int capacidadMaxima;
	private int cantidadActual;

	public Act1() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}

	public Act1(int cantidadActual) {
		this.cantidadActual = cantidadActual;
		cantidadActual = capacidadMaxima;
	}

	public Act1(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;

		if (cantidadActual > capacidadMaxima) {
			cantidadActual = 1000;
			System.out.println("No se puede superar la cantidad maxima");
		}
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;

	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void llenarTe() {
		cantidadActual = capacidadMaxima;
		System.out.println("Te llenado satisfactoriamente. Cantidad actual: " + cantidadActual);
	}

	public void servirTaza(int cantidadTaza) {
		if (cantidadActual < cantidadTaza) {
			System.out.println("No queda suficiente cantidad para llenar la taza");
		} else {
			cantidadActual -= cantidadTaza;
			System.out.println("Taza servida caballero. Cantidad actual: " + cantidadActual);
		}
	}

	public void vaciarTe() {
		cantidadActual = 0;
		System.out.println("Tetera vaciada. Cantidad actual: " + cantidadActual);
	}

	public void agregarCafe(int anadirCafe) {
		if (anadirCafe + cantidadActual > capacidadMaxima) {
			System.out.println("No se puede agregar a la tetera mas cafe que la capacidad actual permite");
		} else {
			cantidadActual += anadirCafe;
			System.out.println("Cafe anadido satisfactoriamente. Cantidad actual: " + cantidadActual);
		}
	}
}