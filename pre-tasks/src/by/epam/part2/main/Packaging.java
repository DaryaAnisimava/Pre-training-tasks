package by.epam.part2.main;

public class Packaging {

	private String name;
	private String material;
	private String colour;
	private int quantity;
	private double price;

	public Packaging(String name, String material, String colour, int quantity, double price) {
		super();
		this.name = name;
		this.material = material;
		this.colour = colour;
		this.quantity = quantity;
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Packaging [name=" + name + ", material=" + material + ", colour=" + colour + ", quantity=" + quantity
				+ ", price=" + price + "]\n";
	}

}