package Hello;

public class Testclass {

	public static void main(String[] args) {
	int a=23;
	int b=45;
	
	System.out.println("before swapping value of a is : "+a);
	System.out.println("before swapping value of b is :"+b);
	
	a=a-b;
	b=a-b;
	a=a+b;
	
	System.out.println("After swapping value of a is : "+a);
	System.out.println("After swapping value of b is : "+b);
	

	}

}
