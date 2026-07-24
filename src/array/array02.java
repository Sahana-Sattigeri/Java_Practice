package array;

public class array02 {

	public static void main(String[] args) {
		
// smallest
		int small[]= { 12,8,15,3,20};
		int min = small[0];
		for(int i = 0 ; i<small.length;i++) {
			if(small[i]<min) {
				min = small[i];
			}
		}
		System.out.println("min: " + min);
	}

}
