package array;

public class array01 {

	public static void main(String[] args) {
		
		int num[] = {10,25,7,45,18};
		int max = num[0];
		for(int i =0 ; i<num.length;i++) {
		
			if(num[i]>max) {
				max = num[i];
			}
		
			
		}
		System.out.println("max : " + max);
		

	}

}

