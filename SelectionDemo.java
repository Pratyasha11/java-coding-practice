
public class SelectionDemo {

	public static void main(String[] args) {
		int n=6;
//		char n=6; if I will pass char, I can bcz it is ultimately converted to int.
//		we can't use double
		
		
//		if (n==1)
//		System.out.println("one");
//		else if(n==2)
//		System.out.println("two");
//		else if(n==3)
//		System.out.println("three");
//		else if(n==4)
//		System.out.println("four");
//		else if(n==5)
//		System.out.println("five");
		
//		instead of writing such long sentences we can use switch block
		
		switch(n)
		{
		case  1:
			System.out.println("one");	
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
			default:
				System.out.println("No Match");
		}
		
		//if you print 5, it will print 5 only.
		//let's suppose you print 3, it will print three,four & five.
		//when 3 will match, it will print 3 and subsequently all other lines.
		//if you want to print only a particular no, use break.

		
		
		//what if you print 6? It will print nothing
		//Therefore we have to use default
	}

}
