import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here 
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		String prompt = reader.nextLine ();
		System.out.println(prompt); //print input by user
	}
	public static void q2() {
		//Write question 2 code here
	Scanner reader = new Scanner(System.in);
       System.out.print("In: ");
       int integer1 = reader.nextInt();
       System.out.print("In: ");
       int integer2 = reader.nextInt();
       System.out.println(integer1 / integer2); //prints division
       System.out.println(integer1 % integer2); //prints remainder

 }

	public static void q3() {
		//Write question 3 code here
	Scanner reader = new Scanner(System.in);
		System.out.print("In: "); //prints in:
		String integerprompt = reader.nextLine(); //reads input from user
		System.out.println(integerprompt + " was the text you wrote"); //print output
	}

	public static void q4() {
		//Write question 4 code here  "Get an integer from user input using "In: " as the prompt. Output the result of the integer times by 5."
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		int integerinput = reader.nextInt();
		System.out.println(integerinput * 5); //multiply input by 5
	}


	

	public static void q5() {
		//Write question 5 code here "Get a boolean using "In: " as the prompt. Output the boolean followed by " is a boolean""
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		boolean booleaninput = reader.nextBoolean();
		System.out.println(booleaninput + " is a boolean"); //prints the input with "is a boolean" after	
		}

	public static void q6() {
		//Write question 6 code here
	//Write question 6 code here "Get a double using "In: " as the prompt. Output the double - 3.2."
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		double doubleinput = reader.nextDouble();
		System.out.println(doubleinput - 3.2); //prints the double
	}

}
	
	


