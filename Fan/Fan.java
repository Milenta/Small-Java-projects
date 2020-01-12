package mare;

public class Fan {

	// state of object
	private String make;
	private double radius;
	private String color;
	private boolean isOn = false;
	private byte speed = 0; // 0 to 5
	
	// creation of object
	// chose variables that are nececery for creation of object
	// we can make or by fan without isOn and speed
	public Fan (String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	public void switchOn() {
		this.isOn = true; 
	}
	
	public void switchOff() {
		this.isOn = false;
	}
	
	public int changeSpeed(byte num) {
		if(this.speed + num > 0) {
		this.speed = (byte) (this.speed + num);
		return speed;
		} else {
			this.speed = 0;
					return 0;
		}
	}

	// print state of object
	public String toString() {
		return String.format("Made by %s, radius is %f, color is %s, is it on %b, speed is %d",
				make, radius, color, isOn, speed) ;
	}

	
}
