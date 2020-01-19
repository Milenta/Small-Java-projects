package mare;

public class RecepieWithMicrowave extends AbstractRecipe {

	@Override
	void getRedy() {
		System.out.println("Get the raw materials.");
		System.out.println("Get the utensils.");
		System.out.println("Turn on the microwavw.");
		
	}

	@Override
	void doDish() {
		System.out.println("Make food from recipe.");
		System.out.println("Put it in the microwave.");
	}

	@Override
	void cleanup() {
		System.out.println("Turn off the microwave.");
		System.out.println("Cleanup the utensils.");
	}

}
