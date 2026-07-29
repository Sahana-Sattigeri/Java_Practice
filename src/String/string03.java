package String;

public class string03 {

	public static void main(String[] args) {
		String s = new String("java programming");
//		System.out.println(s.length());
		
		
		
//		String count = "";
//		for(int i = 0; i<s.length();i++) {
//			count += 1;
//			
//		}
//		System.out.println(s.length());
		char[] ch = s.toCharArray();
		int count = 0;
		for(int i = 0;i<ch.length;i++) {
			count ++;
			
		}
		
		System.out.println(count);
		

	}

}
