package ejercicio1;

public abstract class Instrumento {

	private String name;
	private float price;
	
	public Instrumento(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Instrumento [name=" + name + ", price=" + price + "]";
	}
	
	public abstract void play();
}
