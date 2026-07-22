
public class power {

	public static void main(String[] args) {
		int n = 3;
		int sum = 0;

		for(int i = 1; i<=n ; i++) {

			int power = 1;
		for(int j = 1;j<=i;j++) {
			power= power *i;

		}
		sum = sum + power;
		}
		
		System.out.println("sum =" +  sum);
	}

}
