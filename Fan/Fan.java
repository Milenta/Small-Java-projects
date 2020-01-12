package mare;

public class Fan {

	// state of object for creation
	private String make;
	private double radius;
	private String color;
	
	// state of object - to change, for methods
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
		setSpeed((byte)1);
	}
	
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	
	public void setSpeed (byte speed) {
		if(this.speed >= 0 && this.speed <= 5 && isOn == true) {
		this.speed = speed;
		} else {
			this.speed = 0;
		}
	}

	// print state of object
	public String toString() {
		return String.format("Made by %s, radius is %f, color is %s, is it on %b, speed is %d",
				make, radius, color, isOn, speed) ;
		// sting.format is used to save memory because otherwise a lot of memory would be used
	}

	
}
