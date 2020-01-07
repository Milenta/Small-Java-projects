package mare;

import java.util.Scanner;

public class Calculator {

	public static int choise = 0;
	
	public static int getBroj() {
		return choise;
	}
	public static void setBroj(int choise3) {
		
		if (choise3 < 6 && choise3 >0) {
		choise = choise3;
		} else
			System.out.println("Enter number smaler than 6.");
	}
	
	public static void calculator(){
		System.out.print("Chose your first number: ");
				
				Scanner scan = new Scanner(System.in);
				int numOne = scan.nextInt();
				System.out.println("Yor first number is: " + numOne);

				System.out.print("Chose your second number: ");
				int numTwo = scan.nextInt();
				System.out.println("Your second number is: " + numTwo);
				
				System.out.println("By choosing numbers 1 to 5 choose one option: ");
				System.out.println("1 - Addition");
				System.out.println("2 - Subtraction");
				System.out.println("3 - Multiplication");
				System.out.println("4 - Division");
				System.out.println("5 - Exit from application"); 
				
								
				setBroj(scan.nextInt());
				switch(getBroj()){
				case 1 : {
					System.out.printf("%d + %d = %d", numOne, numTwo, numOne + numTwo );
					System.out.println();
					break;
				}
				case 2 : {
					System.out.printf("%d - %d = %d", numOne, numTwo, numOne - numTwo );
					System.out.println();
					break;
				}
				case 3 : {
					System.out.printf("%d * %d = %d", numOne, numTwo, numOne * numTwo ); 
					System.out.println();
					break;
				}
				case 4 : {
					System.out.printf("%d / %d = %d", numOne, numTwo, numOne / numTwo );
					System.out.println();
					break;
				}
				}
		}
	
}


