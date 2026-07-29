package OOPs;

class calculator{
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
		calculator obj = new calculator();
		int result = obj.add(2,  5);
		System.out.println(result);

	}

}
