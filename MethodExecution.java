package methodExecution;

import java.util.Scanner;

public class MethodExecution {
	public static void main(String[] args) {
		//Method call
		new MethodExecution().met();
		
		MethodExecution ref=new MethodExecution();//method overloading
		int result=ref.add(45,10);
		System.out.println("Addition is:"+result);
		
		new MethodExecution().takeInput();
	}
	int add(int firstNumber,int secondNumber) {
		return firstNumber+secondNumber;
	}
	        void takeInput() {
	        	Scanner scan=new Scanner(System.in);
	        	System.out.println("Enter two number");
	        	multiply(scan.nextInt(),scan.nextInt());
	        	
	        }
	        void multiply(int firstNumber,int secondNumber) {
	        	int result=firstNumber*secondNumber;
	        	displayOutput(result);
	        }
	        void displayOutput(int result) {
	        	System.out.println("Multiplication:"+result);
	        }
	//method declaration
	void met() {
		System.out.println("Inside met...");
	}
	}