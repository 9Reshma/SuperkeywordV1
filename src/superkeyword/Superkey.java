package superkeyword;
class Vehicle{
	int max_speed_vehicle=120;
	int max_distance_vehicle=500;
	void b() {
		System.out.println("    ----VEHICLE----    ");
		System.out.println("Maximum speed of vehicle:"+max_speed_vehicle);
		System.out.println("Maximun distance of vehicle:"+max_distance_vehicle);
}
}
class Car extends Vehicle{
	int max_speed_car=100;
	int max_distance_car=400;
	void C() {
	super.b();
	System.out.println("     ----CAR----    ");
	System.out.println("Maximum speed of Car:"+max_speed_car);
	System.out.println("Maximun distance of Car:"+max_distance_car);
	}	
}
public class Superkey {

	public static void main(String[] args) {
		Car c=new Car();
		c.C();

	}

}
