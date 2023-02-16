package ejercicio2;

public class Coche {
	
	private static final String marca="seat";
	private static String modelo = "S600";
	private final int potencia;
	
	public Coche(int potencia) {
		super();
		this.potencia = potencia;
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + "]";
	}
	
	public static void frenar() {
		System.out.println("El vehiculo esta frenando");
	}
	
	public static void acelerar() {
		System.out.println("El vehiculo esta acelerando");
	}
	

}
