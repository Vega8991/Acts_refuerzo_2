public class Act4 {
	protected boolean rueda;

	public void ruedaInflar() {
		rueda = true;
	}

	public void ruedaDesinflar() {
		rueda = false;
	}

	public void ruedaEstado() {
		if (rueda == true) {
			System.out.println("Rueda inflada");
		} else {
			System.out.println("Rueda desinflada");
		}
	}
}
