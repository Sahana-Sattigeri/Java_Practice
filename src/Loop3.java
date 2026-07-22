
public class Loop3 {

	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		int i = 1;
		
		do {
			sum = sum + i;
			i++;
		}
		while(i<=num);
		System.out.println("sum:"+ sum);
		

	}

}
