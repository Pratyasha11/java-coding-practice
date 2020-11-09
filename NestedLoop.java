/*
 * * * *
 * * * *
 * * * *
 * * * *
 */

// first step: * * * *
public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i<=4; i++) // to execute the inner for loop four times, we have to use another loop
		{
			for (int j = 1; j <= 4; j++) {
				System.out.print("* "); // ln for new line
			}
			System.out.println();
		}
	}
}
