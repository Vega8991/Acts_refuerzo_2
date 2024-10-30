public class Act3 {
	protected boolean motor;

	public void motorArrancar() {
		motor = true;
	}

	public void motorApagar() {
		motor = false;
	}

	public void motorEstado() {
		if (motor == true) {
			System.out.println("Motor arrancado");
		} else {
			System.out.println("Motor apagado");
		}
	}
}
