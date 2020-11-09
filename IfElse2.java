
public class IfElse2 {

	public static void main(String[] args) {
		
		int n=5;
		if(n==0)
		{
			System.out.println("Nothing");
			System.out.println("Bye");
		}
		
		//if you have more sentences to be printed use curly brackets.
//		You can use them in single sentence too.
		else if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
		
		
	}

}
