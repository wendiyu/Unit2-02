/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Mar 18 2019
 * Created for: ICS4U
 * Main file for MrCoxallStack program
 *
 ****************************************************************************/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//gets input from user for stack
		Stack userStack = new Stack();
		Scanner userInput = new Scanner(System.in);
		
		do {
			System.out.print("Enter a positive integer to add (-1 to exit the program, -2 to remove number, -3 to clear stack):\n");
			if(userInput.hasNextInt()) {
				int userNum = userInput.nextInt();
				// number for exit the program
				if(userNum == -1) {
					System.out.println("Thank You!");
					break;
				}
				// number for remove numbers
				else if(userNum == -2) {
					userStack.pop();
				}
				// number for clear the stack
				else if(userNum == -3) {
					userStack.clear();
				}
				else if(userNum > -3){
					userStack.push(userNum);
				}
				else {
					System.out.println("Invalid input! Please put a positive number");
				}
			}
			else {
				System.out.println("There has error.");
				break;
			}
			System.out.println("\n");
			
		} while (true);	
	}
}
