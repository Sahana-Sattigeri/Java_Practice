
public class ConditionalStatement {

	public static void main(String[] args) {
		
//		wheather the number is positive or not
		 int num1 = -1 ;
		 if(num1 >= 0) {
			 System.out.println("positive");
		 }
		 else {
			 System.out.println("negative");
		 }
		 
//		 wheather the number is odd or even
		 int num = 0;
		 if(num%2 == 0) {
			 System.out.println("even");
		 }
		 else {
			 System.out.println("odd");
		 }
//  find the largest number in the given 3 number
		 int x = 10;
		 int y = 20;
		 int z = 30;
		 if(x>y && x>z) {
			 System.out.println("x is greatest ");
		 }
		 else if(y>x && y>z) {
			 System.out.println("y is greatest");
		 }
		 else {
			 System.out.println("z is greatest ");
		 }
//		 leaf year
		 int year = 2023;
		 if(year%4 == 0) {
			 System.out.println("Leaf year");
		 }
		 else {
			 System.out.println("Not a leaf year");
		 }
//	wheather the number is positive or not using ternary	 
		 int a = 4;
			String result = (a>=0)?"positive":"negative";
		    System.out.println(result);
		    
//calculate discount for shopping:
		    int totalAmount = 100;
		    if(totalAmount>=100) {
		    	System.out.println("After discount "+ (totalAmount-totalAmount*0.20));  		    	
		    }
		    else if(( totalAmount >= 50)&&(totalAmount <=99)) {
		    	System.out.println("After discount "  + (totalAmount - totalAmount*0.10 ));
		    }
		    else if ( totalAmount < 50) {
		    	System.out.println("no discount is applied");
		    }
		    
		    

	}
	

}
