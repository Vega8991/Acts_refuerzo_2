public class Act5 {
	protected boolean ventana;

	public void ventanaAbrir() {
		ventana = true;
	}

	public void ventanaCerrar() {
		ventana = false;
	}

	public void ventanaEstado() {
		if (ventana == true) {
			System.out.println("Ventana abierta");
		} else {
			System.out.println("Ventana cerrada");
		}
	}
}
