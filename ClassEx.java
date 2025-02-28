class Car{
	
	String brand;
	int speed;
	
	Car(String brand, int speed)
	{
		this.brand=brand;
		this.speed= speed;
	}
	
	void displayCar()
	{
		System.out.println("Car brand: "+brand);
		System.out.println("Car speed: "+speed);
	}
}
public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car("xyz",30);
		ob.displayCar();
		

	}

}
