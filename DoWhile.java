
public class DoWhile {

	public static void main(String[] args) {
		/*
		 * Let I want to take input from user
		 * user is giving some no.s like 9, 10 or 100 and I've to print this
		 * If the no. goes beyond 5, I want to stop the execution
		 * in that scenario, even if the user says I just want to print it once
		 * in while loop, if condition is false it won't execute anything
		 * to do this we have to use do while loop
		 */
		
		int i=100;
		do {
			System.out.println("Hello");
			i++;
		}while(i<=5);
	}

}
