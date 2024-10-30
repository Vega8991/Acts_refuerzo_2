public class Act9 {

	private String plato1;
	private Double precioPlato1;
	private String plato2;
	private Double precioPlato2;
	private String bebida;
	private Double precioBebida;
	private String postre;
	private Double precioPostre;

	public Act9(String plato1, Double precioPlato1, String bebida, Double precioBebida) {
		this.plato1 = plato1;
		this.precioPlato1 = precioPlato1;
		this.bebida = bebida;
		this.precioBebida = precioBebida;
	}

	public Act9(String plato1, Double precioPlato1, String plato2, Double precioPlato2, String bebida, Double precioBebida) {
		this.plato1 = plato1;
		this.precioPlato1 = precioPlato1;
		this.plato2 = plato2;
		this.precioPlato2 = precioPlato2;
		this.bebida = bebida;
		this.precioBebida = precioBebida;
	}

	public Act9(String plato1, Double precioPlato1, String plato2, Double precioPlato2, String bebida, Double precioBebida, String postre, Double precioPostre) {
		this.plato1 = plato1;
		this.precioPlato1 = precioPlato1;
		this.plato2 = plato2;
		this.precioPlato2 = precioPlato2;
		this.bebida = bebida;
		this.precioBebida = precioBebida;
		this.postre = postre;
		this.precioPostre = precioPostre;

	}

	public static void main(String[] args) {
		Act9 pedido1 = new Act9("Solomillo al whisky", 8.50, "Cocacola", 2.20);
		Act9 pedido2 = new Act9("Pollo en salsa", 6.70, "Chipiron plancha", 5.60, "Tercio Heineken", 1.95);
		Act9 pedido3 = new Act9("Secreto iberico", 11.90, "Paella", 4.60, "Botella de agua", 1.50, "Tiramisu", 3.50);

		System.out.println("-------------------------");
		System.out.println("PRIMER PEDIDO");
		System.out.println(pedido1.plato1 + " " + pedido1.precioPlato1 + " euros.");
		System.out.println(pedido1.bebida + " " + pedido1.precioBebida + " euros.");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("SEGUNDO PEDIDO");
		System.out.println(pedido2.plato1 + " " + pedido2.precioPlato1 + " euros.");
		System.out.println(pedido2.plato2 + " " + pedido2.precioPlato2 + " euros.");
		System.out.println(pedido2.bebida + " " + pedido2.precioBebida + " euros.");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("TERCER PEDIDO");
		System.out.println(pedido3.plato1 + " " + pedido3.precioPlato1 + " euros.");
		System.out.println(pedido3.plato2 + " " + pedido3.precioPlato2 + " euros.");
		System.out.println(pedido3.bebida + " " + pedido3.precioBebida + " euros.");
		System.out.println(pedido3.postre + " " + pedido3.precioPostre + " euros.");
		System.out.println("-------------------------");
	}
}
