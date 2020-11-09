
public class SecondCode {

	public static void main(String[] args) {
		int abc =5; //4bytes
		int $abc_ =7;
		//But you have to give a logical variable name
		int num =10;
		num=8; //once you define this value you also can change it
		
		double percent=5.5d; //double is default point value in java
		float percent1=5.5f;
		
		long l=5l; //8bytes
		short s=5; //2bytes
		byte b=5; //1 byte
		//write 5 in byte to avoid memory wastage
		
		char c='A';
		c=66; //ASCII

		double d1=5; //implicit conversion
		int k=(int)5.6; //type casting-explicit
		System.out.println(k);
		System.out.println(d1);
		System.out.println(abc);
		System.out.println($abc_);
		System.out.println(num);
		System.out.println(c);
		
		System.out.println(percent);
	}

}
