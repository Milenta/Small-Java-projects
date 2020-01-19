package mare;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getRedy() {
		System.out.println("Get the raw materials.");
		System.out.println("Get the utensils.");
	}

	@Override
	void doDish() {
		System.out.println("Make food from recipe.");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensils.");
	}

}
