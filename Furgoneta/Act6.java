public class Act6 extends Act5 {
	protected boolean puerta;

	public void puertaAbrir() {
		puerta = true;
	}

	public void puertaCerrar() {
		puerta = false;
	}

	public void puertaEstado() {
		if (puerta == true) {
			System.out.println("Puerta abierta");
		} else {
			System.out.println("Puerta cerrada");
		}
	}

	public void abrirVentana() {
		ventanaAbrir();
	}

	public void cerrarVentana() {
		ventanaCerrar();
	}

	public void estadoVentana() {
		ventanaEstado();
	}
}