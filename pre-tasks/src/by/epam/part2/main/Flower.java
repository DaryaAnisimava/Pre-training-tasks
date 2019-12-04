package by.epam.part2.main;

public class Flower {
	private String name;
	private String colour;
	private double length;
	private double price;
	private int quantity;

	public Flower(String name, String colour, double length, double price, int quantity)  {
		super();
		this.name = name;
		this.colour = colour;
		this.length = length;
		setPrice(price);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {

		//if (price < 0) {
		//	throw new Exception("Price can't be less than 0");
		//} else {
			this.price = price;
		//}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity)  {

	//	if (quantity < 0) {
	//		throw new Exception("Quantity can't be less than 0");
	//	} else {
			this.quantity = quantity;
	//	}
	}
	

	@Override
	public String toString() {
		return "Flower [name=" + name + ", colour=" + colour + ", length=" + length + ", price=" + price + ", quantity="
				+ quantity + "]\n";
	}
	}

