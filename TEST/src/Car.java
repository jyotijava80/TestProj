
public class Car {

	String color;
	String model;
	int price;


	public Car(String color, String model, int price) {
		super();
		this.color = color;
		this.model = model;
		this.price = price;
	}




	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1=new Car("Grey","baleno",7000000);
		Car car2=new Car("Silver","breeza",8000000);
		Car car3=new Car("Red","ertiga",9000000);

		System.out.println("color of car3-->"+ car3.getColor());
		System.out.println("price of car2-->"+car2.getPrice());
	}



}
