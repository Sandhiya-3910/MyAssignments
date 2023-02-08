package week1.day1;

public class Car {
	
	public void applybrake() {
		System.out.println("Applied brake");
		
		
	}
	
    public void soundhorn() {
    	System.out.println("Sound horn");
	}
    public static void main(String[] args) {

		Car car_object = new Car();

		car_object.applybrake();
		car_object.soundhorn();
    }
}

