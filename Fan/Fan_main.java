package mare;

public class Fan_main {

	public static void main(String[] args) {
		
		Fan fan = new Fan("Tesla", 10, "Blue");
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		
	}

}
