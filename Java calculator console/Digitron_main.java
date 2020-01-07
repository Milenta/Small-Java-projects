package mare;
import java.util.Scanner;

public class Digitron_main {

	public static void main(String[] args) {
		Calculator mare = new Calculator();
		
		while(mare.getBroj() < 5){
			mare.calculator();
			if (mare.getBroj() == 5) {
				System.out.println("Good buy.");
				break;
			}
		}
		
	}

}
