package array;

public class avg {

	public static void main(String[] args) {
     int num[] = {10,20,30,40};
     double avg = 0;
     for(int i = 0;i<num.length;i++) {
    	  avg = avg + (double)num[i]/num.length;
    	   
    	
     }
     System.out.println("avarage: "+ avg);

	}

}

