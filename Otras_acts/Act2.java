public class Act2 {
	private static String numero;
	private String letra;

	public Act2() {
		numero = "";
		letra = "";
	}

	public Act2(String numero) {
		Act2.numero = numero;

	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getNumero() {
		return numero;
	}

	public String calcLetra() {
		int resta = Integer.parseInt(numero) % 23;
		if (resta == 0) {
			letra = "T";
		} else if (resta == 1) {
			letra = "R";
		} else if (resta == 2) {
			letra = "W";
		} else if (resta == 3) {
			letra = "A";
		} else if (resta == 4) {
			letra = "G";
		} else if (resta == 5) {
			letra = "M";
		} else if (resta == 6) {
			letra = "Y";
		} else if (resta == 7) {
			letra = "F";
		} else if (resta == 8) {
			letra = "P";
		} else if (resta == 9) {
			letra = "D";
		} else if (resta == 10) {
			letra = "X";
		} else if (resta == 11) {
			letra = "B";
		} else if (resta == 12) {
			letra = "N";
		} else if (resta == 13) {
			letra = "J";
		} else if (resta == 14) {
			letra = "Z";
		} else if (resta == 15) {
			letra = "S";
		} else if (resta == 16) {
			letra = "Q";
		} else if (resta == 17) {
			letra = "V";
		} else if (resta == 18) {
			letra = "H";
		} else if (resta == 19) {
			letra = "L";
		} else if (resta == 20) {
			letra = "C";
		} else if (resta == 21) {
			letra = "K";
		} else if (resta == 22) {
			letra = "E";
		}
		return letra;
	}

	public void leer() {
		System.out.println("Numero de DNI: " + numero + "-" + letra);

	}

	public static void main(String[] args) {
		Act2 DNI = new Act2("00395469");
		DNI.calcLetra();
		DNI.leer();
	}
}
