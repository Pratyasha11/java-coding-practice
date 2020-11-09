
public class TernaryOperator {

	//ternary operator
	//?: -> condition?expr1:expr2
//	the above line means if the condition is true,it will print expr1 
//	and if the condition is false it will execute expr2
//	i.e. j= i>6?1:2;
	public static void main(String[] args) {
		int i=5;
		int j=0;
//		
//		
//		if(i>6)
//			j=1;
//		else
//			j=2;
		
		j = i>6?1:2;
		
		System.out.println(j);
	}

}
