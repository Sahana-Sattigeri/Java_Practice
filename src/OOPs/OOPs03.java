package OOPs;

class Calculator{
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add(int a,int b ) {
		return a+b;
	}
	public double add(double a,int b ) {
		return a+b;
	}
	
	
}

public class OOPs03 {

	public static void main(String[] args) {
		 Calculator obj = new Calculator();
		int result = obj.add(2,  5);
		System.out.println(result);

	}

}
