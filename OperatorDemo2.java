
public class OperatorDemo2 {

	public static void main(String[] args) {
		int m=4;
		int n=5;
		
		n+=m; //n=n+m
		n+=3;
//		n++; post increment //n+=1 //n=n+1
		++n; //pre increment
		
//		m = ++n;
		m= n++;
		System.out.println(n);
		System.out.println(m);
	}

}
