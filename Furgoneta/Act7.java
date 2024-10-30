public class Act7 {
	private Act3 motor;
	private Act4 rueda;
	private Act5 ventana;
	private Act6 puerta;

	public Act7() {
		this.motor = new Act3();
		this.rueda = new Act4();
		this.ventana = new Act5();
		this.puerta = new Act6();
	}

	public static void main(String[] args) {
		Act7 furgoneta = new Act7();
		System.out.println("-----------------");
		furgoneta.motor.motorEstado();
		furgoneta.rueda.ruedaEstado();
		furgoneta.ventana.ventanaEstado();
		furgoneta.puerta.puertaEstado();
		furgoneta.puerta.estadoVentana();
		System.out.println("-----------------");
		furgoneta.motor.motorArrancar();
		furgoneta.rueda.ruedaInflar();
		furgoneta.ventana.ventanaAbrir();
		furgoneta.puerta.puertaAbrir();
		furgoneta.puerta.abrirVentana();
		furgoneta.motor.motorEstado();
		furgoneta.rueda.ruedaEstado();
		furgoneta.ventana.ventanaEstado();
		furgoneta.puerta.puertaEstado();
		furgoneta.puerta.estadoVentana();
		System.out.println("-----------------");
		furgoneta.motor.motorApagar();
		furgoneta.rueda.ruedaDesinflar();
		furgoneta.ventana.ventanaCerrar();
		furgoneta.puerta.puertaCerrar();
		furgoneta.puerta.cerrarVentana();
		furgoneta.motor.motorEstado();
		furgoneta.rueda.ruedaEstado();
		furgoneta.ventana.ventanaEstado();
		furgoneta.puerta.puertaEstado();
		furgoneta.puerta.estadoVentana();
		System.out.println("-----------------");
	}
}
